package org.example;

public class Conta {
    private double saldo;
    private boolean ativo;

    public double getSaldo() {
        return saldo;
    }

    public void ativar(){
        this.ativo = true;
    }

    public void inativar(){
        this.ativo = false;
    }

    public boolean depositar(double valor){
        if(this.ativo) {
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(this.ativo && (this.saldo - valor >= 0)) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
