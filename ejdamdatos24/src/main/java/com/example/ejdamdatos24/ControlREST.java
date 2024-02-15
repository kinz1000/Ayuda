package com.example.ejdamdatos24;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejdamdatos24.modelo.TipoProducto;
import com.example.ejdamdatos24.modelo.dao.DAOService;

@RestController
@RequestMapping ("/api")
public class ControlREST {
	@Autowired
	DAOService daoS;
	
	@GetMapping(value="/prodList", produces= {"application/json"})
	public  List<TipoProducto> obtenerTiposProducto() {
		List<TipoProducto> listaProductos= daoS.findAllTipoProducto();
		return listaProductos;
		
		
	}
	@GetMapping(value="/unProd", produces= {"application/json"})
	public  TipoProducto obtenerUnProducto() {
		TipoProducto unProducto= daoS.findPorNombreTipoProducto("Pastel");
		return unProducto;
		
		
	}

	@GetMapping(value="/productosP", produces= {"application/json"})
	public  List<TipoProducto> obtenerProductosP() {
		List<TipoProducto> listaProductos= daoS.buscarTipoProductoP();
		
		return listaProductos;
		
		
	}
	@GetMapping(value="/prodP", produces= {"application/json"})
	public  List<TipoProducto> obtProductosP() {
		List<TipoProducto> listaProductos= daoS.findTodosTipoProductoP();
		return listaProductos;
		
		
	}
	
	
}
