package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IAlmacenDAO;

import com.ionela.rest.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacens() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long id) {
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		iAlmacenDAO.deleteById(id);
	}

}
