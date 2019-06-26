import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//* Button with a picture of ducks on it. When clicks the text "Quack, quack, quack" appears below button */

public class ImageButton extends JFrame {
	private JButton button;
	private JLabel label;
	
	//Constructor
	public ImageButton() {
		
		ImageIcon ducks = new ImageIcon("fiveducks.jpg"); //image for button
		button = new JButton(ducks); //add image to button
		
		setLayout(new FlowLayout()); //create layout
		add(button); //add button to frame
		
		label = new JLabel(" "); //add empty label for later text
		add(label); //add label
		
		event e = new event(); //create event for clicked button
		button.addActionListener(e);
	}
	
	public class event implements ActionListener { //make clicked button show text below
		public void actionPerformed(ActionEvent e) {
			label.setText("Quack, quack, quack");

		}
	}
	
	public static void main(String[] args) { //create window frame
		ImageButton frame = new ImageButton();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 500);
		frame.setTitle("Ducky");
	}
}
