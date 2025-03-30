import java.util.Scanner; //import para o código aceitar input

public class String2{
	public static int vowelcounter(String text){
		int quant = 0;
		int size = text.length();
		for(int i = 0; i < size; i++){
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
				quant = quant + 1;
			}
		}
		return quant;

		}


	public static void main(String[] args){
		Scanner write = new Scanner(System.in);
		int quant;
		System.out.print("digite uma palavra ou frase para contar as vogais: ");
		String text = write.nextLine();
		quant = vowelcounter(text);
		System.out.print(text + " tem " + quant + " vogais");

	}//main



}//class