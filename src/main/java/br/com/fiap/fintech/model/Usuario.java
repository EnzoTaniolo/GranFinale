package br.com.fiap.fintech.model;

import java.util.Date;

public class Usuario {
   private String nome;
   private String cpf;
   private String email;
   private String senha;
   private Date dtNascimento;
   private ContaBancaria contaBancaria;

   public Usuario(String nome, String cpf, String email, String senha, Date dtNascimento) {
      this.nome = nome;
      this.cpf = cpf;
      this.email = email;
      this.senha = senha;
      this.dtNascimento = dtNascimento;
   }

    public void criarContaBancaria(String tipoConta, int codigoBanco){
       if(contaBancaria == null){
       }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean verificarSenha(String senha){
        return senha.equals(this.senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
