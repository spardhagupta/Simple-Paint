/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */
import java.util.List;

import java.util.ArrayList;

public class Panel {
	private static Panel panel;
	
	private List<MyShape> before;
	private List<MyShape> after;
	private Command com;
	
	private Panel() {
		//Panel class implements Composite Pattern.
		before = new ArrayList<MyShape>(); 
		after = new ArrayList<MyShape>();
	}
	
	public static Panel getpanel() {     
        if (panel == null) {
            panel = new Panel();
        }

        return panel;
    }
	
	public Command getCommand() {
		return this.com;
	}
	
	public void setCommand(Command com) {
        this.com = com;
    }
	
	public void addBefore(MyShape shape) {
		MyShape s = new MyShape();
		s.x = shape.x;
		s.y = shape.y;
		s.type = shape.type;
		before.add(s); //Implementing Composite Pattern
	}
	
	public void removeBefore(int index) {
		before.remove(index);
	}
	
	public List<MyShape> getBefore() {
		return before;
	}
	
	public void undo() {
		List<MyShape> before = getBefore();
		if(before.size() > 0) {
		MyShape shape = before.get(before.size() - 1);
		removeBefore(before.size() - 1);
		addAfter(shape);
		} //Implementing Composite Pattern
	}
	
	public void addAfter(MyShape shape) {
		MyShape s = new MyShape();
		s.x = shape.x;
		s.y = shape.y;
		s.type = shape.type;
		after.add(s); //Implementing Composite Pattern
	}
	
	public void removeAfter(int index) {
		after.remove(index);
	}
	
	public List<MyShape> getAfter() {
		return after;
	}
	
	public void redo() {
		List<MyShape> after = getAfter();
		if(after.size() > 0) {
    	MyShape shape = after.get(after.size() - 1);
		removeAfter(after.size() - 1);
		addBefore(shape);
		} //Implementing Composite Pattern
	}
}
