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
@Table(name = "usuarios")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(length = 100)
    private String nombreusuario;
    @Column(length = 100)
    private String correoelectronico;
    @Column(length = 254)
    private String contrasena;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
    @JsonIgnore
    private Set<calificacion> calificacion = new HashSet<>();


}
