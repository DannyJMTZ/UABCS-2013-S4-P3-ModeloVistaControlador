import java.awt.Color;

// CONTROLADOR
public class ControladorCuadro {
	
	private ClaseCuadro[] arreglo;
	
	public ControladorCuadro( int elementos ) {
		arreglo = new ClaseCuadro[elementos];
	}

	public void agregar (ClaseCuadro cuadro) {
		if( getIndex() != -1 )
			arreglo[getIndex()] = cuadro;
	}
	
	public int getIndex () {
		for(int index = 0; index < arreglo.length; index++){
			if( arreglo[index] == null){
				return index;
			}
		}
		return -1;
	}
	
	public ClaseCuadro[] getArreglo() {return arreglo;}
	public Color getColorArreglo(int pos){return arreglo[pos].getColor();}
	public int getPosXArreglo(int pos){return arreglo[pos].getPosX();};
	public int getPosYArreglo(int pos){return arreglo[pos].getPosY();};
	
	public void mostrar () {
		for(int index = 0; index < arreglo.length; index++){
			if(arreglo[index] != null){
				System.out.println("Color: " + arreglo[index].getColor());
				System.out.println("PosX : " + arreglo[index].getPosX());
				System.out.println("PosY : " + arreglo[index].getPosY());
			}
		}
	}
}
