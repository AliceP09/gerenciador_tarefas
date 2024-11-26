package com.alicesouza.gerenciador_tarefas.model;

import com.alicesouza.gerenciador_tarefas.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuario")
@Entity(name="usuario")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String usuario;
    private String email;
    private String senha;

    public Usuario(UsuarioDTO usuarioDTO){
        this.usuario = usuarioDTO.getUsuario();
        this.email = usuarioDTO.getEmail();
        this.senha = usuarioDTO.getSenha();
    }

}
