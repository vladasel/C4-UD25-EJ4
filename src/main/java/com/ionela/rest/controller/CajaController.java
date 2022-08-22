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

import com.ionela.rest.dto.Caja;
import com.ionela.rest.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {
	@Autowired
	CajaServiceImpl cajaServideImpl;

	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServideImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Caja salvarCaja(@RequestBody Caja caja) {

		return cajaServideImpl.guardarCaja(caja);
	}

	@GetMapping("/caja/{num_referencia}")
	public Caja cajaXID(@PathVariable(name = "num_referencia") String num_referencia) {

		Caja caja_xid = new Caja();

		caja_xid = cajaServideImpl.cajaXID(num_referencia);

		System.out.println("Caja XID: " + caja_xid);

		return caja_xid;
	}

	@PutMapping("/cajas/{num_referencia}")
	public Caja actualizarCaja(@PathVariable(name = "num_referencia") String num_referencia, @RequestBody Caja caja) {

		Caja caja_seleccionado = new Caja();
		Caja caja_actualizado = new Caja();

		caja_seleccionado = cajaServideImpl.cajaXID(num_referencia);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());

		caja_actualizado = cajaServideImpl.actualizarCaja(caja_seleccionado);

		return caja_actualizado;
	}

	@DeleteMapping("/cajas/{num_referencia}")
	public void eleiminarEmpleado(@PathVariable(name = "num_referencia") String num_referemcia) {
		cajaServideImpl.eliminarCaja(num_referemcia);
	}

}
