SELECT titulo, AVG(puntuacion) as promedio FROM peliculas
inner join calificaciones on peliculas.id_pelicula = calificaciones.id_pelicula
group by titulo
order by promedio desc
limit 3;