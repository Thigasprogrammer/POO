import java.util.Scanner; //import para o código aceitar input
// 1. Escreva um programa que leia uma string do teclado e verifique se ela é um palíndromo. Uma
// string é considerada um palíndromo se for igual quando lida de trás para frente. Desconsidere
// espaços e diferenças entre maiúsculas e minúsculas.

import java.util.Scanner; //import para o código aceitar input


public class String1{

	public static String reversetext(String tws){
		int size = tws.length();

		String newword = "";


		for(int i = size-1; i >= 0; i--){

			newword = newword + tws.charAt(i);
		}





		return newword;
		}

	public static String removespace(String text){
		String tws = "";
		int size = text.length();
		for(int i = 0; i < size; i++){
			if(text.charAt(i) != ' '){
				tws = tws + text.charAt(i);
			}
		}
		return tws;

		}


	public static void main(String[] args){
		Scanner write = new Scanner(System.in);

		String text = write.nextLine();
		String tws = removespace(text); //text with out space
		String reverse = reversetext(tws);
		
	    if(tws.equals(reverse)){
	        System.out.printf("%s É palíndromo", text);
	    }
	    else{
	        System.out.printf("%s É palíndromo", text);
	    }

	}//main



}//class