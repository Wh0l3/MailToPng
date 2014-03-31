package gifMail;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class listener implements ActionListener {
	private JTextField textField;
	  private JLabel label;

	  public listener(JTextField tf, JLabel l)
	  {
	    textField = tf;
	    label = l;
	  }

	  public void actionPerformed(ActionEvent ae)
	  {
	    String text = textField.getText();

	    String ergebnisText = "";
	    try
	    {
	      double zahl = Double.parseDouble(text);
	      double quadrat = zahl * zahl;
	      ergebnisText = "" + quadrat;
	    }
	    catch(NumberFormatException ex)
	    {
	      ergebnisText = "keine Zahl";
	    }

	    label.setText(ergebnisText);
	    textField.setText("Zahl eingeben");
	  }
}
