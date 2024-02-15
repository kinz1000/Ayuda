package com.example.ejdamdatos24.modelo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ejdamdatos24.modelo.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long>{
	
	//Buscar por otro atributo distinto del identificador
	TipoProducto findByNameTipoProducto(String nombre);
	
	
	//Query que queramos
	@Query (value="select * from tipos_producto where name_tipo_producto like 'P%'", nativeQuery=true)
	List<TipoProducto> findTipoProductoP ();
	
	//Query con JPQL en hibernate HQL
	@Query ("from TipoProducto")
	List<TipoProducto> findTodosTipoProducto();
	
	//La búsqueda de los que empiezan por P
	@Query ("select tp from TipoProducto tp where tp.nameTipoProducto like 'P%'")
	List<TipoProducto> findTiposProductoP();
	
	@Query ("select tp from TipoProducto tp where tp.nameTipoProducto like :nombre")
	TipoProducto findPorNombreTipoProducto (@Param("nombre") String name);
	
	
	
	
	

}
