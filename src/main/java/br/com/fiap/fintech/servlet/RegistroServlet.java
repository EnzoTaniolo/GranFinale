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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
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
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String cpf = req.getParameter("cpf");

        SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyy");
        Date data_nascimento;
        try {
            data_nascimento = date_format.parse(req.getParameter("data_nascimento"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        try {
                usuarioDao.cadastrarUsuario(nome, cpf, email, senha, new java.sql.Date(data_nascimento.getTime()));
        } catch (SQLException e) {

            //Fazer tela de erro
            resp.sendRedirect(req.getContextPath() + "/erro");
            throw new RuntimeException(e);
        }

        resp.sendRedirect(req.getContextPath() + "/index");
    }
}
