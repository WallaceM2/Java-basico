package Pacote05;

//Vetores parte 2

public class Programa17 {
    public static void main(String[] args) {
        int numeros[] = new int[10];

        System.out.println("Tamanho do vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            //numeros[0];
            numeros[i] = i + 3;
            //numeros[9] = i + 3;
        }

        System.out.println(numeros[0]); //Primeiro elemento;
        System.out.println(numeros[9]); //Ultimo elemento;

        numeros[0] = 7;
        System.out.println(numeros[0]); //Primeiro elemento;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.round(Math.random() * 10);
        }

        System.out.println(numeros[0]); //Primeiro elemento;
        System.out.println(numeros[9]); //Ultimo elemento;

        //0...1;
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);
        }

        /*
         * 0..9
         * numeros[10] = 42;
         * System.out.println(numeros[10]);
         */

        /*
         * Os vetores/arrays possuem tamanho fixo e não
         * podem ser aumentados/diminuidos;
         */

        //numeros[0] = 23.4f;
        /*
         * Os vetores/arrays possuem tipo de dados fixos
         * e nao aceitam tipos variados;
         */

        /*numeros[0] = 8;
        ...
        numeros[9] = 25;*/
    }
}
