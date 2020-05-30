package ar.edu.unju.fi.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cruz3638Tp5Application;
import ar.edu.unju.fi.model.Usuario;

@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG =LoggerFactory.getLogger(Cruz3638Tp5Application.class);

	@Override
	public void guardar() {
		// Accion ejecutada para guardar un usuario en la bd
		LOG.info("El usuario fue guardado "+ usuario.getApellido() +", "+ usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		//Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto usuario de la bd
		LOG.info("Se eliminó el usuario de la base de datos");

	}

	@Override
	public Usuario modificar() {
		// se modifica los datos del usuario
		LOG.info("Se modificó el usuario");
		return usuario;
	}

}
