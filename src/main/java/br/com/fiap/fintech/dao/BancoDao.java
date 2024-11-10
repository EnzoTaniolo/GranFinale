package br.com.fiap.fintech.dao;
import br.com.fiap.fintech.factory.ConnectionFactory;
import br.com.fiap.fintech.model.Banco;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDao {
    private Connection conexao;
    public BancoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Banco banco) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_banco (cd_banco) VALUES (?)");
        stm.setInt(1, banco.getCdBanco());
        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Banco parseBanco(ResultSet result) throws SQLException {
        int cdBanco = result.getInt("cd_Banco");
        String nmBanco = result.getString("nm_Banco");
        return new Banco(cdBanco, nmBanco);
    }

    public List<Banco> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_banco");
        ResultSet result = stm.executeQuery();
        List<Banco> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseBanco(result));
        }
        return lista;
    }

}
