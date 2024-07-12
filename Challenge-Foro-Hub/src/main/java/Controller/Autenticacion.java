package Controller;


import Dto.Security.DatosJWTtoken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Autenticacion {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    private DatosAutenticacionUsuario datosAutenticacion;

    @PostMapping
    public ResponseEntity autenticaUsuario(@RequestBody @valid DatosAutenticacionUsuario datosAutenticacion){
        this.datosAutenticacion = datosAutenticacion;
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacion.emial(), datosAutenticacion.contrasena());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken(Usuario) usuarioAutenticado.getPrincipal();
        return ReponseEntity.ok(new DatosJWTtoken(JWTtoken));
    }
}

