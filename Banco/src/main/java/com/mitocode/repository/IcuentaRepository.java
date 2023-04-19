package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.Cliente;
import com.mitocode.entity.Cuenta;

@Repository
public interface IcuentaRepository extends JpaRepository<Cuenta, Integer> {

}
