package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa un equipo de Futbol
 * @author jack
 *
 */
@Component
public class Equipo {
	/*
	 * Representa el nombre que posee el equipo
	 */
	private String nombre;
	/*
	 * Representa el estadio donde se encuentra el equipo 
	 */
	@Autowired
	private Estadio estadio;
	//Constructores
	/**
	 * Asigna los valores correspondientes a los atributos de Equipo
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	public Equipo() {
	 estadio = new Estadio();
	}
	
	//Metodos Accesores
	
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
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	

}
