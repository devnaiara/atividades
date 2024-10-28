package atividadeslogica;

import java.util.Scanner;

public class ativ2 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	float nota1, nota2, nota3, nota4, mediafinal;
	
	System.out.printf("Informe a primeira nota: ");
	nota1 = ler.nextFloat();
	
	System.out.printf("Informe a segunda nota: ");
	nota2 = ler.nextFloat();
	
	System.out.printf("Informe a terceira nota: ");
	nota3 = ler.nextFloat();
	
	System.out.printf("Informe a quarta nota: ");
	nota4 = ler.nextFloat();
	
	mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.printf("Sua médica final é: "+mediafinal);
	
	ler.close();
	
	}
}
