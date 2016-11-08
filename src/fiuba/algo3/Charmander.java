
public class Charmander extends Algomon{
	
	public Charmander(){
		tipo = new TipoFuego();
		vida = 170;
		ataques.put("Brasas", new Brasas());
		
		ataques.put("Ataque Rapido", new AtaqueRapido());
	}

}
