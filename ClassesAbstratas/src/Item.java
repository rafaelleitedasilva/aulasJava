
public abstract class Item {
	//Atributos privados do item, que definem a posição x e y
	private int posX;
	private int posY;
	
	//Assinatura de método que obrigará as classes herdaeiras a fazerem o override
	public void pegar(){
		
	}

	//Métodos de get and set que não necessariamente vai ser implementado pelas classes herdeiras
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
		
}
