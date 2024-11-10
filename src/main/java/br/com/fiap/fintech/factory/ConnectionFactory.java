package br.com.fiap.fintech.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static ConnectionFactory ConnectionFactory;

    private ConnectionFactory() {
    }

    public static ConnectionFactory getInstance() {
        if (ConnectionFactory == null) {
            ConnectionFactory = new ConnectionFactory();
        }
        return ConnectionFactory;
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM557167",
                    "120799");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

}