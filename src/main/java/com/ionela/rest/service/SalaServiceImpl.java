package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.ISalaDAO;
import com.ionela.rest.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(Long id) {
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		iSalaDAO.deleteById(id);
	}

}
