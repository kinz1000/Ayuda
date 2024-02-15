package com.example.ejdamdatos24.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="productos")
public class Producto {
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	@Column (name="id_producto")
	private Long idProducto;
	@Column (name="name_producto")
	private String nameProducto;
	@Column (name="size")
	private String size;
	@ManyToOne
	@JoinColumn (name="tipo_producto_id")
	private TipoProducto tipoProducto;
	

	public Producto() {
		super();
	}


	public Producto(Long idProducto, String nameProducto, String size, TipoProducto tipoProducto) {
		super();
		this.idProducto = idProducto;
		this.nameProducto = nameProducto;
		this.size = size;
		this.tipoProducto = tipoProducto;
	}


	public Long getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}


	public String getNameProducto() {
		return nameProducto;
	}


	public void setNameProducto(String nameProducto) {
		this.nameProducto = nameProducto;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}


	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nameProducto=" + nameProducto + ", size=" + size
				+ ", tipoProducto=" + tipoProducto + "]";
	}
	
	
	
	

}
