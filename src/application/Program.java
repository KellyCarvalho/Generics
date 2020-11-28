package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//Para manter a seguran�a de tipos, durante a instancia��o se pode definir o tipo de v�riaveis que a implementa��o ir� aceitar
		
		//tipos inteiros
		PrintService<Integer> ps = new PrintService<>();
		//Tipos strings
				PrintService<String> ps2 = new PrintService<>();
		System.out.println("Quantos valores?");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int posicao =i+1;
			System.out.println("Informe o "+posicao+"� valor");
			int valor = sc.nextInt();
			ps.adicionarValor(valor);
			
		}
		System.out.println("Primeiro: "+ps.primeiro());
		ps.print();
		System.out.println();
		
		sc.close();
	}

}
