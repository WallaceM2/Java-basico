package Pacote07;

//Classes

/*
 * O nome das classes inicia com letra maiscula;
 * O nome nao deve conter: Acentuação, caracteres especiais, espaço;
 * Nas classes Java, nao existe a implementação da função main();
 * Toda classe Java possui a seguinte forma;
 * O nome da classe Java DEVE ser o mesmo nome do arquivo java;
 * Tudo que estiver dentro das "Chaves" {} faz parte da classe;
 * 
 * public class NomeDoProduto {};
 */

//Atributos

/*
 * Sao as caracteristicas da classe/molde/modelo de dados;  
 * Podemos entender atributos como variaveis da classe;
 * Uma outra forma de nomeclatura para os atributos sao estados;
 * Atributos sao nomeados em letras minusculas, sem espaço, sem caracteres especiais
 *  sem acentuação;
 */


 //Metodos

 /*
  * Podemos entender os metodos como a ação que é realizada por um objeto da classe;
    Podemos entender tambem que os metodos sao comportamentos dos objetos da classe;

    Mesmos requisitos para funções;

    a) tipo de retorno;
    b) nome -> Corresponde a ação que a função realiza;
    c) Parametro/Argumentos de entrada (Opcional);
    d) Retorno (Opcional - depende do tipo de retorno);
  */



public class Produto {
    String nome;
    float preco;
    float desconto;

    //Metodo para aumentar o preço do produto em +10;
    void aumentar_preco(float valor) {
        this.preco = this.preco + valor;
    }
}
