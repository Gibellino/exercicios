package exercicios;

public class Aluno {

	public int nota;
	public String contacto;
	public String nome;
	
	public Aluno(int nota, String contacto, String nome) {
		this.nota = nota;
		this.contacto = contacto;
		this.nome = nome;
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
	
	
	
}
