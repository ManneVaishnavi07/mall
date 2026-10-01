package com.tnsif.mall.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.mall.entity.Mall;
import com.tnsif.mall.service.servicemall;

@RestController
@RequestMapping("/mall")
public class controllermall {

    @Autowired
    servicemall service;

    @PostMapping("/addmall")
    public Mall addMall(@RequestBody Mall mall) {
        return service.addMall(mall);
    }

    @GetMapping("/allmalls")
    public List<Mall> getAllMalls() {
        return service.getAllMalls();
    }

    @GetMapping("/{id}")
    public Mall getMallById(@PathVariable int id) {
        return service.getMallById(id);
    }

    @PutMapping("/{id}")
    public Mall updateMall(@PathVariable int id, @RequestBody Mall mall) {
        return service.updateMall(id, mall);
    }

    @DeleteMapping("/{id}")
    public String deleteMall(@PathVariable int id) {
        service.deleteMall(id);
        return "Mall deleted successfully";
    }
}