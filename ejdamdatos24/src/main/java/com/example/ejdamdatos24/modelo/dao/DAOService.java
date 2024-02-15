package com.example.ejdamdatos24.modelo.dao;

import java.util.List;

import com.example.ejdamdatos24.modelo.Cliente;
import com.example.ejdamdatos24.modelo.Producto;
import com.example.ejdamdatos24.modelo.TipoProducto;

public interface DAOService {
	//Nombres de métodos para acceder a TipoProducto
	List<TipoProducto> findAllTipoProducto();
	void almacenarTipoProducto(TipoProducto tipoProducto);
	void borrarTipoProducto (TipoProducto tipoProducto);
	TipoProducto findOneTipoProducto (Long id);
	void actualizarTipoProducto(TipoProducto tipoProducto);
	
	TipoProducto findPorNombreTipoProducto(String nombre);
	
	List<TipoProducto> buscarTipoProductoP ();
	
	List<TipoProducto> findTodosTipoProducto();
	List<TipoProducto> findTodosTipoProductoP();
	
	
	//Métodos para utilizar productos
	List<Producto> findAllProducto();
	void almacenarProducto(Producto p);
	void borrarProducto(Producto p);
	Producto findOneProducto (Long id);
	void actualizarProducto (Producto p);
	
	
	//Métodos para utilizar clientes
	List<Cliente> findAllCliente();
	void almacenarCliente(Cliente c);

	
	

}
