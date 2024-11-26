package com.alicesouza.gerenciador_tarefas.repository;

import com.alicesouza.gerenciador_tarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
