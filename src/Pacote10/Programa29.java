package Pacote10;

//Sobrecarga de metodo;

/*
 * Overloading
 * 
 * Ocorre quando, sobrescrevemos um metodo na mesma classe de declaração;
 * 
 */
public class Programa29 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.mensagem();
        p1.mensagem("Minha mensagem é diferente da primeira...");
    }
}
