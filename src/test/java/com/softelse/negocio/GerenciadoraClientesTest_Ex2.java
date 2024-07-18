package com.softelse.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest_Ex2 {

    @Test
    public void testPesquisaCliente(){

        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientes gerCliente = new GerenciadoraClientes(clientesDoBanco);

        Cliente cliente = gerCliente.pesquisaCliente(1);

        Assertions. assertNotNull(cliente, "O cliente deve ser encontrado e não deve ser null");

        Assertions.assertEquals(cliente.getId(), 1);
        Assertions.assertEquals(cliente.getEmail(), "aa");
    }

    @Test
    public void testRemoveCliente(){

        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
        boolean clienteRemovido = gerClientes.removeCliente(2);

        Assertions.assertEquals(clienteRemovido, true);
        Assertions.assertEquals(gerClientes.getClientesDoBanco().size(), 1);
        Assertions.assertEquals(gerClientes.pesquisaCliente(2), null);
    }

}

