package JavaBasico.Pacote4;

//Tipos de dados;
//Numericos (inteiros e reais);

public class Programa12 {
    public static void main(String[] args) {
        
        //Tipos primarios/primitivos;
        //Por padrão, os numeros reais em java sao considerados double
        
        float preco1 = 32.4f; // 32.40; 
        double preco2 = 25.3; // 25.32387772385;

        /*  Primarios/Primitivos, ocupam menos espaço na memoria
            é melhor para trabalhar com dados! */

        //Tipos nao primarios/primitivos;

        Float preco3 = 44.5f;
        Double preco4 = 41.5;

        System.out.println("float -> preco 1 = " + preco1);
        System.out.println("double -> preco 2 = " + preco2);
        System.out.println("Float -> preco 3 = " + preco3);
        System.out.println("Double -> preco 4 = " + preco4);

        System.out.println("");

        System.out.println("float/Float -> preco 1 = " + Float.SIZE + " bits");
        System.out.println("double/Double -> preco 2 = " + Double.SIZE + " bits");

        System.out.println("");

        System.out.println("Valor MAXIMO float/Float " + Float.MAX_VALUE);
        System.out.println("Valor MINIMO float/Float" + Float.MIN_VALUE);
        System.out.println("Valor MAXIMO double/Double " + Double.MAX_VALUE);
        System.out.println("Valor MINIMO double/Double " + Double.MIN_VALUE);
    }
}
