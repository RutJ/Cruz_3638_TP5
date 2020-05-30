package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Equipo;
@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	private Equipo equipo;
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar un equipo en la bd
		LOG.info("El usuario fue guardado "+equipo.getNombre());

	}

	@Override
	public Equipo mostrar() {
		//Se recuperan todos los datos del equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto equipo de la bd
		LOG.info("Se eliminó el equipo de la base de datos");

	}

	@Override
	public Equipo modificar() {
		// se modifica los datos del equipo
		LOG.info("Se modificó el equipo");
		return equipo;
	}

}
