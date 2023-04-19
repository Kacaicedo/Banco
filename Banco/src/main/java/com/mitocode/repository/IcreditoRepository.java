package com.mitocode.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.Credito;


@Repository
public interface IcreditoRepository extends JpaRepository<Credito, Integer>{
	
	//@Query(value = "select * from cliente_productof  as clienteProducto  where id_cliente =:id" ,   nativeQuery = true)
	//Integer getEdadCliente(Integer id);	
	
	@Query(value = "select edad as e from cliente  where id =:id" ,   nativeQuery = true)
	Integer getEdades(Integer id);	
	
	@Query(value = "select cuota_mes from credito  where id =:id" ,   nativeQuery = true)
	Integer getCuota(Integer id);	
}
