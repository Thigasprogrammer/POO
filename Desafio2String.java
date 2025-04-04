// tirar pontos e virgulas após terminar o codigo
// teste.charAt(i).isDigit() (verifica se a caractere é um digito)
// teste.charAt(i).isLetter() (verifica se o caractere é uma letra)


import java.util.Scanner;
public class Desafio2String {
	public static void Foundwords(String txt){
	    String word = "";
		int letter;
		String biggestword = "";
		String smallestword = ""; 
        
        System.out.print("PALAVRAS ENCONTRADAS \n" + "====================\n");
		for(int i = 0; i < txt.length(); i++){

			if(txt.charAt(i) != ' '){
				word = word + txt.charAt(i);
			}
			else{
				if(word.length() >= 4){
					if (word.length()>biggestword.length()){
			    	biggestword = word;
				    }
				    if (word.length() <= smallestword.length() || smallestword == ""){
				    	smallestword = word;
				    }
					System.out.println(word);
					word = "";
				} 
				else{
					word = "";
				}
			}
		
		}
		if(word.length() >= 4){
		    System.out.println(word);
		}
		System.out.println("MAIOR PALAVRA ENCONTRADA: " + biggestword);
		System.out.println("MENOR PALAVRA ENCONTRADA: " + smallestword);


	} //Foundwords
    public static void main(String[] args){
        String a = ": Escreva um programa em Java que percorra um texto tipo String e exiba na tela as palavras que forem sendo encontradas. Descarte palavras com menos de 4 letras. Ao final, o programa deve exibir a maior e a menor palavra que foi exibida na tela. O texto de entrada é fornecido pelo usuário. ";
    	Foundwords(a);

    }//main
}//class
