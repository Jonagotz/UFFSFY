package backend.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String titulo;
    String artista;
    String url;
}
