package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.TipoCuenta;

@Repository
public interface ItipoCuentaRepository extends JpaRepository<TipoCuenta, Integer>{

}
