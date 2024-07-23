package com.softelse.negocio;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest_Ex6 {

    // Variaveis de Uso Temporario
    private GerenciadoraClientes gerCliente;
    private static int idCliente01 = 1;
    private static int idCliente02 = 2;


    /* Metodo Inicializador dos Objetos de Uso Durante os Testes*/
    @BeforeEach
  public void setUp(){
        // ========== Montando Cenário ==========

        // Criando dois Clientes
      Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "aa", 1, true);
      Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmai.com", 1, true);
        // Inserindo os dois Clientes no Banco
      List<Cliente> clientesDoBanco = new ArrayList<>();
      clientesDoBanco.add(cliente01);
      clientesDoBanco.add(cliente02);
      gerCliente = new GerenciadoraClientes(clientesDoBanco);

  }
/* Metodo Usado para Limpar*/

    @AfterEach
    public void tearDown(){
        gerCliente.limpa();
    }

    /*Teste Simples para Pesquisa de Cliente por ID*/
    @Test
    public void testPesquisaCliente(){
        // ========== Execução ==========
        //Chamando o Metodo a ser testado
        Cliente cliente = gerCliente.pesquisaCliente(1);

        // ========== Verificação ==========
        Assertions.assertEquals(cliente.getId(), 1);
        Assertions.assertEquals(cliente.getEmail(), "b");
    }

    @Test
    public void testRemoveCliente(){
        // ========== Execução ==========
        //Chamando o Metodo a ser testado
        boolean clienteRemovido = gerCliente.removeCliente(2);

        // ========== Verificação ==========
        Assertions.assertEquals(clienteRemovido, true);
        Assertions.assertEquals(gerCliente.getClientesDoBanco().size(), 1);
        Assertions.assertEquals(gerCliente.pesquisaCliente(2), null);
    }
}
