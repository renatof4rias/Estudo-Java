package com.softelse.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest_Ex1 {

    @Test
    public void testPesquisaCliente(){

        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "aa", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraClientes gerCliente = new GerenciadoraClientes(clientesDoBanco);

        Cliente cliente = gerCliente.pesquisaCliente(1);

        Assertions.assertEquals(cliente.getId(), 1);
        Assertions.assertEquals(cliente.getEmail(), "aa");
    }
}