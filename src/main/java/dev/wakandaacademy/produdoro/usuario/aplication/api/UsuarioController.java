package dev.wakandaacademy.produdoro.usuario.aplication.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {
    @Override
    public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNOVO){
       log.info("[strat] UsuarioController - postNovoUsuario");
       return null;

    }

}
