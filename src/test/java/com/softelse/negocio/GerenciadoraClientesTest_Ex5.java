package com.softelse.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest_Ex5 {
    @Test
    public void testPesquisaCliente(){

        /* ========== Montagem do Cenário ========== */

        int idCliente01 = 1;
        int idCliente02 = 2;

        //Criando Dois Clientes para Inserir na Lista do Banco
        Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        //Inserindo os Dois Clientes criado na Lista do Banco
        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);
        GerenciadoraClientes gerCliente = new GerenciadoraClientes(clientesDoBanco);


        /* ========== Execução ========== */
        //Chamando o Metodo a ser Testado
        Cliente cliente = gerCliente.pesquisaCliente(1);

        /* ========== Verificação ========== */
        //Verificando a Saída do Metodo com o Valor Esperado.
        Assertions.assertEquals(cliente.getId(), 1);
        Assertions.assertEquals(cliente.getEmail(), "aa");
    }


    /*
       teste básico de remoção de cliente por ID.
   */
    @Test
    public void testRemoveCliente(){

        /* ========== Montagem do Cenário ========== */
        int idCliente01 = 1;
        int idCliente02 = 2;

        //Criando Dois Clientes para Inserir na Lista do Banco
        Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        //Inserindo os Dois Clientes criado na Lista do Banco
        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        /* ========== Execução ========== */
        //Chamando o Metodo a ser Testado
        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
        boolean clienteRemovido = gerClientes.removeCliente(2);

        /* ========== Verificação ========== */
        //Verificando se o cliente com id 2 foi removido, esperando um valor null quando pesquisar o mesmo pelo ID.
        Assertions.assertEquals(clienteRemovido, true);
        Assertions.assertEquals(gerClientes.getClientesDoBanco().size(), 1);
        Assertions.assertEquals(gerClientes.pesquisaCliente(2), null);
    }
}
