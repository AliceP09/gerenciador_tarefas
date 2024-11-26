package com.alicesouza.gerenciador_tarefas.service;

import com.alicesouza.gerenciador_tarefas.dto.UsuarioDTO;
import com.alicesouza.gerenciador_tarefas.model.Usuario;
import com.alicesouza.gerenciador_tarefas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void postSignUp(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario(usuarioDTO);
        usuarioRepository.save(usuario);
    }
}
