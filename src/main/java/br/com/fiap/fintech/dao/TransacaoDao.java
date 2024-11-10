package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.factory.ConnectionFactory;
import br.com.fiap.fintech.model.Transacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransacaoDao {

    private Connection conexao;
    public TransacaoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrarTransacao(Transacao transacao) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_transacoes (cd_transacao, cd_conta_bancaria, ds_tipo_transacao, vl_transacao, dt_transacao, cd_banco) VALUES (?, ?, ?, ?, ?, ?)");

        stm.setInt(1, transacao.getCdTransacao());
        stm.setInt(2, transacao.getCdContaBancaria());
        stm.setString(3, transacao.getDsTipoTransacao());
        stm.setDouble(4, transacao.getVlTransacao());
        stm.setDate(5, new Date(transacao.getDtTransacao().getTime()));
        stm.setInt(6, transacao.getCdBanco());
        stm.executeUpdate();
    }
    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Transacao parseTransacao(ResultSet result) throws SQLException {
        int cdTransacao = result.getInt("cd_transacao");
        int cdContaBancaria = result.getInt("cd_conta_bancaria");
        String dsTipoTransacao = result.getString("ds_tipo_transacao");
        double vlTransacao = result.getDouble("vl_transacao");
        Date dtTransacao = result.getDate("dt_transacao");
        int cd_Banco = result.getInt("cd_banco");

        return new Transacao(cdTransacao, cdContaBancaria, dsTipoTransacao, vlTransacao, dtTransacao, cd_Banco);
    }

    public List<Transacao> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_transacoes");
        ResultSet result = stm.executeQuery();
        List<Transacao> lista = new ArrayList<>();
        while (result.next()){
            lista.add(parseTransacao(result));
        }
        return lista;
    }
}
