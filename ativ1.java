package atividadeslogica;

import java.util.Scanner;

public class ativ1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.printf("Informe o salário: ");
		salario = ler.nextFloat();
		
		System.out.printf("Informe o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu novo salário é: "+novoSalario);
			
	   ler.close();
		
	}

}
