
import java.awt.Color;

// MODELO
public class ClaseCuadro {
	
	private int posX;
	private int posY;
	private Color color;
	
	public ClaseCuadro(int posX, int posY, Color color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	public ClaseCuadro(Color color) {
		this.color = color;
	}

	public ClaseCuadro() {}

	public int getPosX() {return posX;}
	public void setPosX(int posX) {this.posX = posX;}
	public int getPosY() {return posY;}
	public void setPosY(int posY) {this.posY = posY;}
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
	
}
