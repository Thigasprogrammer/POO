// 1. Construa um programa Java que gere uma tabela de função trigonométricas. A tabela deve conter as seguintes colunas: ângulo em graus entre 0 e 360, seno do ângulo, cosseno, tângente.

import java.lang.Math;
public class Trigonometria { 
	public static void main(String[] args){
		for(int i=0;i<=360;i++){
		
			double angsen=Math.toRadians(i);
			double resulsen=Math.sin(angsen);
			
			double angcos=Math.toRadians(i);
			double resulcos=Math.cos(angcos);	
			
			double angtan=Math.toRadians(i);
			double resultan=Math.tan(angtan);

            System.out.print("angulo "); System.out.print(i); System.out.print(" ");
			System.out.print("seno "); System.out.printf("%.3f", resulsen); System.out.print(" ");
			System.out.print("cosseno "); System.out.printf("%.3f", resulcos); System.out.print(" ");

			if ((i == 90) || (i == 270)){
			System.out.print("tângente "); System.out.print("não existe"); System.out.print("\n");


			}
			else{
			System.out.print("tângente "); System.out.printf("%.3f", resultan); System.out.print("\n");
			}
			
			System.out.print("--------------------------------------------------------------------------------------------------------------- \n");

		}


	}

}
