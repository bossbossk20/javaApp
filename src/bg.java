import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class bg extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bg g = new bg();
		g.setSize(400,400);
		g.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setContentPane(new JLabel(new ImageIcon("p2.jpg")));
	}

}
