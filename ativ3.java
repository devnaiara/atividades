package atividadeslogica;

import java.util.Scanner;

public class ativ3 {
public static void main(String[] args) {
	
	float salariobruto, adicionalnoturno, horasextras, descontoscolaborador, salarioliquido;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.printf("Informe o salário bruto: ");
	salariobruto = ler.nextFloat();
	
	System.out.printf("Informe o adicional noturno: ");
	adicionalnoturno = ler.nextFloat();
	
	System.out.printf("Informe as horas extras: ");
	horasextras = ler.nextFloat();
	
	System.out.printf("Informe os descontros do colaborador: ");
	descontoscolaborador = ler.nextFloat();
	
	salarioliquido = salariobruto + adicionalnoturno + (horasextras * 5) - descontoscolaborador;
	
	System.out.printf("O seu salário líquido é: "+salarioliquido);

	ler.close();
	}
}
