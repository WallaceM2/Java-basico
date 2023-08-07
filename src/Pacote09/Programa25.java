package Pacote09;

//Encapsulamento;
//Capsula

public class Programa25 {
    public static void main(String[] args) {
        Cliente Louise = new Cliente("Louise Sophia", "Rua bela vista, 155");
        Cliente Sophia = new Cliente("Sophia Louise", "Rua bela vista, 155");

        Conta conta_louise = new Conta(1, 100.0f, 200.0f, Louise);
        Conta conta_sophia = new Conta(2, 300.0f, 500.0f, Sophia);

        System.out.println("Saldo da Louise(Antes do saque): " + conta_louise.getSaldo());
       //System.out.println("Saldo da Sophia: " + conta_sophia.getSaldo());

        conta_louise.sacar(150);
        System.out.println("Saldo atualizado(Depois do saque): " + conta_louise.getSaldo());
    }
}
