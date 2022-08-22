package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IPeliculaDAO;
import com.ionela.rest.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long id) {
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		iPeliculaDAO.deleteById(id);
	}

}
