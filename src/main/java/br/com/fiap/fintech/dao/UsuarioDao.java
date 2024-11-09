package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.factory.ConnectionFactory;
import br.com.fiap.fintech.model.Transacao;
import br.com.fiap.fintech.model.Usuario;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private Connection conexao;
    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrarUsuario(Usuario usuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_usuario(cd_usuario, nm_usuario, nr_cpf, email_usuario, senha_usuario, dt_nascimento) VALUES (?, ?, ?, ?, ?, ?)");

        stm.setInt(1, usuario.getCodigo());
        stm.setString(2, usuario.getNome());
        stm.setString(3, usuario.getCpf());
        stm.setString(4, usuario.getEmail());

        stm.setString(6, usuario.getSenha());

        stm.setDate(5, new Date(usuario.getDtNascimento().getTime()));
        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Usuario parseUsuario(ResultSet result) throws SQLException {
        int cd_usuario = result.getInt("cd_usuario");
        String nm_usuario = result.getString("nm_usuario");
        String nr_cpf = result.getString("nr_cpf");
        String email_usuario = result.getString("email_usuario");
        Date dt_nascimento = result.getDate("dt_nascimento");
        String senha_usuario = result.getString("senha_usuario");

        return new Usuario(cd_usuario, nm_usuario, nr_cpf, email_usuario, senha_usuario, dt_nascimento);
    }

    public List<Usuario> listarUsuario() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_usuario");
        ResultSet result = stm.executeQuery();
        List<Usuario> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseUsuario(result));
        }
        return lista;
    }

    public Usuario verificarUsuario(String cpf) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT 1 FROM t_usuario WHERE nr_cpf = ?");
        stm.setString(1, cpf);

        ResultSet result = stm.executeQuery();
        if (result == null){
           return null;
        }

        return parseUsuario(result);
    }
}
