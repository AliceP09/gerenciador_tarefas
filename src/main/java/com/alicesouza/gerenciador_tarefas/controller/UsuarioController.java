package com.alicesouza.gerenciador_tarefas.controller;

import com.alicesouza.gerenciador_tarefas.dto.UsuarioDTO;
import com.alicesouza.gerenciador_tarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/sign-up")
    public ResponseEntity postSignUp(@RequestBody UsuarioDTO body){
        usuarioService.postSignUp(body);
        return ResponseEntity.ok().build();
    }
}
