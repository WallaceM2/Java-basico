package Pacote15;

import java.util.Scanner;

import Pacote09.Cliente;
import Pacote09.Conta;

/*
 * Gerando executaveis jar;
 * 
 * JAR - Java Archive
 * 
 * Archive - Arquivo compactado java;
 * 
 *      zip/rar;
 */

public class Principal {

        static Cliente cliente = new Cliente("Louise Sophia", "Rua bela vista, 155");
        static Conta conta = new Conta(1, 200, 300, cliente);
        static Scanner teclado = new Scanner(System.in);

                public static void depoistar() {
                    System.out.println("================= DEPOSITO ==================");
                    System.out.println("Informe o valor para deposito: ");
                    float valor = teclado.nextFloat();
                    if (valor > 0) {
                        conta.depoistar(valor);
                        System.out.println("Deposito efetuado com sucesso!");
                    }else {
                        System.out.println("O valor precisa ser positivo.");
                    }
                }
                            public static void sacar() {
                                    System.out.println("====================== SAQUE ========================");
                                    System.out.println("Informe o valor para saque: ");
                                    float valor = teclado.nextFloat();
                                    if (valor > 0) {
                                        conta.sacar(valor);
                                    }else {
                                        System.out.println("O valor precisa ser positivo.");
                                    }
                                }
                                            public static void consultar() {
                                                System.out.println("Seu saldo é " + conta.getSaldo());
                                            }          

        public static void main(String[] args) {
            int opcao = 0;
                System.out.println("Bem-vindo ao banco Java. ");

                    do {
                        System.out.println("Seleciona uma opção abaixo: ");
                            System.out.println("1 - Deposito");
                            System.out.println("2 - Sacar");
                            System.out.println("3 - Consultar saldo");
                            System.out.println("0 - Sair");
                            opcao = teclado.nextInt();

                            switch (opcao) {
                                    case 1:
                                        depoistar();
                                            break;
                                    case 2:
                                        sacar();
                                            break;
                                    case 3: 
                                        consultar();
                                            break;
                                    case 0: 
                                        break;
                                    default:
                                            System.out.println("Opção invalida.");
                                            break;
                            }
                    } while (opcao > 0 );
                        teclado.close();
        }
}
