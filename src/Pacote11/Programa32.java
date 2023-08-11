package Pacote11;

//Template Method;

/*
 * O padrão Template Method define o esqueleto de um algoritmo dentro de um metodo;
 * transferindo alguns de seus passos para uma subclasses. O template method permite
 * que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
 * do proprio algoritmo;
 * 
 * 
 * Algoritmos são "receitas" passo-a-passo para resolver algum problema;
 * 
 * Receber numero;
 * retornar numero * numero;
 * 
 * metodo_principal(){}
 *          passo1();
 *          passo2();
 *          passo3();
 */

public class Programa32 {
    public static void main(String[] args) {
        InicioDaTemporada tit = new InicioDaTemporada();

        tit.treinoDiario();

        FimDaTemporada tft = new FimDaTemporada();

        tft.treinoDiario();
    }
}
