package com.mx.CrudEmpleados.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mx.CrudEmpleados.dao.EmpleadosDao;
import com.mx.CrudEmpleados.dominio.Empleados;

@Service // Para indicar que realizaremos un servico
public class EmpleadoServImp implements EmpleadoServ {

	// Inyeccion de dependencia --- @Autowired --- permite tener un mejor control de
	// los objetos que se inicializan
	@Autowired
	EmpleadosDao empleadosDao;

	@Transactional
	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleado);
	}

	@Transactional
	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleado);
	}

	@Transactional
	@Override
	public void eliminar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.delete(empleado);
	}

	@Transactional(readOnly = true)
	@Override
	public Empleados buscar(Empleados empleado) {
		// TODO Auto-generated method stub
		Empleados emplead = empleadosDao.findById(empleado.getId()).orElse(null);
		return emplead;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		List<Empleados> listaEmp = empleadosDao.findAll();
		return listaEmp;
	}

	@Transactional(readOnly = true)
	@Override
	public Empleados findByNombre(Empleados empleado) {
		// TODO Auto-generated method stub
		Empleados empleadoa = new Empleados();
		for(Empleados empl:empleadosDao.findAll()) {
			if(empl.getNombre().equals(empleado.getNombre())) {
				empleadoa = empl;
			}
		}
		
		return empleadoa;
	}

	@Override
	public List<Empleados> listarByNombre(String nombre) {
		// TODO Auto-generated method stub
		List<Empleados> listaEmp = empleadosDao.findByNombre(nombre);
		return listaEmp;
	}

}
