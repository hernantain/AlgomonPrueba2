
public class Charmander extends Algomon{
	
	public Charmander(){
		tipo = new TipoFuego();
		vida = 170;
		ataques.put("Brasas", new Brasas());
		// Ac� falta el ataque Fogonazo que todav�a no es necesario
		ataques.put("Ataque Rapido", new AtaqueRapido());
	}

}
