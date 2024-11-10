package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.factory.ConnectionFactory;
import br.com.fiap.fintech.model.Transacao;
import br.com.fiap.fintech.model.Usuario;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UsuarioDao {

    private Connection conexao;
    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrarUsuario(String nome, String cpf, String email, String senha, Date data_nascimento) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO Tb_cliente(id, nome, cpf, email, senha, data_nascimento) VALUES (SEQ_CLIENTE.NEXTVAL, ?, ?, ?, ?, ?)");

        stm.setString(1, nome);
        stm.setString(2, cpf);
        stm.setString(3, email);
        stm.setString(4, senha);

        stm.setDate(5, new Date(data_nascimento.getTime()));

        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Usuario parseUsuario(ResultSet result) throws SQLException {
        String nm_usuario = result.getString("nome");
        String nr_cpf = result.getString("cpf");
        String email_usuario = result.getString("email");
        Date dt_nascimento = result.getDate("data_nascimento");
        String senha_usuario = result.getString("senha");

        return new Usuario(nm_usuario, nr_cpf, email_usuario, senha_usuario, dt_nascimento);
    }

    public List<Usuario> listarUsuario() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM Tb_Cliente");
        ResultSet result = stm.executeQuery();
        List<Usuario> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseUsuario(result));
        }
        return lista;
    }

    public Usuario verificarUsuario(String cpf) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM Tb_cliente WHERE cpf = ?");
        stm.setString(1, cpf);

        ResultSet result = stm.executeQuery();
        if (!result.next()){
           return null;
        }

        return parseUsuario(result);
    }
}
