package JavaBasico.Pacote3;

import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for maior que 0;
 */


 //DoWhile;

/*
 * Primeiro ele executa o bloco para depois checar;
 */
public class Programa08 {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        //Para receber dados do usuario via teclado;
        Scanner teclado = new Scanner(System.in);

        //Primeiro executa o bloco, depois faz a checagem;
        do {
            
            System.out.println("Informe seu nome: ");
            //nome = teclado.next() -> para pegar apenas um nome sem espaço;
            nome = teclado.nextLine(); //Nextline e uma função da variavel do teclado para receber uma string;

            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt(); -> "BUG"    //NextInt e uma função da variavel do teclado para receber um inteiro;
            idade = Integer.parseInt(teclado.nextLine());
            //Integer serve para converter uma String para um inteiro

            if (idade > 0 ) {
                System.out.println(nome + " tem " + idade + " anos");
            }
         } while (idade > 0);
    }
}
