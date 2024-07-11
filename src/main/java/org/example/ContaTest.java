package org.example;

public class ContaTest {
    public static void main(String[] args) {

        // Depositar com Conta Ativa

        Conta conta = new Conta();

        conta.ativar();

        conta.depositar(100.0);

        System.out.println("Saldo: " + conta.getSaldo());

        // Depositar com Conta Inativa

        conta = new Conta();

        conta.inativar();

        conta.depositar(100.0);

        System.out.println("Saldo: " + conta.getSaldo());





    }
}
