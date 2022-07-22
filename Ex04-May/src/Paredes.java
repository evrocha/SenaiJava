
public class Paredes {
	private float hp; // altura parede
	private float lp;	// largura parede
	
	public float getHp() {
		return hp;
	}
	public void setHp(float hp) {
		this.hp = hp;
	}
	public float getLp() {
		return lp;
	}
	public void setLp(float lp) {
		this.lp = lp;
	}
	
	public float areaTotalParede() {
		return hp*lp;
	}
	// area total / total azul
	
}
