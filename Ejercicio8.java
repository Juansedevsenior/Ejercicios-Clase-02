
/*Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud 
y el ancho del rectángulo. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("  PROGRAMA PARA CALCULAR EL AREA Y PERIMETRO DE UN RECTANGULO  ");
        System.out.println("Dijite la altura del rectangulo");
        var alturaRec = entrada.nextInt();
        System.out.println("Dijite la base  del rectangulo:");
        var baseRec = entrada.nextInt();

        var perimetroRec =  (baseRec + alturaRec) *2;
        var areaRec =  baseRec * alturaRec;

        System.out.println("El perimetro del rectangulo es de: "+perimetroRec);
        System.out.println("El are del rectangulo es de: "+areaRec);

    }
}
