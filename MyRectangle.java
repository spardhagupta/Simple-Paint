/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */

import java.awt.Graphics;
//Implements Command Pattern
public class MyRectangle implements Command {
	public MyShape getShape() {
		return shape;
	}

	private MyShape shape;
	public MyRectangle(MyShape shape) {
		this.shape = shape;
		Panel.getpanel().setCommand(this);
	}
	

	@Override
	public void execute(Graphics graphics, MyShape shape) { //Implementing Command Pattern
		Panel.getpanel().addBefore(shape);
		graphics.drawRect(shape.x, shape.y, 100, 100);
	}

}
