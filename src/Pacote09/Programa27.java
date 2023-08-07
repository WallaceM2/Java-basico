package Pacote09;

//Private

/*
 * Privado a propria classe;
 * 
 * Ou seja, so temos acesso ao atributo ou metodo privado
 * dentro da propria classe onde ele foi declarado.
 */
public class Programa27 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Antonio Edlaercio", "Rua bela vista, 155");

        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEndereco());
        cli1.dizer_oi();

        System.out.println("");

        Cliente cli2 = new Cliente("Yasmim Dandara", "Rua bela vista, 155");

        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEndereco());
        cli1.dizer_oi();
    }
}
