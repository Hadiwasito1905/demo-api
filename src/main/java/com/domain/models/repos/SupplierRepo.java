package com.domain.models.repos;

import com.domain.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface SupplierRepo extends CrudRepository<Supplier, Long> {

}
