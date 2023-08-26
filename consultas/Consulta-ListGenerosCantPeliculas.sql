SELECT generos.nombre_genero , (COUNT(ALL peliculas.id_pelicula)) as cantidad  FROM generos
inner join peliculas on generos.id_genero = peliculas.id_genero
group by nombre_genero
ORDER BY COUNT(ALL peliculas.id_pelicula) desc;