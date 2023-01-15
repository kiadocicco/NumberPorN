import java.util.Scanner;

public class Calcula {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		boolean test=false;
		do {
		System.out.println("Digite um número diferente de 0");
		int number=teclado.nextInt();
		
		
			test=false;
			if(number==0) {
				System.out.println("Entrada inválida!");
				test=true;
				
			}else if(number>0) {
				System.out.println("O número digitado é positivo");
				test=false;
				
			}else {
				System.out.println("O número digitado é negativo");
				test=false;
				
			}	
			}while(test==true);
		}
	

	}

