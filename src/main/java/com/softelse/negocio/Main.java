//package com.softelse.negocio;
//
//import java.util.Scanner;
//
//public class Main {
//
//    static GerenciadoraClientes gerClientes;
//    static GerenciadoraContas gerContas;
//
//    public static void main(String[] args) {
//
//        inicializaSistemaBancario();
//
//        Scanner sc = new Scanner(System.in);
//        boolean continua = true;
//
//        while (continua){
//            printMenu();
//            int opcao = sc.nextInt();
//
//            switch (opcao){
//                case 1:
//                    System.out.print("Digite o ID do cliente: ");
//                    int idCliente = sc.nextInt();
//                    Cliente cliente = gerClientes.pesquisaCliente(idCliente);
//
//                    if (cliente != null)
//                        System.out.println(cliente.toString());
//                    else
//                        System.out.println("Cliente não encontrado!");
//                    pulalinha();
//                    break;
//
//                case 2:
//                    System.out.println("Digite o ID da conta: ");
//                    int idConta = sc.nextInt();
//                    ContaCorrente conta = gerContas.pesquisaConta(idConta);
//
//                    if (conta != null)
//                        System.out.println(conta.toString());
//                    else
//                        System.out.println("Conta não encontrado!");
//                    pulalinha();
//                    break;
//                case 3:
//                    System.out.println("Digite o ID do cliente: ");
//                    int idCliente2 = sc.nextInt();
//                    Cliente cliente2 = gerClientes.pesquisaCliente(idCliente2);
//
//                    if (cliente2 != null)
//                        cliente2.setAtivo(true);
//                        System.out.println("Cliente ativado com sucesso!");
//                    else
//                        System.out.println("Cliente não encontrado!");
//                    pulalinha();
//                    break;
//                case 4:
//                    System.out.println("Digite o ID do cliente: ");
//                    int idCliente3 = sc.nextInt();
//                    Cliente cliente3 = gerClientes.pesquisaCliente(idCliente3);
//
//                    if (cliente2 != null)
//                        cliente2.setAtivo(false);
//                        System.out.println("Cliente desativado com sucesso!");
//                    else
//                    System.out.println("Cliente não encontrado!");
//                    pulalinha();
//                    break;
//                case 5:
//                    continua = false;
//                    System.out.println("################# Sistema encerrado #################");
//                    break;
//            }
//
//        }
//
//
//        sc.close();
//    }
//}
