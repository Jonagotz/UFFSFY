package backend.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Playlist;
import backend.backend.repositories.PlaylistRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PlaylistController {
    PlaylistRepository repos;

    @GetMapping("/playlists")
    public List<Playlist> getAllPlaylists() {
        return repos.findAll();
    }

    @GetMapping("/playlist/{id}")
    public Playlist getPlaylistById(@PathVariable Long id) {
        return repos.findById(id).get();
    }

    @PostMapping("/playlist")
    public Playlist savePlaylist(@RequestBody Playlist playlist) {
        return repos.save(playlist);
    }

    @GetMapping("/deletar-playlist/{id}")
    public void deletePlaylistTeste(@PathVariable Long id) {
        repos.deleteById(id);
    }
}
