import java.util.Scanner; //import para o código aceitar input

public class Fatorial { //a classe deve ser sempre o nome do arquivo, se for class Tabuleiro o arquivo deverá se chamar Tabuleiro.java
	public static int fatorial(int n){ // define uma função, "public static" essa vai ser utilizada na função principal. 
									  // a sintaxe é, o que ela retorna 'int' o nome de dela 'fatorial' e depois o que ela recebe os parametros 'int n'

		int f = 1; //sempre ponto e virgula depois de usar um comando
		// primeiro coloca-se o tipo de variável depois a variável

		for(int i = 1; i <= n; i = i + 1){ //o for funciona assim for(quando começa; condição de parada; de quanto em quanto o for anda, pode ser i++)
			f = f*i;
		} 
		return f; 
	}
	public static void main(String[] args){ //void significa que a função não retorna nada; o main sempre será o programa principal, diferente do python que podemos escolher;
	// 'String[] args' é obrigatório em java, ele serve para

		Scanner digitar = new Scanner(System.in); // padrão para criar um input, o único alteravel é o nome da variável 'digitar'
		int num;
		
		System.out.print("DIGITE UM VALOR INTEIRO POSITIVO "); //print do java, esse daqui serve para o usuario saber o que digitar

		num = digitar.nextInt(); // input do java, é o nome da variável scanner e nextint ou nextfloat, etc

		System.out.print("o fatorial de "); 
		System.out.print(num);
		System.out.print(" é igual a ");
		System.out.println(fatorial(num));



		System.out.print("SEJA BEM VINDO AO JAVA THIAGAO \n"); //print do java

		System.out.println("o ln pula a linha");

		System.out.printf("o printf faz o print aceitar valores %d \n", fatorial(num)); //System.out.printf <- o f permite a entrada de dados no print("SEJA BEM VINDO AO JAVA THIAGAO %d <- acrescenta um campo pra valor int \n <- pula a linha", f <- valor adicionado);
		// todo comando é sempre executado por uma 'pessoa' (agente que executa uma ação, objeto) dentro de algum lugar, por exemplo o comando print é executado pelo out (objeto) que fica dentro do System
	}

}

//a classe deve ser sempre o nome do arquivo, se for class Tabuleiro o arquivo deverá se chamar Tabuleiro.java
//o programa principal sempre será main
//sempre usar ; depois de um comando
//primeiro coloca-se o tipo de variável depois a variável
//o arquivo sempre deve ser utilizado letra maiuscula em um arquivo
//colocar no cmd "javac Nomedoarquivo.java" o que faz com que o arquivo seja lido em binário pelo computador
//após isso colocar no cmd "java Nomedoarquivo" para executa-lo