package com.alicesouza.gerenciador_tarefas.model;

import com.alicesouza.gerenciador_tarefas.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Table(name = "usuario")
@Entity(name="usuario")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
