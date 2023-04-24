package com.mitocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mitocode.entity.Pagos;

@Repository
public interface IpagosRepository  extends JpaRepository<Pagos, Integer>{
	@Query(value = "select  * from cliente  where id =:id" ,   nativeQuery = true)
	Integer getCliente(Integer id);	
	
	@Query(value = "select max (cuotapagar) from pagos where id_credito =:idCredito" ,   nativeQuery = true)
	Integer getCantCuotas(Integer idCredito);	
	
	@Query(value = "select min (saldo) from pagos where id_credito =:id_credito" ,   nativeQuery = true)
	Integer getSaldo(Integer id_credito);
	
	@Query(value = "select min (cuotaspendientes) from pagos where id_credito =:id_credito" ,   nativeQuery = true)
	Integer getCuotasPendientes(Integer id_credito);
	
	/*@Query(value = "select max (cuotapagar) from pagos where id_targeta =:idTargeta" ,   nativeQuery = true)
	Integer getCantCuotasTr(Integer idTargeta);	
	
	@Query(value = "select min (saldo) from pagos where id_targeta =:id_targeta" ,   nativeQuery = true)
	Integer getSaldoTr(Integer id_targeta);
	
	
	@Query(value = "select min (cuotaspendientes) from pagos where id_targeta =:id_targeta" ,   nativeQuery = true)
	Integer getCuotasPendientesTr(Integer id_credito);
	*/
}
