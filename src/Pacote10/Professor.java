package Pacote10;

public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula() {
        this.matricula = matricula;
    }

    //Overriding / Sobrescrita de metodo
    public String toString() {
        return super.toString() + "\nMatricula: " + this.matricula;
    }

    //Overriding / Sobrescrita de metodo
    public String getNome() {
        return "Professor: " + super.getNome();
    }
}
