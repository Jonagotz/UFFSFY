package backend.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Musica;
import backend.backend.repositories.MusicaRepository;
// import jakarta.persistence.PostUpdate;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MusicaController {
    MusicaRepository repos;

    @GetMapping("/musicas")
    public List<Musica> getAllMusicas() {
        return repos.findAll();
    }

    @GetMapping("/musica/{id}")
    public Musica getMusicaById(@PathVariable Long id) {
        return repos.findById(id).get();
    }

    @PostMapping("/musica")
    public Musica saveMusica(@RequestBody Musica musica) {
        return repos.save(musica);
    }

    @DeleteMapping("/musica/{id}")
    public void deleteMusica(@PathVariable Long id) {
        repos.deleteById(id);
    }

    @GetMapping("/deletar-musica/{id}")
    public void deleteMusicaTeste(@PathVariable Long id) {
        repos.deleteById(id);
    }

}
