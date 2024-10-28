package atividadeslogica;

import java.util.Scanner;

public class ativ3 {
public static void main(String[] args) {
	
	float salarioBruto, adicionalNoturno, horasExtras, descontosColaborador, salarioLiquido;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.printf("Informe o salário bruto: ");
	salarioBruto = ler.nextFloat();
	
	System.out.printf("Informe o adicional noturno: ");
	adicionalNoturno = ler.nextFloat();
	
	System.out.printf("Informe as horas extras: ");
	horasExtras = ler.nextFloat();
	
	System.out.printf("Informe os descontros do colaborador: ");
	descontosColaborador = ler.nextFloat();
	
	salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontosColaborador;
	
	System.out.printf("O seu salário líquido é: "+salarioLiquido);

	ler.close();
	}
}
