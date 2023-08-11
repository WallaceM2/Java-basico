package Pacote10;

/*
 * Beneficios da herança;
 * Evita a repetição de codigo;
 * Facilita a manutenção do programa;
 */

 /*
  * Classe especifica;
  Sub-classe;
  Classe filha;
  */

 /*
  * Aluno é uma pessoa;
  Quando uma classe herda de outra classe ela ganha:
        Todos  os atributos da classe herdada;
  */

public class Aluno extends Pessoa {
   
                    private String ra;

                    public Aluno(String nome, int ano_nascimento, String email, String ra) {
                        super(nome, ano_nascimento, email);
                        //Pessoa(nome, ano_nascimento);
                        this.ra = ra;
                    }

                    public String getRa() {
                        return ra;
                    }

                    public void setRa(String ra) {
                        this.ra = ra;
                    }

                    //Overriding / Sobrescrita de metodo
                    public String toString() {
                        return super.toString() + "\nR.A: " + this.ra;
                    }

                    //Overriding / Sobrescrita de metodo
                    public String getNome() {
                        return "Aluno: " + super.getNome();
                    }

                    @Override
                    public void outra_mensagem(String texto) {
                    System.out.println(texto);
                    }
}
