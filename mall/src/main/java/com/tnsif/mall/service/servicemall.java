package com.tnsif.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.mall.entity.Mall;
import com.tnsif.mall.repository.repositorymall;

@Service
public class servicemall {

    @Autowired
    repositorymall repo;

    public servicemall(repositorymall repo) {
        this.repo = repo;
    }

    public Mall addMall(Mall mall) {
        return repo.save(mall);
    }

    public List<Mall> getAllMalls() {
        return repo.findAll();
    }

    public Mall getMallById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Mall updateMall(int id, Mall mall) {
        mall.setId(id);
        return repo.save(mall);
    }

    public void deleteMall(int id) {
        repo.deleteById(id);
    }
}