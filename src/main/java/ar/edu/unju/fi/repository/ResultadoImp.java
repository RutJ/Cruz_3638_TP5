package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Resultado;
@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	private Resultado resultado;
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un resultado en la bd
		LOG.info("El resultado fue guardado: ");
	}

	@Override
	public Resultado mostrar() {
		//Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto resultado de la bd
		LOG.info("Se eliminó el resultado de la base de datos");

	}

	@Override
	public Resultado modificar() {
		// se modifica los datos del resultado
		LOG.info("Se modificó el resultado");
		return resultado;
	}

}
