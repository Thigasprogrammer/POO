// Construa uma aplicação Java que faça o trabalho de uma calculadora de quantidade de calor Q.
// O programa deve ler a massa de um corpo (em gramas), 
// o calor específico da substância (em cal/g°C)
// e a variação de temperatura (ΔT, em °C).
// O programa deve calcular e exibir na tela a quantidade de calor necessária para aquecer o corpo, usando a fórmula:
// Q=m×c×ΔT



import java.util.Scanner; //import para o código aceitar input


public class Calculartemp { 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float massa;
        float calor;
        float vartemp;
        float q;

        System.out.print("digite a massa em gramas do corpo: ");
        massa = teclado.nextFloat();
        System.out.print("digite o calor específico da substância a em graus Celsius: ");
        calor = teclado.nextFloat();
        System.out.print("digite a variação de temperatura em graus Celsius do corpo: ");
        vartemp = teclado.nextFloat();
        q = massa*calor*vartemp;

        if(massa > 0){
            System.out.printf("A quantidade de calor necessária para aquecer o corpo é de %.2fº Celsius", q);
        }

        else{
            System.out.print("não existe massa menor ou igual a 0");
        }





    }
}
