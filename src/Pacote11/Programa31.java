package Pacote11;

import Pacote10.Aluno;
import Pacote10.Pessoa;

//Classes abstratas;

/*
 * É um recurso que proporciona um bloqueio na criação de objetos;
 * Nao conseguimos instaciar objetos de uma classe abstrata;
 */

public class Programa31 {
    public static void main(String[] args) {
        Aluno Louise = new Aluno("Louise Sophia", 2021, "LouiseSophia@gmail.com", "RA2021");

        System.out.println(Louise);

        System.out.println(Louise.getNome());
    }
}
