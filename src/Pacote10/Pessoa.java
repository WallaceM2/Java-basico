package Pacote10;

/*
 * Classe base;
 * Classe mae;
 * Classe pai
 * Super classe;
 * Classe generica;
 * 
 */

public class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;

    public Pessoa(){}

    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Overriding / Sobrescrita de metodo;
    public String toString() {
        return "Nome: " + this.nome + " \nAno de nascimento: " + this.ano_nascimento;
    }

    // Overloading / Sobrecarga de metodo;
    public void mensagem(){
        System.out.println("Essa e a minha mensagem!");
    }

    // Overloading / Sobrecarga de metodo;
    public void mensagem(String msg) {
        System.out.println(msg);
    }

    // Overloading / Sobrecarga de metodo;
    public void mensagem(String msg, int num ){
        System.out.println(msg + num);
    }
}
