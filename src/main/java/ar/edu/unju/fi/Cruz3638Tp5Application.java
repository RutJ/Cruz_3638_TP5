package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Cruz3638Tp5Application implements CommandLineRunner{
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Cruz3638Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// inicializo las las variables de mi objeto usuario
		usuario.setApellido("Cruz");
		usuario.setNombre("Jaquelina");
		usuario.setDni(39200358);
		usuario.setDireccion("Los Rosedales");
		usuario.setPassword("1234");
		usuario.setFechaNacimiento(LocalDate.of(1995, 9, 24));
		usuario.setId(1);
		usuario.setTipo("SOCIO");
		usuario.setFechaAlta(LocalDate.now());
		usuarioService.guardar();
	}

}
