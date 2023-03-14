package PacoteJava;
import java.util.Scanner;

public class ClasseHello {
	public static void main(String args[])
	{
		float Salario , Abono , NovoSalario;
		
		Scanner Leia = new Scanner (System.in);
		
		System.out.println("\n Entre com o Salário atual");
		Salario = Leia.nextFloat();
		
		System.out.println("\n Entre com o valor do Abono");
		Abono = Leia.nextFloat();
		
		NovoSalario = Salario + Abono;
		System.out.println("O seu novo salario é: "+NovoSalario );
	}
}
