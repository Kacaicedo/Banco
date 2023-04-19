package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.TipoCredito;

@Repository
public interface ItipoCreditoRepository extends JpaRepository<TipoCredito, Integer>{

}
