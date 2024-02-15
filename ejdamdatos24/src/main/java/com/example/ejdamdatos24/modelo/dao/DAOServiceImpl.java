package com.example.ejdamdatos24.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejdamdatos24.modelo.Cliente;
import com.example.ejdamdatos24.modelo.Producto;
import com.example.ejdamdatos24.modelo.TipoProducto;
import com.example.ejdamdatos24.modelo.repositories.ClienteRepository;
import com.example.ejdamdatos24.modelo.repositories.ProductoRepository;
import com.example.ejdamdatos24.modelo.repositories.TipoProductoRepository;

@Service
public class DAOServiceImpl implements DAOService {
	
	@Autowired
    TipoProductoRepository tipoPr;
	
	@Autowired
	ProductoRepository prodR;
	
	@Autowired
	ClienteRepository clienteR;
    
	@Override
	public List<TipoProducto> findAllTipoProducto() {
		
		return tipoPr.findAll();
	}

	@Override
	public void almacenarTipoProducto(TipoProducto tipoProducto) {
		tipoPr.save(tipoProducto);
		
	}

	@Override
	public void borrarTipoProducto(TipoProducto tipoProducto) {
		tipoPr.delete(tipoProducto);
		
	}

	@Override
	public TipoProducto findOneTipoProducto(Long id) {
		return tipoPr.findById(id).orElse(null);
	}

	@Override
	public void actualizarTipoProducto(TipoProducto tipoProducto) {
		tipoPr.save(tipoProducto);
		
	}

	@Override
	public TipoProducto findPorNombreTipoProducto(String nombre) {
		
		return tipoPr.findByNameTipoProducto(nombre);
	}

	@Override
	public List<TipoProducto> buscarTipoProductoP() {
		
		return tipoPr.findTipoProductoP();
	}

	@Override
	public List<TipoProducto> findTodosTipoProducto() {
		
		return tipoPr.findTodosTipoProducto();
	}

	@Override
	public List<TipoProducto> findTodosTipoProductoP() {
		
		return tipoPr.findTiposProductoP();
	}

	@Override
	public List<Producto> findAllProducto() {
		
		return prodR.findAll();
	}

	@Override
	public void almacenarProducto(Producto p) {
		prodR.save(p);
		
	}

	@Override
	public void borrarProducto(Producto p) {
		prodR.delete(p);
		
	}

	@Override
	public Producto findOneProducto(Long id) {
		
		return prodR.findById(id).orElse(null);
	}

	@Override
	public void actualizarProducto(Producto p) {
		prodR.save(p);
		
	}

	@Override
	public List<Cliente> findAllCliente() {
	
		return clienteR.findAll();
	}

	@Override
	public void almacenarCliente(Cliente c) {
		clienteR.save(c);
		
	}

	
	

}
