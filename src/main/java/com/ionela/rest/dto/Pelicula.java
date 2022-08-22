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
@Table(name = "peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	int calificacion_edad;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	private List<Sala> salas;

	
	public Pelicula(Long id, String nombre, int calificacion_edad, List<Sala> salas) {
		this.id = id;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
		this.salas = salas;
	}

	public Pelicula(Long id, String nombre, int calificacion_edad) {
		this.id = id;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
	}

	public Pelicula() {
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

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return salas;
	}

	public void setSala(List<Sala> sala) {
		this.salas = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + ", sala="
				+ salas + "]";
	}

	

	
	

}
