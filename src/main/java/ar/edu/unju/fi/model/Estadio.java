package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Representa un Estadio
 * @author jack
 *
 */
@Component
public class Estadio {
	//Atributos
	/*
	 * Representa el nombre del Estadio
	 */
	private String nombre;
	/*
	 * Representa la fecha en la que fue fundado el Estadio
	 */
	private LocalDate fechaFundacion;
	/*
	 * Representa la ciudad donde se encuentra el Estadio
	 */
	private String ciudad;
	/*
	 * Representa la capacidad de personas que tiene el Estadio
	 */
	private int capacidad;
	/*
	 * Representa la direccion donde se encuentra el Estadio
	 */
	private String direccion;
	
	//Constructores
	/**
	 * Asigna los valores correspondientes a los atributos de Estadio
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	public Estadio() {
		
	}
	
	//Metodos accesores

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	



}
