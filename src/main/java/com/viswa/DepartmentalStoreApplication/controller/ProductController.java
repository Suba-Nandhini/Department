package com.viswa.DepartmentalStoreApplication.controller;


import com.viswa.DepartmentalStoreApplication.model.Product;
import com.viswa.DepartmentalStoreApplication.repo.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


@NoArgsConstructor
@AllArgsConstructor
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/create_product")
    public void createProduct(@RequestBody Product product){
        productRepo.save(product);
    }
}
