package com.example.ejdamdatos24;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejdamdatos24.modelo.Producto;
import com.example.ejdamdatos24.modelo.TipoProducto;
import com.example.ejdamdatos24.modelo.dao.DAOService;

@RestController
@RequestMapping ("/api/producto")
public class ControlProductos {
	@Autowired
	DAOService daoS;
	
	@GetMapping(value="/prodList", produces= {"application/json"})
	public  List<Producto> obtenerProductos() {
		List<Producto> listaProductos= daoS.findAllProducto();
		return listaProductos;		
		
	}
	
	//Inserción de un nuevo producto
		@GetMapping (value="/nuevo", produces= {"application/json"})
		public Producto almacenProducto() {
			
			Producto producto = new Producto (0L,"Tarta de queso","mediana", daoS.findPorNombreTipoProducto("Tarta"));
			daoS.almacenarProducto(producto);
			return producto;
		}
	
	
	
}
