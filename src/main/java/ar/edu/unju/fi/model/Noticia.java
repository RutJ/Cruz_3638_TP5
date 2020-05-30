package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Representa una Noticia
 * @author Cruz Ruth jaquelina
 *
 */
@Component
public class Noticia {
	/*
	 * Representa la fecha en que es creada Noticia
	 */
	private LocalDate fecha;
	/*
	 * Representa el titulo de la noticia
	 */
	private String titulo;
	/*
	 * Representa un resumen de la noticia
	 */
	private String resumen;
	
	//Constructores
	
	public Noticia() {
		super();
	}
	/**
	 * Asigna los valores correspondientes a los atributos de la Noticia
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	//Metodos Accesores
	
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	
	
	
	

}
