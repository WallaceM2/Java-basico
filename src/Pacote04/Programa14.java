package Pacote04;

//Tipos booleanos;

public class Programa14 {
    public static void main(String[] args) {
        
        //Tipos primitivos;

        boolean verdadeiro = true;
        boolean falso = false;

        //Tipos nao primitivos;

        Boolean v = true;
        Boolean f = false;

        boolean ativo = true;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);
        System.out.println("V " + v);
        System.out.println("F " + f);

        if(verdadeiro) {
            System.out.println("É Verdadeiro");
        }else {
            System.out.println("É Falso");
        }
        if(1 == 1) {
            System.out.println(" 1 == 1 é Verdadeiro");
        }else {
            System.out.println("... é falso");
        }

        if(ativo) {
            System.out.println("Pode acessar o sistema");
        }else {
            System.out.println("Acesso negado!");
        }
    }
}
