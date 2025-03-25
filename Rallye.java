import java.util.Scanner; //import para o código aceitar input
import java.lang.Math; 


public class Rallye { 
	Scanner digitar = new Scanner(System.in);

    public static list dados(){
    		list lst_dados //lista que contem a lista de equipes e de tempos, respectivos a sua posição
    	 	list lst_inscricoes;
    	 	list lst_tempos;
    	 	list lst_3tempos; // essa lista vai conter os 3 tempos juntos e vai ocupar a posição correspondente a da inscrição, dar append em dados e zerar ela no começo do loop?
    	 	int inscricao;
    	 	float tempo1;
    	 	float tempo2;
    	 	float tempo3;

    	 	System.out.print("DIGITE A INSCRIÇÃO DA EQUIPE: "); 
    	 	inscricao = digitar.nextInt(); //acrescentar esssa inscrição na lst_inscricoes aqui

    	 	while(inscricao =! 9999){
    	 	// zerar lst_3tempos para sempre acrescentar uma lista diferente em lst_tempos
    	 	System.out.print("DIGITE O TEMPO DA EQUIPE EM MINUTOS DECIMAIS DA ETAPA 1: "); 
    	 	tempo1 = digitar.nextFloat() //acrescentar tempo na lst_3tempos

    	 	System.out.print("DIGITE O TEMPO DA EQUIPE EM MINUTOS DECIMAIS DA ETAPA 1: "); 
    	 	tempo1 = digitar.nextFloat() //acrescentar tempo na lst_3tempos

    	 	System.out.print("DIGITE O TEMPO DA EQUIPE EM MINUTOS DECIMAIS DA ETAPA 1: "); 
    	 	tempo1 = digitar.nextFloat() //acrescentar tempo na lst_3tempos

    	 	System.out.print("DIGITE A INSCRIÇÃO DA EQUIPE: "); 
    	 	inscricao = digitar.nextInt(); //acrescentar esssa inscrição na lst_inscricoes aqui

    	 	// colocar a lst_3tempos na lst_tempos, assim cada posição tera uma lista de 3 valores


    	 	}
    	 	// quando acabar unir as duas listas na lst_dados com, equipes e tempos, respectiamente


    	 	return lst_dados; // retorna a lista de dados de todas as equipes, incluindo a lista de inscricoes e lista de tempos

    	 public static void pontuacao(float tp1, float tp2, float tp3){
    	 	float tpadrao1;
	        float tpadrao2;
	        float tpadrao3;
			
			System.out.print("DIGITE O 1º TEMPO-PADRÃO EM MINUTOS DECIMAIS: "); 
			tpadrao1 = digitar.nextFloat();
	        System.out.print("DIGITE O 2º TEMPO-PADRÃO EM MINUTOS DECIMAIS: "); 
			tpadrao2 = digitar.nextFloat();
	        System.out.print("DIGITE O 3º TEMPO-PADRÃO EM MINUTOS DECIMAIS: "); 
			tpadrao3 = digitar.nextFloat(); 

    	 }

        
       
	}
	public static void main(String[] args){ 
		pontuacao()

        
		
	}

}

