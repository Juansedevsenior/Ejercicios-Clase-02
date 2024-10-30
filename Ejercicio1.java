import java.util.Scanner;

/**
 * Ejercicio1
 */
public class Ejercicio1{ 
    public static void main (String[] args) {
        var num1 = 8;
        var num2 = 2;
        var num3 = 5;

        var num4 = num1 / num2 * (num3 + num2);
        System.out.println(num4);

        /*
        El resultado correcto es 28, siguiendo el orden jerarquico y de lectura de izquierda a derecha  
        */
    }
} 
