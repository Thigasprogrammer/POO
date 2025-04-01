import java.util.Scanner;

public class Tarefa4String {
    public static void gerarLosango(int largura) {
        int metade = largura / 2;
        String alfabeto = "ABCDEFGHIJKLMNO0PQRSTUVWXYZ";

        // parte superior do losango
        for(int i = 0; i <= metade; i++){
            for (int j = 0; j < metade - i; j++) {
                System.out.print(" ");
            }
            System.out.println(alfabeto.substring(0, 2 * i + 1));
        }

        // parte inferior do losango
        for(int i = metade - 1; i >= 0; i--){
            for (int j = 0; j < metade - i; j++) {
                System.out.print(" ");
            }
            System.out.println(alfabeto.substring(0, 2 * i + 1));
        }



    }   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a largura do losango: ");
        int largura = teclado.nextInt();        
        while(largura % 2 == 0 ){
            System.out.print("Não é possível gerar o losango com esse número, digite um impar e positivo: ");
            largura = teclado.nextInt();        

        }
        gerarLosango(largura);
        
    }
}
