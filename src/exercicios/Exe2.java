package exercicios;

import java.util.ArrayList;

public class Exe2 {
	
	
	public ArrayList<String> add(ArrayList<String> list, String string){
		
		list.add(string);
		
		return list;
		
	}
	
	public void listar(ArrayList<String> list){
		
		System.out.println("");
		
		for(int i=0; i < list.size();i++){
			System.out.println(" Elemento " + (i+1) + ": " + list.get(i));
		}
		
	}
	
	
}
