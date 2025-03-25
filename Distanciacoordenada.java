// 3. Construa um programa Java que gere 10 sequencias de 2 pares de corodenadas x, y. Cada par
// de coordenadas representa 1 ponto no plano. Para cada par de pontos gerados, calcular a
// distância entre os dois e exibir como saída: x1, y1 e x2, y2, distância: <valor da distância>.

import java.lang.Math;


public class Distanciacoordenada { 
	public static void main(String[] args){ 
		for(int i = 1; i <= 10; i++){
			double x1 = Math.random();
			double x2 = Math.random();
			double y1 = Math.random();
			double y2 = Math.random();

			double distancia = Math.sqrt((Math.pow(x2 - x1, 2))+(Math.pow(y2 - y1, 2)));

			System.out.printf("x1: %.2f, y1: %.2f e x2: %.2f, y2: %.2f, distância: %.2f \n", x1, y1, x2, y2, distancia);

		}
		

        
		
	}

}

