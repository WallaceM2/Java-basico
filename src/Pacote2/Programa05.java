package JavaBasico.Pacote2;

//Operador ternario;

//Se voce precisar criar a função main() programa Java;
// main e no teclado pressionar CTRL + barra de espaço;

public class Programa05 {
    public static void main(String[] args) {
        int valor = -3, numero;

        /* 
        if(valor > 0) {
            numero = valor;
        }else {
            numero = 8;
        }*/
        
        //Operador ternario
        numero = (valor > 0) ? valor : 7;

        System.out.println(numero);
    }
}
