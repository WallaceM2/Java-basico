package Pacote06;

import java.util.Scanner;

//Criando nossas proprias funções;

/*
 * Faça um programa, que receba um diversos nomes
 * de frutas do usuario e no final imprima essas
 * frutas em ordem contraria. O programa deve solicitar
 * ao usuario quantas frutas ele quer informar.
 * 
 * Informe quantas frutas deseja cadastrar;
 * 
 * Informe o nome de uma fruta:
 * Manga;
 * 
 * Informe o nome de uma fruta:
 * Goiaba;
 * 
 * Goiaba;
 * Manga;
 */

public class Programa20 {

        //Variaveis GLOBAIS;
            //Declaração do vetor;
            static String frutas[];
            //String frutas[] = new String[3];
            static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
            //Variavel local;
            int qtd;
            
            System.out.println("Informe a quantidade de frutas para cadastrar: ");
            qtd = Integer.parseInt(teclado.nextLine());

            cadastrar_dados(qtd);

            mostrar_dados(qtd);

        teclado.close();
    }
    /*
     * Uma função deve ter o seguinte:
     * a) tipo de retorno;
     * b) nome -> Corresponde a ação que a função realiza;
     * c) Parametro/Argumentos de entrada (Opcional);
     * d) Retorno (Opcional - depende do tipo de retorno);
     */
    //void = vazio;

        static void cadastrar_dados(int quantidade){
            //Definindo o tamanho do vetor
            frutas = new String[quantidade];

            //3
            // 0..2 (0,1,2);
            for (int i = 0; i < quantidade; i++) { //i ++ -> i = i + 1;

            System.out.println("Informe a " + ( 1 + 1) + " fruta: ");
            frutas[i] = teclado.nextLine();
        }
    }

        static void mostrar_dados(int quantidade) {
             for (int i = ( quantidade - 1 ); i >= 0; i--) { // i -- -> i = i - 1;
            System.out.println(frutas[i]);
        }
    }
}
