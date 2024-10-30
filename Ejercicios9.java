
/*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15 */

import java.util.Scanner;

public class Ejercicios9 {
     public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("   CONVERTIDOR DE MEDIDAS DE TEMPERATURA   ");
        System.out.println("Introduce la temperatura en grados Celsius: ");
        double gradosCelsius = entrada.nextDouble();

        var Fahrenheit = gradosCelsius * 9/5 + 32;
        var Kelvin = gradosCelsius + 273.15;

        
        System.out.println("Temperatura en  Celsius ingreseada: " +gradosCelsius +"c°" );
        System.out.println("Grados Celsius convertidos a  Fahrenheit: " +Fahrenheit);
        System.out.println("Grados Celsius convertidos a Kelvin: " +Kelvin);

    }
}
