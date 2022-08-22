package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Caja;


public interface ICajaService {
	//Metodos del CRUD
		public List<Caja> listarCajas(); //Listar All 
		
		public Caja guardarCaja(Caja caja);	//Guarda un caja CREATE
		
		public Caja cajaXID(String num_referencia); //Leer datos de un caja READ
		
		public Caja actualizarCaja(Caja caja); //Actualiza datos del caja UPDATE
		
		public void eliminarCaja(String num_referencia);// Elimina el caja DELETE
}
