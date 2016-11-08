
public class Chansey extends Algomon{
	
	public Chansey(){
		tipo = new TipoNormal();
		vida = 130;

		ataques.put("Latigo Cepa", new LatigoCepa());
		ataques.put("Ataque Rapido", new AtaqueRapido());
	}

}