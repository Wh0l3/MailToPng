package gifMail;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class window extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new window();
	}
	
	public window(){
		super("Der Quadrator");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    getContentPane().setLayout(new FlowLayout());

	    JTextField textField = new JTextField("Email Adresse");
	    getContentPane().add(textField);

	    JButton button = new JButton("Als GIF");
	    getContentPane().add(button);

	    JLabel label = new JLabel("Ergebnis");
	    getContentPane().add(label);

	   button.addActionListener(new listener(textField, label));

	    setLocation(250, 190);
	    setSize(300, 90);
	    setVisible(true);
	}

}
