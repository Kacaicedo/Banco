package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.Targeta;

@Repository
public interface ItargetaRepository extends JpaRepository<Targeta, Integer> {

}
