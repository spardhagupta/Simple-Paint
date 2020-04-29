/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Controller.java is implementing Controller Pattern;
public class Controller extends MouseAdapter {  // Implements Adaptor Pattern

	private Graphics graphics;
	private Panel panel;

	public Controller() {
		panel = Panel.getpanel();
	};

	public void setGraphics(Graphics g) {
		graphics = g;
	}
	// Implements Adaptor Pattern
	public void mousePressed(MouseEvent e) { //It gets invoked on mouse click. 
		Command com = panel.getCommand();
		MyShape shape = com.getShape();
		shape.x = e.getX();
		shape.y = e.getY();
		com.execute(graphics, shape);
	}

	public void setShape(String type) {
		Command shapeCommand;
		MyShape shape = new MyShape();
		if (type == "rectangle") {
			shape.type = "rectangle";
			shapeCommand = new MyRectangle(shape);
		}
		else if (type == "oval"){
			shape.type = "oval";
			shapeCommand = new MyOval(shape);
		}
		else {
			shape.type = "line";
			shapeCommand = new MyLine(shape);
		}
		
	}
	
	public void action(String type) {
		if(type == "undo")
			Panel.getpanel().undo();
		else
			Panel.getpanel().redo();
	}
}
