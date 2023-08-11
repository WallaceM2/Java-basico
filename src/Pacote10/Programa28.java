package Pacote10;

//herança

public class Programa28 {
    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa("Louise Sophia", 2021, "Louise@gmail.com");

       // System.out.println(p1);
       // System.out.println(p1.getNome());
        System.out.println("");

        Aluno a1 = new Aluno("Sophia Louise", 2021, "Sophia@gmail.com", "091221");

        System.out.println(a1);
        System.out.println(a1.getNome());
        System.out.println("");

        Professor prof1 = new Professor("Wallace Mateus", 2000, "Wallace@gmail.com", "W1M4S2A5");

        System.out.println(prof1);
        System.out.println(prof1.getNome());
        System.out.println("");
    }
}
