package com.domain.models.repos;
import com.domain.models.entities.Product;
import org.springframework.data.repository.CrudRepository;
import antlr.collections.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String);
    
}
