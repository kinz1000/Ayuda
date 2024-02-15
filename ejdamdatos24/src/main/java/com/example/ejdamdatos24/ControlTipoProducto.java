package com.example.ejdamdatos24;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ejdamdatos24.modelo.TipoProducto;
import com.example.ejdamdatos24.modelo.dao.DAOService;

@Controller
public class ControlTipoProducto {
	
	@Autowired
	DAOService daoS;
	
	@GetMapping (value="/")
	public String indice() {
		
		return "index";
	}
	
	@GetMapping (value="/listadoTipoProducto")
	public String getTipoProductosList(Model model) {
		List<TipoProducto> tipoProductoList= new ArrayList<TipoProducto>();
		//Obtener de la base de datos todos los elementos
		tipoProductoList= daoS.findAllTipoProducto();
		model.addAttribute("listadotipos",tipoProductoList.toString() );
		return "tiposproductolist";
	}
	
	//Inserción de un nuevo elemento
	@GetMapping (value="/nuevo")
	public String almacenTipoProducto() {
		
		TipoProducto tipoProducto = new TipoProducto (0L, "Bizcochos");
		daoS.almacenarTipoProducto(tipoProducto);
		return "generico";
	}
	
	//Borrado de un elemento
	@GetMapping (value ="/borrado")
	public String deleteTipoProducto() {
		TipoProducto tipoProducto = new TipoProducto (8L, "Bizcochos");
		daoS.borrarTipoProducto(tipoProducto);
		return "generico";
		
	}
	
	//Update de un elemento
	@GetMapping (value="/actualizar")
	public String actualizarTipoProducto () {
		TipoProducto tipoProducto = daoS.findOneTipoProducto(7L);
		System.out.println(tipoProducto);
		tipoProducto.setNameTipoProducto("Otra cosa distinta");
		daoS.actualizarTipoProducto(tipoProducto);
		return "generico";
	}

}
