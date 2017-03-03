package exercicios;

import java.util.ArrayList;

public class Exe1 {
	
	
	
	ArrayList<Integer> x = new ArrayList<Integer>();
	
	public int[] addN(int n1, int[] n){
		
		
		int[] temp = new int[n.length+1];
		
		
		
		for(int i=0; i< n.length; i++){
			temp[i] = n[i];
		}
		
		n = temp;
		
		n[n.length-1] = n1;
		
		return n;
	}
	
	public void listar(int[] n){
		
		for(int i=0; i< n.length; i++){
			System.out.println(" " + (i+1) + " - " + n[i]);
		}
		
	}
	
	public int[] delNum(int p, int[] n){
		
		for(int i=p; i<n.length;i++){
			if(i < (n.length-1)){
				n[i]=n[i+1];
			}
		}
		
		int[] temp = new int[n.length-1];
		
		for(int i=0; i< temp.length; i++){
			temp[i] = n[i];
		}
		
		n = temp;
		
		return n;
		
	}
	
}
