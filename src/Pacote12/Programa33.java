package Pacote12;

//Interfaces - O que é e quando e utilizada;

/*
 *  - Interfaces sao conhecidas como " contratos ";
 * 
 * Uma empresa criou um contrato "com regras" para definir
 * a criação de um produto/serviço.
 * 
 * Quem implementar este contrato é obrigado a seguir as regras;
 * 
 * O joão, decidiu criar um produto/serviço baseado neste contrato;
 * A Maria, também decidiu criar um produto/serviço baseado neste mesmo contrato.
 * 
 *     Contrato para a confecção de um bolo;
 *      - O bolo precisa ser de chocolate;
 *      - O bolo deve ter cobertura;
 *      - O bolo deve ser recheado;
 */
public class Programa33 {
    public static void main(String[] args) {
        
        Ventilador vent = new Ventilador();

        System.out.println("A marca do ventilador é " + vent.MARCA);

        vent.desligar();  //Nao deve imprimir a mensagem;

        vent.ligar(); //aqui ele deve imprimir a mensagem;

        vent.desligar(); //deve imprimir a mensagem;
    }
}
