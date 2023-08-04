package Pacote04;

//Tipos de dados;
//Numericos (inteiros e reais);

public class Programa11 {
    public static void main(String[] args) {
        
        //Tipos primarios;

        long num0 = 99; // Inteiro 99999999999999999999999;
        int num1 = 4; //Inteiro 999999999;
        short num2 = 4; //Inteiro (curto/menor/baixo);
        byte num3 = 4; //Inteiro;
        char num8 = 34;


        //Tipos nao primarios/primitivos;
        Long num7 = (long) 9999999; //CAST;
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Character num9 = 35;

        System.out.println("Int -> num 1 = " + num1);
        System.out.println("Short -> num 2 = " + num2);
        System.out.println("byte -> num 3 = " + num3);
        System.out.println("long -> num 0 = " + num0);
        System.out.println("chat -> num 8 = " + num8);

        System.out.println("");

        System.out.println("Interger -> num 4 = " + num4);
        System.out.println("Short -> num 5 = " + num5);
        System.out.println("Byte -> num 6 = " + num6);
        System.out.println("Long -> num 7 = " + num7);
        System.out.println("Character -> num 9 = " + num9);
        

        System.out.println("");

        System.out.println("long/Long " + Long.SIZE + " bits");
        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("");

        System.out.println("Valor MAXIMO int/Integer " + Integer.MAX_VALUE);
        System.out.println("Valor MINIMO int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor MAXIMO short/Short " + Short.MAX_VALUE);
        System.out.println("Valor MINIMO short/Short " + Short.MIN_VALUE);
        System.out.println("Valor MAXIMO byte/Byte " + Byte.MAX_VALUE);
        System.out.println("Valor MINIMO byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Valor MAXIMO long/Long " + Long.MAX_VALUE);
        System.out.println("Valor MINIMO long/Long " + Long.MIN_VALUE);
        System.out.println("Valor MAXIMO char/Character " + Character.MAX_VALUE); //0 min valor;
        System.out.println("Valor MINIMO char/Character " + Character.MIN_VALUE); //65535 max valor;
        
    }
}
