package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    
}
