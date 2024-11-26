package com.alicesouza.gerenciador_tarefas.repository;

import com.alicesouza.gerenciador_tarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    UserDetails findByUsuario(String usuario);
}
