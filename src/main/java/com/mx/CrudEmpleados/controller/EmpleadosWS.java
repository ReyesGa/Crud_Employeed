package com.mx.CrudEmpleados.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.CrudEmpleados.dominio.Empleados;
import com.mx.CrudEmpleados.servicio.EmpleadoServImp;

//Estereotipos o anotaciones
@RestController
@RequestMapping("EmpleadosWS")
@CrossOrigin
public class EmpleadosWS {
	// @RestController---Nos permite marcar como control de solicitudes y se utiliza
	// para crear servicios web res full -- web service de tipo res

	// @RequestMapping -- Se utiliza para asignar solicitudes web a los entonrnos de
	// spring

	// @CrossOrigin --- Es por la seguridad que permite resgringir los recursos
	// implementados en los navegadores

	// Inyeccion de dependencias
	@Autowired
	EmpleadoServImp empleadoServImp;

	// URL: url del servidor local + path de la clase + path del metodo

	// Listar
	// http://localhost:9000/EmpleadosWS/listarr
	@GetMapping("listarr")
	public List<Empleados> listarr() {
		List<Empleados> listaEmp = empleadoServImp.listar();
		return listaEmp;
	}

	// Guardar
	// http://localhost:9000/EmpleadosWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Empleados empleado) {
		empleadoServImp.guardar(empleado);
	}

	// Buscar
	// http://localhost:9000/EmpleadosWS/buscar
	@PostMapping("buscar")
	public Empleados buscar(@RequestBody Empleados empleado) {
		return empleadoServImp.buscar(empleado);
	}

	// Editar
	// http://localhost:9000/EmpleadosWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Empleados empleado) {
		empleadoServImp.editar(empleado);
	}

	// Eliminar
	// http://localhost:9000/EmpleadosWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empleados empleado) {
		empleadoServImp.eliminar(empleado);
	}

	// Buscar nombre
	// http://localhost:9000/EmpleadosWS/findByNombre
	@PostMapping("findByNombre")
	public Empleados findByNombre(@RequestBody Empleados empleado) {
		empleado = empleadoServImp.findByNombre(empleado);
		return empleado;	
	}
	
	// Listar por nombre
	//http://localhost:9000/EmpleadosWS/listarByNombre
	@PostMapping("listarByNombre")
	public Empleados listarByNombre (@RequestBody Empleados empleado) {
		return empleadoServImp.findByNombre(empleado);
		
	}
}
