// 2. Construa um programa Java que gere uma tabela de fatoriais. A tabela deve conter as seguintes colunas: número, entre zero e 15, valor do fatorial do número.


public class Fatorialatv { 
	public static long fatorial(int n){  

		long f = 1; 
		

		for(long i = 1; i <= n; i++){ 
			f = f*i;
		} 
		return f; 
	}
	public static void main(String[] args){
		for(int i = 0; i <= 15; i =  i + 1){
			System.out.print(i); 
			System.out.printf("! = %d \n", fatorial(i)); 



		}


	}




}
