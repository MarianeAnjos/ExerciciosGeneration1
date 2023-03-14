package PacoteJava;

import java.util.Scanner;

public class Ecerc3 {
	public static void main(String args[]) {
		float salarioBruto , adicionalNoturno , horasExtras, descontos, total;
		Scanner Leia = new Scanner (System.in);
		
		System.out.println("\n Entre com o Salario Bruto: ");
		salarioBruto = Leia.nextFloat();
		
		System.out.println("\n Entre com o Adicional Noturno: ");
		adicionalNoturno = Leia.nextFloat();
		
		System.out.println("\n Entre com as Horas Extras: ");
		horasExtras = Leia.nextFloat();
		
		System.out.println("\n Entre com os descontos: ");
		descontos = Leia.nextFloat();
		
		total = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.println("\n O valor total é:" +total);
	}
}
