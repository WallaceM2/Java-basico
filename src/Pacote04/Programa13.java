package Pacote04;

//Tipos de dados alfanumericos;
//Caracteres e strings;

public class Programa13 {
    public static void main(String[] args) {
        
        //Tipos primitivos;

        char letra = 'a';
        char letra2 = 97; // 97 em decimal == "a";
        //char letra4 = "A"; -> Errado!
        letra2 = (char) (letra2 + 1); //Cast
        //string nom =  "asdwdsa"; nao existe  o tipo primitivo em java;

        System.out.println("Letra " + letra);
        System.out.println("Letra " + letra2);

        //Tipos nao primitivos

        Character letra3 = 'A';
        String nome = "Aprendendo Java";


        System.out.println("Letra 3 " + letra3);
        
        System.out.println("char/Character " + Character.SIZE + " bits");
        System.out.println("Valor MAXIMO char/Character " + Character.MAX_VALUE); //0 min valor;
        System.out.println("Valor MINIMO char/Character " + Character.MIN_VALUE); //65535 max valor;

        System.out.println(nome);

        System.out.println("Tamanho da String: " + nome.length());

        System.out.println("String: " + (Character.SIZE * nome.length()) + " bits"); 
    }
}
