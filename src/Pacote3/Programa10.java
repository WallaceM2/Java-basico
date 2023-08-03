package JavaBasico.Pacote3;

//Foreach // para cada

public class Programa10 {
    public static void main(String[] args) {
        
        String nome = "Aprendendo Java";
        
        //Para cada um dos caracteres da string, imprima o caractere;
        for (char letra : nome.toCharArray()) {
            //System.out.println(letra); //println serve para imprimir e ordem vertical;
            System.out.print(letra); //print serve para imprimir em ordem horizontal;
        }
    }
}
