package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Almacen;


public interface IAlmacenService {
	//Metodos del CRUD
		public List<Almacen> listarAlmacens(); //Listar All 
		
		public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE
		
		public Almacen almacenXID(Long id); //Leer datos de un almacen READ
		
		public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del almacen UPDATE
		
		public void eliminarAlmacen(Long id);// Elimina el almacen DELETE
}
