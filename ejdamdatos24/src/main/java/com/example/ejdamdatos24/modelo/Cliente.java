package com.example.ejdamdatos24.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	@Column (name="id_cliente")
	private Long idCliente;
	@Column (name="name_cliente")
	private String nameCliente;
	
	@ManyToMany
	@JoinTable(name="productos_clientes",
	   joinColumns = @JoinColumn (name="cliente_Id"), 
	    inverseJoinColumns= @JoinColumn(name="producto_Id"))

	private List<Producto> listaProducto;
	
	
	public Cliente() {
		super();
	}


	public Cliente(Long idCliente, String nameCliente, List<Producto> listaProducto) {
		super();
		this.idCliente = idCliente;
		this.nameCliente = nameCliente;
		this.listaProducto = listaProducto;
	}


	public Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


	public String getNameCliente() {
		return nameCliente;
	}


	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}


	public List<Producto> getListaProducto() {
		return listaProducto;
	}


	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nameCliente=" + nameCliente + ", listaProducto=" + listaProducto
				+ "]";
	}
	

}
