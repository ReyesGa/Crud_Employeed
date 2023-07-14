package com.mx.CrudEmpleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mx.CrudEmpleados.dominio.Empleados;

//JpaRepository --- Es spring data que contiene las operaciones crud
public interface EmpleadosDao extends JpaRepository<Empleados, Integer>{

	public List<Empleados> findByNombre(String nombre);
}
