package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
    
}
