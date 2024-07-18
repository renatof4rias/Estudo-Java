package com.softelse.negocio;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private boolean ativo;
    private int idContaCorrente;

    public Cliente(int id, String nome, int idade, String email, int idContaCorrente, boolean ativo){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.idContaCorrente = idContaCorrente;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                ", idContaCorrente=" + idContaCorrente +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getIdContaCorrente() {
        return idContaCorrente;
    }

    public void setIdContaCorrente(int idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }
}
