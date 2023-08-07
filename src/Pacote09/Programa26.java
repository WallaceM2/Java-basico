package Pacote09;

//Public

/*
 * Publico - Pode ser utilizado em todo projeto;
 */
import Pacote09.Cliente;

public class Programa26 {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Amador Silva", "Rua bela vista, 155");

       // System.out.println("Nome: " + cli.nome);
       // System.out.println("Endereço: " + cli.endereco);  //Agora eles sao privates, nao tem mais acesso.
    }
}
