package com.mx.CrudEmpleados.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Estereotipos o anotaciones--- Indicar que esta clase pertenece a una tabla
@Entity
@Table(name = "EMPLEADOS_BODEGA")
public class Empleados {
	/*
	 * ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(50), APP NVARCHAR2(50), APM
	 * NVARCHAR2(50), NSS NUMBER, NUM_CEL NUMBER, CORREO NVARCHAR2(50), SUELDO
	 * NUMBER
	 */

	// MAPEAR LA TABLA --- Variables o atributos de mi objeto
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String nombre;
	@Column(name = "APELLIDO_P", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String app;
	@Column(name = "APELLIDO_M", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String apm;
	@Column(name = "NSS", columnDefinition = "NUMBER", nullable = false)
	long nss;
	@Column(name = "NUM_CEL", columnDefinition = "NUMBER", nullable = false)
	long num_cel;
	@Column(name = "CORREO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String correo;
	@Column(name = "SUELDO", columnDefinition = "NUMBER", nullable = false)
	float sueldo;

	public Empleados() {

	}

	public Empleados(int id) {
		this.id = id;
	}

	public Empleados(int id, String nombre, String app, String apm, long nss, long num_cel, String correo,
			float sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.nss = nss;
		this.num_cel = num_cel;
		this.correo = correo;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", nss=" + nss
				+ ", num_cel=" + num_cel + ", correo=" + correo + ", sueldo=" + sueldo + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public long getNss() {
		return nss;
	}

	public void setNss(long nss) {
		this.nss = nss;
	}

	public long getNum_cel() {
		return num_cel;
	}

	public void setNum_cel(long num_cel) {
		this.num_cel = num_cel;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
