package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Noticia;
@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	
	private Noticia noticia;
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion ejecutada para guardar una noticia en la bd
		LOG.info("El noticia fue guardada ");

	}

	@Override
	public Noticia mostrar() {
		//Se recuperan todos los datos de la noticia
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto noticia de la bd
		LOG.info("Se eliminó la noticia de la base de datos");

	}

	@Override
	public Noticia modificar() {
		// se modifica los datos de la noticia
		LOG.info("Se modificó la noticia");
		return noticia;
	}

}
