package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {}
