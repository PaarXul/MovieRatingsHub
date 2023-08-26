package cl.hub.movieratings;

import cl.hub.movieratings.exceptions.UsuarioFoundException;
import cl.hub.movieratings.model.Rol;
import cl.hub.movieratings.model.Usuario;
import cl.hub.movieratings.model.UsuarioRol;
import cl.hub.movieratings.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MovieRatingsApplication  implements CommandLineRunner {
    // Insercion de usuarios
	/*
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
*/
    public static void main(String[] args) {
        SpringApplication.run(MovieRatingsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Insercion de Usuarios y ROL
/*
		try {
		Usuario usuario = new Usuario();

		usuario.setNombreusuario("Gian");
		usuario.setContrasena(bCryptPasswordEncoder.encode("12345"));
		usuario.setCorreoelectronico("Gian@gmail.com");


		Usuario usuario2 = new Usuario();
            usuario2.setNombreusuario("Gian");
            usuario2.setContrasena(bCryptPasswordEncoder.encode("12345"));
            usuario2.setCorreoelectronico("Gian@gmail.com");


		Rol rol = new Rol();
		rol.setId(1L);
		rol.setNombre("ADMIN");

		Rol rol2 = new Rol();
		rol2.setId(2L);
		rol2.setNombre("NORMAL");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();

		UsuarioRol usuarioRol = new UsuarioRol();

		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);
		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,
				usuarioRoles);

		Set<UsuarioRol> usuarioRoles2 = new HashSet<>();
		UsuarioRol usuarioRol2 = new UsuarioRol();

		usuarioRol2.setRol(rol2);
		usuarioRol2.setUsuario(usuario2);
		usuarioRoles2.add(usuarioRol2);

		Usuario usuarioGuardado2 = usuarioService.guardarUsuario(usuario2,
				usuarioRoles2);


	} catch(UsuarioFoundException exception) {
		exception.printStackTrace();
	}*/


    }

}
