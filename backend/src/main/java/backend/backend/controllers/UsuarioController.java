package backend.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Usuario;
import backend.backend.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {
    UsuarioRepository repos;

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return repos.findAll();
    }

    @GetMapping("/usuario-por-nome/{nome}")
    public Optional<Usuario> getUsuarioByNome(@RequestParam String nome) {
        return repos.findByNome(nome);
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        return repos.findById(id).get();
    }

    @PostMapping("/usuario")
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return repos.save(usuario);
    }

    @DeleteMapping("/exclui_usuario/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        repos.deleteById(id);
    }
}
