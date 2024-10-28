package atividadeslogica;

import java.util.Scanner;

public class ativ4 {
public static void main(String[] args) {
	
	float n1, n2, n3, n4, calculo;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.printf("Informe o primeiro número: ");
	n1 = ler.nextFloat();
	
	System.out.printf("Informe o primeiro número: ");
	n2 = ler.nextFloat();
	
	System.out.printf("Informe o primeiro número: ");
	n3 = ler.nextFloat();
	
	System.out.printf("Informe o primeiro número: ");
	n4 = ler.nextFloat();
	
	calculo = (n1*n2)-(n3*n4);
	
	System.out.printf("O calculo é: "+calculo);
	n1 = ler.nextFloat();
	
	ler.close();
	
	}
}
