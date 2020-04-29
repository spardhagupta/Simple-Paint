/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */

import java.awt.Graphics;
//Implements Command Pattern
public class MyOval implements Command {
	public MyShape getShape() {
		return shape;
	}

	private MyShape shape;
	public MyOval(MyShape shape) {
		this.shape = shape;
		Panel.getpanel().setCommand(this);
	}
	

	@Override
	public void execute(Graphics graphics, MyShape shape) { //Implementing Command Pattern
		Panel.getpanel().addBefore(shape);
		graphics.drawOval(shape.x, shape.y, 100, 100);
	}

}
