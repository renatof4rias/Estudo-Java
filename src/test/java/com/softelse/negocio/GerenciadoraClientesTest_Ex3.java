package com.softelse.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest_Ex3 {
    @Test
    public void testPesquisaCliente(){

        /* ========== Montagem do Cenário ========== */
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientes gerCliente = new GerenciadoraClientes(clientesDoBanco);

        /* ========== Execução ========== */
        Cliente cliente = gerCliente.pesquisaCliente(1);

        /* ========== Verificação ========== */
        Assertions.assertEquals(cliente.getId(), 1);
        Assertions.assertEquals(cliente.getEmail(), "aa");
    }

    @Test
    public void testRemoveCliente(){

        /* ========== Montagem do Cenário ========== */
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        /* ========== Execução ========== */
        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
        boolean clienteRemovido = gerClientes.removeCliente(2);

        /* ========== Verificação ========== */
        Assertions.assertEquals(clienteRemovido, true);
        Assertions.assertEquals(gerClientes.getClientesDoBanco().size(), 1);
        Assertions.assertEquals(gerClientes.pesquisaCliente(2), null);
    }

}
