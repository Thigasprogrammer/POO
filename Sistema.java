/* 1. Dentro da pasta src, crie uma pasta chamada Balanca (balança) e armazene ali todos os
códigos Java solicitados a seguir.
Construa uma classe de domínio chamada Pessoa. Uma Pessoa conhece o seu nome, idade,
gênero, peso e altura. Além disso, qualquer Pessoa é capaz de calcular e informar o valor
numérico do seu IMC (índice de massa corporal) e do seu BT (percentual de gordura corporal).
Construa uma classe Sistema que execute o seguinte processamento:
- Leia uma quantidade indeterminada de dados referentes à pessoas do tipo Pessoa. Para cada
pessoa lida, criar um objeto Pessoa e usar suas propriedades para calcular e exibir os seus
valores de IMC e BC. A leitura é interrompida quando é fornecido um nome de pessoa igual a
vazio.
Antes do término do programa, exibir os dados da pessoa com maior IMC.
(*) Pesquise na internet como se clacula o IMC e o BT.  */
import java.util.Scanner;

public class Sistema{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Pessoa person = new Pessoa();

		System.out.print("Nome: ");
		person.nome = teclado.nextline();

		while(person.nome != ""){
		
			System.out.print("Peso: ");
			person.peso = teclado.nextDouble();
	
			System.out.print("Altura: ");
			person.altura = teclado.nextDouble();
	

			System.out.print("Nome: " + person.nome);
			System.out.println("IMC: " + person.imc());
	
			System.out.print("Nome da próxima pessoa digite caractere vazio para terminar o programa: ");
			person.nome = teclado.nextline();
		}
	}


}