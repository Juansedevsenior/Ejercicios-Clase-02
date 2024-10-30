
/*En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga
en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
¿Crees que es correcto el precio?
En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. */


public class Ejercicio2 {
    public static void main(String[] args) {
        
        double pernilIbericPor100Gramos = 5.95;
        double precioTotalPorKilo = pernilIbericPor100Gramos *10;
        /*Se multiplica por 10 ya que 1 kg = (1000) gramos asi que al tener solo 100 gramos en el problema necesitamos
        10 porciones para llegar al kilogramo.*/

        System.out.println("El precio por kilo es: " + precioTotalPorKilo + " Euros.");

        /*
         Segun el resultado, el precio que nos da el vendedor esta mal, ya que realizando la operacion nos da 59.5 €
         con esto verificamos que el vendedor plantea el precio de 29.75  como un kilo pero esta mal ya que este precio
         seria para medio kilo que seria 500 gramos asi que este es el error
         */
    }
}
