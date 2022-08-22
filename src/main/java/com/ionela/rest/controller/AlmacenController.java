package com.ionela.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ionela.rest.dto.Almacen;
import com.ionela.rest.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	@Autowired
	AlmacenServiceImpl almacenServideImpl;

	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacens() {
		return almacenServideImpl.listarAlmacens();
	}

	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {

		return almacenServideImpl.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenXID(@PathVariable(name = "id") Long id) {

		Almacen almacen_xid = new Almacen();

		almacen_xid = almacenServideImpl.almacenXID(id);

		System.out.println("Almacen XID: " + almacen_xid);

		return almacen_xid;
	}

	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id") Long id, @RequestBody Almacen almacen) {

		Almacen almacen_seleccionado = new Almacen();
		Almacen almacen_actualizado = new Almacen();

		almacen_seleccionado = almacenServideImpl.almacenXID(id);

		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());

		almacen_actualizado = almacenServideImpl.actualizarAlmacen(almacen_seleccionado);

		return almacen_actualizado;
	}

	@DeleteMapping("/almacen/{id}")
	public void eleiminarEmpleado(@PathVariable(name = "id") Long id) {
		almacenServideImpl.eliminarAlmacen(id);
	}

}
