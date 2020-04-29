/** Spardha Gupta
 * 1001642027
 * SDP HW 2
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel content;
	Frame frame = new Frame();
	JPanel menu = new JPanel();

	JButton rectangle = new JButton("Box");
	JButton line = new JButton("Line");
	JButton oval = new JButton("Circle");
	JButton undo = new JButton("Undo");
	JButton redo = new JButton("Redo");

	Controller ctrl = new Controller();
	

	public static void main(String[] args) {
		Paint ui = new Paint();
		ui.initUi();
	}

	public void initUi() {
		this.setTitle("Simple Paint GUI - Spardha Gupta");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Creating a menu containing rectangle, line, undo and redo. 
		menu.setPreferredSize(new Dimension(100, 200));
		menu.add(rectangle);
		rectangle.addActionListener(e -> { //Implementing Observer Pattern - ActionListener
			ctrl.setShape("rectangle");
		});
		
		menu.add(line);
		line.addActionListener(e -> { //Implementing Observer Pattern - ActionListener
			ctrl.setShape("line");
		});
		
		menu.add(oval);
		oval.addActionListener(e -> {
			ctrl.setShape("oval");
		});
	
		menu.add(undo);
		menu.add(redo);
		this.add(menu, java.awt.BorderLayout.WEST);

		// Adding a white frame
		frame.setBackground(Color.white);
		frame.setVisible(true);
		
		this.add(frame, java.awt.BorderLayout.CENTER);
		
		this.setVisible(true);
		Graphics g = frame.getGraphics();
		ctrl.setGraphics(g);
		frame.addMouseListener(ctrl);
		
		undo.addActionListener(e -> { //Implementing Observer Pattern - ActionListener
			ctrl.action("undo");
			repaint();
		});
		redo.addActionListener(e -> { //Implementing Observer Pattern - ActionListener
			ctrl.action("redo");
			repaint();
		});
	}

}
