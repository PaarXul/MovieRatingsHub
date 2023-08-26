package cl.hub.movieratings.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "peliculas")
public class pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pelicula;

    @Column(length = 254)
    private String titulo;

    @Column(length = 4)
    private int anio_lanzamiento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_genero")
    private genero genero;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pelicula")
    @JsonIgnore
    private Set<calificacion> calificacion = new HashSet<>();



}
