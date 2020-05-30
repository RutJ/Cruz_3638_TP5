package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Cuota;
@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	private Cuota cuota;
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);
	@Override
	public void guardar() {
		// Accion ejecutada para guardar una cuota en la bd
		LOG.info("La cuota fue guardada ");
	}

	@Override
	public Cuota mostrar() {
		//Se recuperan todos los datos de la cuota
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto cuota de la bd
		LOG.info("Se eliminó la cuota de la base de datos");

	}

	@Override
	public Cuota modificar() {
		// se modifica los datos de la cuota
		LOG.info("Se modificó la couta");
		return cuota;
	}

}
