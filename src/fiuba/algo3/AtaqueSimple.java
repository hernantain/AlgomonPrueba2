
public abstract class AtaqueSimple extends Ataque {
	
	int da�o;
	
	public boolean atacar(Algomon algomon){
		if (cantidad > 0){
			algomon.recibirAtaque((int) (da�o*(tipo.conTipo(algomon.getTipo()))));
			cantidad --;
			return true;
		}
		return false;
	}

}
