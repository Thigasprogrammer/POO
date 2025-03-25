import java.util.Scanner; //import para o código aceitar input
import java.lang.Math; 


public class Triangulo { 
    public static String classificacao(float a, float b, float c){ 
        
        String classific = ("É TRIÂNGULO, PORÉM, NÃO É TRIÂNGULO RETÂNGULO");

		if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)){
            String classific1 = ("É TRIÂNGULO RETÂNGULO");
            return classific1;
        }
        return classific;

	}
	public static void main(String[] args){ 
		Scanner digitar = new Scanner(System.in);
		float A;
        float B;
        float C;
		
		System.out.print("DIGITE O PRIMEIRO LADO DO TRIÂNGULO, CATETO OPOSTO: "); 
		A = digitar.nextInt();
        System.out.print("DIGITE O SEGUNDO LADO DO TRIÂNGULO, CATETO ADJACENTE: "); 
		B = digitar.nextInt();
        System.out.print("DIGITE O TERCEIRO LADO DO TRIÂNGULO, HIPOTENUSA: "); 
		C = digitar.nextInt(); 

		if(A+B>=C && B+C>=A && A+C>=B){
        		System.out.print(classificacao(A, B, C));

        }

        else{
        System.out.print("NÃO É UM TRIÂNGULO");
        }
		
	}

}

