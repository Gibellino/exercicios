import java.util.ArrayList;
import java.util.Scanner;

import exercicios.Aluno;
import exercicios.Exe1;
import exercicios.Exe2;


public class Main {

	static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ex1();
		ex2();
		//ex3();
		
	}
	
	public static void ex1(){
		
		int[] n = new int[]{2,4,6,8};
		
		int n1,p;
		
		System.out.println("Insira um numero");
		n1 = read.nextInt();
		
		n = new Exe1().addN(n1,n);
		
		System.out.println("\n");
		
		new Exe1().listar(n);
		
		System.out.println("\nEscolha a posição do numero que deseja eliminar: ");
		p = read.nextInt();
		
		p--;
		
		n = new Exe1().delNum(p, n);
		
		System.out.println("\n");
		
		new Exe1().listar(n);
		
	}
	
	public static void ex2(){
		
		ArrayList<String> list = new ArrayList<String>(){{
			
			add("b");
			add("3");
			add("Carruagens");
			add("8.56");
			add("caixa de armazenamento");
		
		}};
		
		String q;
		
		System.out.print("\nInsira o que quiser: ");
		q = read.nextLine();
		
		list = new Exe2().add(list,q);
		
		new Exe2().listar(list);
		
	}

	public static void ex3(){
		

		ArrayList<Aluno> al = new ArrayList<Aluno>();
		
		int nota=0;
		String nome, contacto;
		
		for(int i=0; i<5; i++){
			
			System.out.print("\n Insira o nome do aluno " + (i+1) + ": ");
			nome = read.nextLine();
			
			System.out.print(" Insira a nota do aluno " + (i+1) + ": ");
			nota = read.nextInt();
			
			System.out.print(" Insira o contacto do aluno " + (i+1) + ": ");
			contacto = read.nextLine();
			
			Aluno a = new Aluno(nota,contacto,nome);
			
			al.add(a);
		}
	}
	
}
