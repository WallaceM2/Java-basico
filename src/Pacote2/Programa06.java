package JavaBasico.Pacote2;

//Instrução Switch

public class Programa06 {
    public static void main(String[] args) {
        int numero = 50;

        switch (numero) {
            case 1:
                System.out.println("O numero é 25");
                break;
            case 2:
                System.out.println("O numero é 15");
                break;
            case 5:
                System.out.println("O numero é 44");
                break;
            default:
                System.out.println("[Default] O numero é " + numero);
                break;
            }
    }
}
