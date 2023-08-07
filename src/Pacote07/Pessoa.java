package Pacote07;

//Classes;

//Atributos;

//Construtores;

/*
 * Sempre um construtor vazio tem a seguinte forma:
 * 
 * public NomeDaClasse () {};
 */

public class Pessoa {
    String nome, email;
    int ano_nascimento;

    //Construtor vazio;
    public Pessoa() {}

    //Construtor com parametros
    public Pessoa(String nome, String email, int ano_nascimento) {

        //This == Este objeto;

        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de nascimento: " + this.ano_nascimento);
    }

}
