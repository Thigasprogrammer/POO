// 4. Construa um programa Java para calcular e exibir o resultado da raiz quadrada de S, sendo
// que S é dado pela seguinte expressão:
// S = (37 x 38)/1 + (36 x 37)/2 + (35 x 36)/3 + ... + (1 x 2)/37

import java.lang.Math; 
public class ExpressãoS { 
	public static void main(String[] args){
		float s;
		float q = 1.00f;
		float sum = 0;
		float root;

		for(float i = 38.00f; i >= 2; i--){
			s = ((i-1) * i)/ q;
			q = q + 1;
			sum = sum + s;
		}
		System.out.printf("%.2f", (Math.sqrt(sum)));
	}
}