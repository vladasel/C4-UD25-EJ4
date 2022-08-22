package com.ionela.rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;




@Entity
@Table(name = "salas")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Pelicula pelicula;

	public Sala(Long id, String nombre, Pelicula pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public Sala(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Sala() {
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}

}
