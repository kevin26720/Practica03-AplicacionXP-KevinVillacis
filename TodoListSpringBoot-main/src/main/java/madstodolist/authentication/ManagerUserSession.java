package madstodolist.authentication;

import madstodolist.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class ManagerUserSession {

    @Autowired
    HttpSession session;

    @Autowired
    UsuarioService usuarioService;

    public void logearUsuario(Long idUsuario) {
        session.setAttribute("idUsuarioLogeado", idUsuario);

        // 👇 Esta línea permite que el navbar funcione bien
        session.setAttribute("usuario", usuarioService.findById(idUsuario));
    }

    public Long usuarioLogeado() {
        return (Long) session.getAttribute("idUsuarioLogeado");
    }

    public void logout() {
        session.invalidate();
    }
}
