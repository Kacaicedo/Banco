package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.TipoTargeta;

@Repository
public interface ItipoTargetaRepository extends JpaRepository<TipoTargeta, Integer> {

}
