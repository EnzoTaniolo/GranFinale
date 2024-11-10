package br.com.fiap.fintech.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("usuario") == null) {
           response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
           response.sendRedirect(request.getContextPath() + "/index.jsp");
        }

        chain.doFilter(req, resp);
    }
}
