import java.util.Scanner;
public class Desafio2String {
    public static void Foundwords(String txt){
        String word = "";
        String biggestword = "";
        String smallestword = ""; 
        
        System.out.print("PALAVRAS ENCONTRADAS \n" + "====================\n");
        for(int i = 0; i < txt.length(); i++){
    
        if((txt.charAt(i) != ' ') && (txt.charAt(i) != '.') && (txt.charAt(i) != ',') && (txt.charAt(i) != ':')){
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
        Scanner write = new Scanner(System.in);
        System.out.println("Digite abaixo o texto a ser analisado: \n");
        String text = write.nextLine();
        Foundwords(text);

    }//main
}//class
