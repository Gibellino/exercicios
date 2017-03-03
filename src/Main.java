import java.util.Scanner;

import exercicios.Exe1;

public class Main {

	
	static int[] n = new int[]{2,4,6,8};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int n1,p;
		
		System.out.println("Insira um numero");
		n1 = read.nextInt();
		
		n = new Exe1().addN(n1,n);
		
		System.out.println("\n");
		
		new Exe1().listar(n);
		
		System.out.println("Escolha a posição do numero que deseja eliminar: ");
		p = read.nextInt();
		
		p--;
		
		n = new Exe1().delNum(p, n);
		
		System.out.println("\n");
		
		new Exe1().listar(n);
		
	}

}
