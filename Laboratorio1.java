// 2. Construa um programa Java que gere uma tabela de fatoriais. A tabela deve conter as seguintes colunas: número, entre zero e 15, valor do fatorial do número.


public class Laboratorio1 { //a classe deve ser sempre o nome do arquivo, se for class Tabuleiro o arquivo deverá se chamar Tabuleiro.java
	public static int fatorial(int n){ // define uma função, "public static" essa vai ser utilizada na função principal. 
									  // a sintaxe é, o que ela retorna 'int' o nome de dela 'fatorial' e depois o que ela recebe os parametros 'int n'

		int f = 1; //sempre ponto e virgula depois de usar um comando
		// primeiro coloca-se o tipo de variável depois a variável

		for(int i = 1; i <= n; i = i + 1){ //o for funciona assim for(quando começa; condição de parada; de quanto em quanto o for anda, pode ser i++)
			f = f*i;
		} 
		return f; 
	}
	public static void main(String[] args){
		for(int i = 0; i <= 15; i =  i + 1){
			System.out.print(i); System.out.print(" = "); System.out.println(fatorial(i));



		}


	}




}