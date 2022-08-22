package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String lugar;
	@Column
	private int capacidad;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen")
	private List<Caja> caja;

	public Almacen(Long id, String lugar, int capacidad, List<Caja> caja) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	public Almacen() {
	}

	public Almacen(String lugar, int capacidad) {
		super();
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public Long getId() {
		return id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

}
