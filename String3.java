public class String3{
	public static void asteriscoA(){
		String ast = "";
		int altura = 10;

		for(int i = 1; i <= altura; i++){
			for(int j = 0; j < i; j++){
				ast = ast + "*";
			}
			ast = ast + '\n';
		}
		System.out.println(ast);
	}
	public static void asteriscoB(){
		String ast = "";
		int altura = 1;

		for(int i = 10; i >= altura; i--){
			for(int j = 0; j < i; j++){
				ast = ast + "*";
			}
			ast = ast + '\n';
		}
		System.out.println(ast);
	}
    public static void asteriscoC() {
        String ast = "";
        int altura = 10;

        for (int i = altura; i > 0; i--) {
            ast = "";
            for (int j = 0; j < altura - i; j++) {
                ast = ast + " ";
            }
            for (int j = 0; j < i; j++) {
                ast = ast + "*";
            }
            System.out.println(ast);
        }
    }

    public static void asteriscoD() {
        String ast = "";
        int altura = 10;

        for (int i = 0; i < altura; i++) {
            ast = "";
            for (int j = 1; j < altura - i; j++) {
                ast = ast + " ";
            }
            for (int j = 0; j <= i; j++) {
                ast = ast + "*";
            }
            System.out.println(ast);
        }
    }

	public static void main(String[] args){
 		asteriscoA();
		asteriscoB();
		asteriscoC();
		asteriscoD();
	}

}