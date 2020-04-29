/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */

import java.awt.Graphics;
//Implements Command Pattern
public class MyLine implements Command {
	public MyShape getShape() {
		return shape;
	}
	private MyShape shape;
    public MyLine(MyShape shape) {
		this.shape = shape;
		Panel.getpanel().setCommand(this);
	}

	
	@Override
	public void execute(Graphics graphics, MyShape shape) { // Implementing Command Pattern
		Panel.getpanel().addBefore(shape);
		graphics.drawLine(shape.x, shape.y, shape.x + 100, shape.y);
	}

}
