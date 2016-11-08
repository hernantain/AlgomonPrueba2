
public class Squirtle extends Algomon {

	public Squirtle(){
		tipo = new TipoAgua();
		vida = 150;
		ataques.put("Burbuja", new Burbuja());
		ataques.put("Ca�on de Agua", new Ca�onDeAgua());
		ataques.put("Ataque Rapido", new AtaqueRapido());
	}
}
