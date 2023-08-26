SELECT nombreusuario,titulo, resena  FROM calificaciones
inner join usuarios on calificaciones.id_usuario = usuarios.id_usuario
inner join peliculas on calificaciones.id_pelicula = peliculas.id_pelicula
where nombreusuario = "usuario3";