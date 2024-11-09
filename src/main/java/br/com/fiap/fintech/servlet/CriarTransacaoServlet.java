package br.com.fiap.fintech.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/criarTransacao")
public class CriarTransacaoServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int CdTransacao;
        int CdContaBancaria;

        //String DsTipoTransacao = request.getParameter("tipo-transacao");
        double VlTransacao = Double.parseDouble(req.getParameter("valor-transacao"));
        //Date DtTransacao = new Date(new java.util.Date().getTime());

        int CdBanco;

        //request.getRequestDispatcher("/criarTransacao.jsp").forward(request, response);
    }
}
