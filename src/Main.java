import java.util.*;

import exercicios.Aluno;
import exercicios.Exe1;
import exercicios.Exe2;


public class Main {

	static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ex1();
		//ex2();
		ex3();
		
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
		
		al.add(new Aluno("Manel",15,"987654321"));
		al.add(new Aluno("Joaquim",18,"123456789"));
		al.add(new Aluno("Alfredo",10,"456987321"));
		al.add(new Aluno("Geremias",5,"321998765"));
		al.add(new Aluno("Felismina",20,"132645879"));
		
		Collections.sort(al, Aluno.Comparators.NOTA);
		
		for(int i=0; i<5; i++){
			
			System.out.println("Aluno " + (i+1) + ":"
					+ "\n Nome: " + al.get(i).getNome()
					+ "\n Nota: " + al.get(i).getNota()
					+ "\n Contacto: " + al.get(i).getContacto());
			
		}
		
	}
	
}
