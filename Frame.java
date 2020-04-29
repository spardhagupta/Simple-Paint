/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */
import java.awt.Graphics; // Application of AWT
import java.awt.Graphics2D;
import javax.swing.JPanel; // Application of Swing

public class Frame extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public Frame() {
	      super();
	   }
	   @Override
	   public void paintComponent(Graphics gr) {
	      super.paintComponent(gr); // Adding super.paintComponent(gr) before custom painting. Preparing Graphics. 
			Graphics2D g = (Graphics2D) gr;
	         Panel.getpanel().getBefore().forEach(shape ->{  // Implementing Iterator Pattern
	        	 if(shape.type.equals("rectangle")){
		                g.drawRect(shape.x, shape.y, 100, 100); //drawRect -- using java applet
		            }
	        	 if(shape.type.contentEquals("oval")) {
	        		 g.drawOval(shape.x, shape.y, 100, 100); //drawOval -- using java applet
	        	 }
	        	 if(shape.type.equals("line")){
	                g.drawLine(shape.x, shape.y, shape.x + 100, shape.y); //drawLine -- using java applet
	            }
	            
	       });
	   }
}
