import java.util.Scanner; //import para o código aceitar input
import java.lang.Math; 


public class Rallye { 

    public static void dadosepontuacao(float tp1, float tp2, float tp3){
        Scanner digitar = new Scanner(System.in);

            int inscricao = 0; 
            float pontetapa1 = 0f; 
            float pontetapa2 = 0f;  
            float pontetapa3 = 0f; 
            float pontotal = 0f;  
            int inscricaovencedor = 0; 
            float etapa1vencedor = 0f;  
            float etapa2vencedor = 0f; 
            float etapa3vencedor = 0f; 
            float maior = 0f; 
 
    	 	System.out.print("DIGITE A INSCRIÇÃO DA EQUIPE: ");

    	 	inscricao = digitar.nextInt(); //acrescentar esssa inscrição na lst_inscricoes aqui

    	 	while(inscricao != 9999){

        	 	System.out.printf("DIGITE O TEMPO DA EQUIPE %d EM MINUTOS DECIMAIS DA ETAPA 1: ", inscricao); 
        	 	float tempo1 = digitar.nextFloat(); 

        	 	System.out.printf("DIGITE O TEMPO DA EQUIPE %d EM MINUTOS DECIMAIS DA ETAPA 2: ", inscricao); 
        	 	float tempo2 = digitar.nextFloat(); 

        	 	System.out.printf("DIGITE O TEMPO DA EQUIPE %d EM MINUTOS DECIMAIS DA ETAPA 3: ", inscricao); 
        	 	float tempo3 = digitar.nextFloat();

                float d1 = Math.abs(tp1 - tempo1); // usado para deixar o valor absoluto
                float d2 = Math.abs(tp2 - tempo2); // usado para deixar o valor absoluto
                float d3 = Math.abs(tp3 - tempo3); // usado para deixar o valor absoluto

                // Definir a pontuação da etapa 1
                if (d1 < 3f) {
                    pontetapa1 = 100f;
                } else if (3f <= d1 && d1 <= 5f) {
                    pontetapa1 = 80f;
                } else {
                    pontetapa1 = 80f - (d1 - 5f) / 5f;
                }
    
                // Definir a pontuação da etapa 2
                if (d2 < 3f) {
                    pontetapa2 = 100f;
                } else if (3f <= d2 && d2 <= 5f) {
                    pontetapa2 = 80f;
                } else {
                    pontetapa2 = 80f - (d2 - 5f) / 5f;
                }
    
                // Definir a pontuação da etapa 3
                if (d3 < 3f) {
                    pontetapa3 = 100f;
                } else if (3f <= d3 && d3 <= 5f) {
                    pontetapa3 = 80f;
                } else {
                    pontetapa3 = 80f - (d3 - 5f) / 5f;
                }

                pontotal = pontetapa1 + pontetapa2 + pontetapa3;

                System.out.printf("A INSCRIÇÃO DA EQUIPE É %d COM, %.2f PONTOS NA PRIMEIRA ETAPA, %.2f PONTOS NA SEGUNDA ETAPA, %.2f PONTOS NA TERCEIRA ETAPA E UM TOTAL DE %.2f \n", inscricao, pontetapa1, pontetapa2, pontetapa3, pontotal);
            
                // Comparar e verificar se a equipe atual é a vencedora
                if(pontotal > maior){
                    maior = pontotal;
                    inscricaovencedor = inscricao;
                    etapa1vencedor = pontetapa1;
                    etapa2vencedor = pontetapa2;
                    etapa3vencedor = pontetapa3;
                }

        	 	
                System.out.print("DIGITE A INSCRIÇÃO DA PRÓXIMA EQUIPE: ");
                inscricao = digitar.nextInt(); 
    	 	}

            System.out.printf("A INSCRIÇÃO DA EQUIPE VENCEDORA É %d COM, %.2f PONTOS NA PRIMEIRA ETAPA, %.2f PONTOS NA SEGUNDA ETAPA, %.2f PONTOS NA TERCEIRA ETAPA E UM TOTAL DE %.2f \n", inscricaovencedor, etapa1vencedor, etapa2vencedor, etapa3vencedor, maior);
    }

	public static void main(String[] args){ 
	    Scanner digitar = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO VALOR PADRÃO: ");
        float tp1 = digitar.nextFloat();
        System.out.print("DIGITE O SEGUNDO VALOR PADRÃO: ");
        float tp2 = digitar.nextFloat();
        System.out.print("DIGITE O TERCEIRO VALOR PADRÃO: ");
        float tp3 = digitar.nextFloat();

		dadosepontuacao(tp1, tp2, tp3);

        
		
	}

}

