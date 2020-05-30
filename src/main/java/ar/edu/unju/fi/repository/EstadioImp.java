package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Estadio;
@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	private Estadio estadio;
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un estadio en la bd
		LOG.info("El estadio fue guardado "+estadio.getNombre());

	}

	@Override
	public Estadio mostrar() {
		//Se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto estadio de la bd
		LOG.info("Se eliminó el estadio de la base de datos");

	}

	@Override
	public Estadio modificar() {
		// se modifica los datos del estadio
		LOG.info("Se modificó el estadio");
		return estadio;
	}

}
