/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */
		
import java.awt.Graphics;
//Command.java implements Command Pattern.
public interface Command {
	public void execute(Graphics graphics, MyShape shape);
    public MyShape getShape();
}
