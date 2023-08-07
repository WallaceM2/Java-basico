package Pacote07;

//Objetos

/*
 * Objetos sao produtos/instancias da classe;
 */

public class Programa22 {
    public static void main(String[] args) {
        
        int numero = 4;

        //Declaração de um objeto;
        Produto p0;

        //Declaração e instanciação/iniciação do objeto;
        //P1 -> chamado de instancia do objeto/ objeto;

        Produto p1 = new Produto(); //Construtor;
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("=========== Produtos ===========");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "% de desconto");

        System.out.println("");

        p0 = new Produto(); //Construtor;
        p0.nome = "Caneta BIC";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "% de desconto");

        System.out.println("");

        Pessoa pessoa1 = new Pessoa(); //Construtor;
        pessoa1.nome = "Louise Sophia";
        pessoa1.email = "Louise@gmail.com";
        pessoa1.ano_nascimento = 2021;

        System.out.println("========= Pessoas =========");
        System.out.println("Nome : " + pessoa1.nome);
        System.out.println("Email : " + pessoa1.email);
        System.out.println("Ano de nascimento: " + pessoa1.ano_nascimento);

        

    }
}
