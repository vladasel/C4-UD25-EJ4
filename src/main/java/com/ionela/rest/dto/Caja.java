package com.ionela.rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	private String num_referencia;
	@Column
	private String contenido;
	@Column
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public Caja() {
	}

	public String getNum_referencia() {
		return num_referencia;
	}


	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Almacen")
	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

	
}
