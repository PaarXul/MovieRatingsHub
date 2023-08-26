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
@Table(name = "generos")
public class genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_genero;

    @Column(length = 100)
    private String nombre_genero;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "genero")
    @JsonIgnore
    private Set<pelicula> pelicula = new HashSet<>();

}
