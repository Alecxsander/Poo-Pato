package pato;

public class Pato {
	
	private String nome;
	private Voo voo;
	private Grasnar som;
	
	public Pato (){
		this.nome = "Qualquer";
		this.voo = new Voo();
		this.som = new Grasnar();
	}
	
	public Pato(String nome, Voo voo, Grasnar som){
		this.nome = nome;
		this.voo = voo;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public void setSom(Grasnar som) {
		this.som = som;
	}
	
	public void usarVoo(){
		System.out.println(nome + " " + voo.ativar() +" e " + som.ativarSom());
	}
	
}
