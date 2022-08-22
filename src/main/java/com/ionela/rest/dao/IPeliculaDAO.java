package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula,Long>{

}
