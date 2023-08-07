package Pacote07;

//Construtor;

/*
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * Por padrao,a JVM - Java Virtual Machine, cria um tempo de execução,
 * um construtor padrao - um construtor vazio;
 * Podemos ter mais de um construtor da classe;
 */

public class Programa23 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // (Metodo) Construtor;

        pessoa1.nome = "Sophia Louise";
        pessoa1.email = "Sophia@gmail.com";
        pessoa1.ano_nascimento = 2021;
        
        pessoa1.imprime_informacoes();

        System.out.println("");

        Pessoa pessoa2 = new Pessoa("Daiana", "Daiana@gmail.com", 1980);
        pessoa2.imprime_informacoes();
    }
}
