package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.Cliente;

@Repository
public interface IclienteRepository  extends JpaRepository<Cliente, Integer> {

}
