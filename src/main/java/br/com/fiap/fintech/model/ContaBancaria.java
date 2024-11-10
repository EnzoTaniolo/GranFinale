package br.com.fiap.fintech.model;

public class ContaBancaria {
    private int cdContaBancaria;
    private int cdUsuario;
    private String dsTipo;
    private double saldo;

    public ContaBancaria(int cdContaBancaria, int cdUsuario, String dsTipo, double saldo, int codigoBanco) {
        this.cdContaBancaria = cdContaBancaria;
        this.cdUsuario = cdUsuario;
        this.dsTipo = dsTipo;
        this.saldo = saldo;
    }


    public int getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }

    public int getCdContaBancaria() {
        return cdContaBancaria;
    }

    public void setCdContaBancaria(int cdContaBancaria) {
        this.cdContaBancaria = cdContaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
