package Pacote02;

//Else-if, If, Else;

public class Programa4 {
    public static void main(String[] args) {
        
        //Declarando e inicializando a variavel;
        int numero = 5;

        /*Se (numero > 5) então {
            escreva ("Sim, o numero " + numero + " é maior que 5");
        }senao se (numero == 5) {
            escreva("Não, o numero " + numero + " é igual a 5");
        }senao {
            escreva("Nao, o numero " + numero + " nao é maior que 5")
        }*/
        if (numero > 5) {
            System.out.println("Sim, o numero " + numero + " maior que 5");
        }else if(numero == 5) {
            System.out.println("Não, o numero " + numero + " é igual a 5");
            //Verificando se o numero é par
        }else if (numero % 2 == 0) {
            System.out.println("O numero" + numero + " é par");
        }else {
            System.out.println("Não, o numero " + numero + " nao e maior que 5");
        }
    }
}
