package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Almacen;


public interface IAlmacenDAO extends JpaRepository<Almacen, Long>{

}
