package Pacote04;

//Operações matematicas;

public class Programa15 {
    public static void main(String[] args) {
        
        int num1 = 5, num2 =9, res;

        float res2;
        
        //Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

        //Subtração
        res = num2 - num1;
        System.out.println("A subtração de " + num2 + " - " + num1 + " é " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);
        
        //Divisao (Inteira)
        res = num2/num1;
        System.out.println("A divisao de " + num2 + " / " + num1 + " é " + res);

        //Divisao (Real)
        res2 = (float)num2/(float)num1; //CAST
        System.out.println("A divisao de " + num2 + " / " + num1 + " é " + res2);

        //Modulo
        /*
         * Se o resto do modulo da variavel por 2 for 0, a variavel é 
         * par. Se o resto for 1, a variavel e impar.
         */
        res = num1 % 2;
        System.out.println("O resta da divisao de " + num1 + " por 2 é " + res);

        res = num2 % 3;
        System.out.println(num2 + " é divisao por 3 ? " + res);
        
    }
}
