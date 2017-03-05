package exercicios;

import java.util.Comparator;

public class Aluno {

	public String nome;
	public int nota;
	public String contacto;
	
	public Aluno(String nome, int nota, String contacto) {
		this.nome = nome;
		this.nota = nota;
		this.contacto = contacto;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static class Comparators{
		
		public static Comparator<Aluno> NOTA = new Comparator<Aluno>() {
            
            public int compare(Aluno a1, Aluno a2) {
                return a1.nota - a2.nota;
            }
		};
	}
}