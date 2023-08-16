package Pacote14;

import java.util.Scanner;

public class Programa37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro numero para divisão: ");
        int num1 = teclado.nextInt();
        System.out.println("Informe o segundo numero para divisao: ");
        int num2 = teclado.nextInt();

            try {
        System.out.println("A divisao de " + num1 + " por " + num2 + " é " + num1/num2);
                    } catch (ArithmeticException e) {
                           System.out.println("Não e possivel dividir " + num1 + " por " + num2);
                        }finally {
                            System.out.println("Faça isso também....");
                        }

        teclado.close();
    }
}
