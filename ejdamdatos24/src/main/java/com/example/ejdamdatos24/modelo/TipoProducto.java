package com.example.ejdamdatos24.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table (name="tipos_producto")
public class TipoProducto {
  @Id
  @GeneratedValue (strategy=GenerationType.IDENTITY)
  @Column (name="id_tipo_producto")
  private Long idTipoProducto;
  
  @Column (name="name_tipo_producto", unique=true, length=100)
  private String nameTipoProducto;
  
  @Transient
  private int objetosCarrito;
  
  
public TipoProducto() {
	super();
	
}

public TipoProducto(Long idTipoProducto, String nameTipoProducto) {
	super();
	this.idTipoProducto = idTipoProducto;
	this.nameTipoProducto = nameTipoProducto;
}



public int getObjetosCarrito() {
	return objetosCarrito;
}

public void setObjetosCarrito(int objetosCarrito) {
	this.objetosCarrito = objetosCarrito;
}

public Long getIdTipoProducto() {
	return idTipoProducto;
}

public void setIdTipoProducto(Long idTipoProducto) {
	this.idTipoProducto = idTipoProducto;
}

public String getNameTipoProducto() {
	return nameTipoProducto;
}

public void setNameTipoProducto(String nameTipoProducto) {
	this.nameTipoProducto = nameTipoProducto;
}

@Override
public String toString() {
	return "TipoProducto [idTipoProducto=" + idTipoProducto + ", nameTipoProducto=" + nameTipoProducto + "]";
}
  

  
}
