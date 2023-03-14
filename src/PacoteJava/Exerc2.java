package PacoteJava;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String args[]) {
		float NOTA1 , NOTA2, NOTA3, NOTA4, MEDIA;
		
		Scanner Leia = new Scanner (System.in);
		
		System.out.println("\n Entre com a PRIMEIRA nota: ");
		NOTA1 = Leia.nextFloat();
		
		System.out.println("\n Entre com a SEGUNDA nota: ");
		NOTA2 = Leia.nextFloat();
		
		System.out.println("\n Entre com a TERCEIRA nota: ");
		NOTA3 = Leia.nextFloat();
		
		System.out.println("\n Entre com a QUARTA nota: ");
		NOTA4 = Leia.nextFloat();
		
		MEDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4;
		System.out.printf("\n O valor da média do aluno é: %.1f",MEDIA);
		
	}
}
