package com.viswa.DepartmentalStoreApplication.repo;

import com.viswa.DepartmentalStoreApplication.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
