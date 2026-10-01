package com.tnsif.mall.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.mall.entity.Mall;

@Repository
public interface repositorymall extends JpaRepository<Mall, Integer> {

}