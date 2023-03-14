package PacoteJava;
import java.util.Scanner;

public class Exerc4 {
	public static void main(String args[]) {
		
		float n1 , n2 , n3 , n4 , diferenca;
		Scanner Leia = new Scanner (System.in);
		
		System.out.println("\n Entre com o primeiro número: ");
		n1 = Leia.nextFloat();
		
		System.out.println("\n Entre com o segundo número: ");
		n2 = Leia.nextFloat();
		
		System.out.println("\n Entre com o terceiro número: ");
		n3 = Leia.nextFloat();
		
		System.out.println("\n Entre com o quarto número: ");
		n4 = Leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		System.out.println("\n A diferença é de:" +diferenca);
	}
}
