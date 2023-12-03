package backend.backend.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
// import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    @ManyToMany                                                                                                     
    List<Musica> musicas;
    String dataCriacao;
}
