package br.com.fiap.fintech.servlet;

import br.com.fiap.fintech.dao.UsuarioDao;
import br.com.fiap.fintech.model.Usuario;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UsuarioDao usuarioDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            usuarioDao = new UsuarioDao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cpf = req.getParameter("cpf");
        String senha = req.getParameter("senha");

        Usuario usuario;
        try {
            usuario = usuarioDao.verificarUsuario(cpf);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (usuario == null) {
            resp.sendError(HttpServletResponse.SC_FORBIDDEN);
        }

        if(usuario.verificarSenha(senha)) {
            resp.setStatus(HttpServletResponse.SC_OK);
        }
        resp.sendError(HttpServletResponse.SC_FORBIDDEN);
    }
}
