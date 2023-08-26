SELECT titulo, nombre_genero, anio_lanzamiento FROM peliculas
inner join generos on peliculas.id_genero = generos.id_genero
order by anio_lanzamiento asc;