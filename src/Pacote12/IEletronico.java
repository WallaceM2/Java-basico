package Pacote12;

/*
 * Uma interface pode conter:
 *      - Constantes;
 *      - Metodos abstratos;
 * 
 * 
 * Interface para servir de contrato para produtos eletronicos. Todo
 * produto eletronico que implementar esta interface OBRIGATORIAMENTE
 * deverao implementar os metodos abstratos;
 */
public interface IEletronico {

    public String MARCA = "Java";  //Constante;
    
    public void ligar();
    public void desligar();
}
