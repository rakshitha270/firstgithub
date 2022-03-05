package assignments.applets;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class Sample extends Applet{
	Button b,b1;
	TextField t;
	public void init() {
		add(b = new Button("click"));
		add(t = new TextField(15));
		add(b1 = new Button("clear"));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t.setText("Hello");
			}
			
		});
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				t.setText("");
			}
		});
	}
}