import java.util.Scanner;

public class Tarefa4String {
    public static void gerarLosango(int largura) {
        int metade = largura / 2;
        
        // Parte superior do losabgo
        for (int i = 0; i <= metade; i++) {
            for (int j = 0; j < metade - i; j++) {
                System.out.print(" ");
            }
            for (char letra = 'A'; letra < 'A' + (2 * i + 1); letra++) {
                System.out.print(letra);
            }
            System.out.println();
        }
        
        // Parte inferior do losango
        for (int i = metade - 1; i >= 0; i--) {
            for (int j = 0; j < metade - i; j++) {
                System.out.print(" ");
            }
            for (char letra = 'A'; letra < 'A' + (2 * i + 1); letra++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a largura do losango: ");
        int largura = teclado.nextInt();        
        gerarLosango(largura);
    }
}
