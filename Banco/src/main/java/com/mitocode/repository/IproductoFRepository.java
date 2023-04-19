package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.ProductoF;

@Repository
public interface IproductoFRepository extends JpaRepository<ProductoF, Integer> {

}
