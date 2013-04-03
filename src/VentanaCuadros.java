import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

// VISTA
public class VentanaCuadros extends JFrame {
	
	ControladorCuadro cc;
	
	public VentanaCuadros(){
		this.setSize(500, 500);
		this.setTitle("Modelo Vista Controlador");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		cc = new ControladorCuadro(5);
		cc.agregar(new ClaseCuadro(50, 50, Color.BLUE));
		cc.agregar(new ClaseCuadro(110, 50, Color.BLUE));
		cc.agregar(new ClaseCuadro(170, 50, Color.BLUE));
	}
	
	
	public void paint( Graphics g ){
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double rect1;
		for(int index = 0; index < cc.getArreglo().length; index++){
			if(cc.getArreglo()[index] != null){
				
				g2.setPaint(cc.getColorArreglo(index));
				rect1 = new Rectangle2D.Double(cc.getPosXArreglo(index), cc.getPosYArreglo(index), 50, 50);
				g2.fill(rect1);
			}
			
		}
		
		
		//g2.draw(new Line2D.Double(100, 100, 150, 300));
		//g2.draw(new Line2D.Double(150, 300, 250, 100));
		//g2.draw(new Rectangle2D.Double(50, 50, 150, 300));
		//g2.draw(new RoundRectangle2D.Double(90, 90, 150, 150, 10, 10));
		//g2.setPaint( Color.LIGHT_GRAY );
		//g2.fillPolygon(new int[]{ 473, 512, 562, 526} , new int[]{ 300, 320, 290, 272}, 4);
				
		//*********************************************************************
		//					RECTANGULO CON PERSPECTIVA
		
		// primer rectangulo
		/*Rectangle2D.Double rect1 = new Rectangle2D.Double(50, 50, 50, 50);
		g2.setPaint( Color.CYAN );
		g2.fill(rect1);
		
		// pinta 2 cara como un poligono
		g2.setPaint( Color.LIGHT_GRAY);
		int[] x2 = {100, 300, 300, 100};
		int[] y2 = {50, 100, 200, 100};
		g.fillPolygon(x2, y2, 4);

		g2.setPaint( Color.DARK_GRAY );
		int[] x1 = {50, 200, 200, 50};
		int[] y1 = {50, 100, 200, 100};
		g.fillPolygon(x1, y1, 4);*/
		
		// segundo rectangulo
		/*g2.setPaint( Color.BLUE );
		Rectangle2D.Double rect2 = new Rectangle2D.Double(200, 100, 100, 100);
		g2.fill(rect2);*/
		
		
		//*********************************************************************
		//					OJO
		/*g2.setPaint( Color.DARK_GRAY);
		Ellipse2D.Double elipse2 = new Ellipse2D.Double(220, 280, 80, 80);
		g2.fill(elipse2);
		
		g2.setPaint( Color.LIGHT_GRAY);
		Ellipse2D.Double elipse1 = new Ellipse2D.Double(240, 300, 40, 40);
		g2.fill(elipse1);
		
		g2.draw(new Arc2D.Double(160, 160, 200, 200, 200, 140, Arc2D.OPEN));
		g2.draw(new Arc2D.Double(160, 280, 200, 200, 20, 140, Arc2D.OPEN));*/
		
		
		//*********************************************************************
		//					DIBUJA UNA CUADRICULA
		/*for(int i = 0; i <= 500; i+= 10){
			g2.draw(new Line2D.Double( 0, i, 500, i));
			g2.draw(new Line2D.Double( i, 0, i , 500));
		}*/
	}
	
	
}
