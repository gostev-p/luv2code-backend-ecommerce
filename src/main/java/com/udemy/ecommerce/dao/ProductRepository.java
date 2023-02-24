package com.udemy.ecommerce.dao;

import com.udemy.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    // SQL Query: SELECT * FROM product WHERE category_id=?
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    // SQL Query: SELECT * FROM Product p WHERE p.name LIKE CONCAT('%', :name, '%')
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
