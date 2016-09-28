package pato;

public class TestePato {
	
	public static void main(String[] args) {
		
		Pato p1 = new Pato();
		Pato p2 = new Pato("Max", new Razante(), new Grassitar());
		Pato p3 = new Pato("Dudu", new Borboleta(), new Grasnar());
		Pato p4 = new Pato("Marcos", new Planar(), new Grossitar());
		
		p1.usarVoo();
		p2.usarVoo();
		p3.usarVoo();
		p4.usarVoo();
		
	}

}
