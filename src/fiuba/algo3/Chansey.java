
public class Chansey extends Algomon{
	
	public Chansey(){
		tipo = new TipoNormal();
		vida = 130;
		// Ac� falta el ataque Canto que todav�a no es necesario
		ataques.put("Latigo Cepa", new LatigoCepa());
		ataques.put("Ataque Rapido", new AtaqueRapido());
	}

}
