package atividadeslogica;

import java.util.Scanner;

public class ativ1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novosalario;
		
		System.out.printf("Informe o salário: ");
		salario = ler.nextFloat();
		
		System.out.printf("Informe o abono: ");
		abono = ler.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.printf("Seu novo salário é: "+novosalario);
			
	   ler.close();
		
	}

}
