import java.util.Scanner; //import para o código aceitar input
import java.lang.Math; 


public class Temperatura { 
    public static float farenheit(float graus){

        float temp;
        temp = (graus * 9/5) + 32;

        return temp;

    }
    public static float kelvin(float graus){

        float temp;
        temp = graus + 273.15f;

        return temp;

    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float graus;
        System.out.print("digite quantos graus Celsius você quer converter: ");
        graus = teclado.nextInt();
        System.out.printf("%.2fº Celsius são %.2fº Farenheit e %.2fº Kelvin", graus, farenheit(graus), kelvin(graus));





    }
}