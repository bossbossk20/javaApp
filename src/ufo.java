import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ufo extends JApplet implements ActionListener{

	JButton btnPlayGame,btnStopGame,btnQuit;
	JLabel txtTime,txtScore;
	JTextField FTime,FScore;
	int start = 0 , x=0 , randomX=0 , randomY=0 , xMax=780 , xMin =1, xSpeed=80 , size = 40;
	int y=0 , ySpeed = 0 , yMax = 1024 , yMin =1; 
	private ImageIcon m1;
	private Timer t ;
	//Picture image1;
	
	ImageIcon myLogo = new ImageIcon("bg.gif");
	
	public static void main(String[] args) {
		ufo g = new ufo();
		g.setSize(1024,768);
		g.setVisible(true);			
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPlayGame)
		{
			btnPlayGame.setVisible(true);//´ËÕπ
//			btnStopGame.setVisible(false);
			btnQuit.setVisible(true);
			start =1;
			System.out.println("god");
			t.start();
		}else{
			fw();
			repaint();
		}
	}
	public void init()
	{
		randomY = (int )(Math.random() * 1024 + 100);
	    randomY = (int )(Math.random() * 786 + 10);
		t = new Timer(1000,this);
		Container c = getContentPane();
		//setContentPane(new  JLabel(new ImageIcon("bg.gif")));
		getContentPane().setLayout(null); 
		m1 = new ImageIcon("ufo.png");
		btnPlayGame = new JButton("Play Game");
		btnPlayGame.addActionListener(this);
		btnPlayGame.setBounds(300, 10, 100, 25);

		c.add(btnPlayGame);
		
		btnStopGame = new JButton("Stop Game");
		btnStopGame.setBounds(420, 10, 100, 25);
		c.add(btnStopGame);
		
		btnQuit = new JButton("Quit");
		btnQuit.setBounds(540, 10, 100, 25); 
		c.add(btnQuit);
		
		txtTime = new JLabel("Time : ");
		txtTime.setBounds(150, 40, 100, 25);
		c.add(txtTime);
		
		FTime = new JTextField(10);
		FTime.setEditable(false);//‰¡Ë„ÀÈ„ Ë§Ë“‰¥È
		FTime.setBounds(200, 40, 100, 25);
		c.add(FTime);
		
		txtScore = new JLabel("Score :");
		txtScore.setBounds(550, 40, 100, 25);
		c.add(txtScore);
		
		FScore = new JTextField(10);
		FScore.setEditable(false);//‰¡Ë„ÀÈ„ Ë§Ë“‰¥È
		FScore.setBounds(600, 40, 100, 25);
		c.add(FScore);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawRect(10, 70, 1000, 30);
		g.setColor(Color.BLUE);
		g.drawRect(10, 110, 1000, 630);
//		myLogo.paintIcon(this,g,10,110);
		if(start==1){
		m1.paintIcon(this,g,x,y);
		
		}	
	}
	public void fw()
	{	
		 x = x + xSpeed;
		 y = y + ySpeed;
		 if (x < xMin) {
		 x = xMin;
		 xSpeed = -xSpeed;
		 }
		 else if (x+size > xMax) {
		 x = xMax - size;
		 xSpeed = -xSpeed;
		 }
		 if (y < yMin) {
		 y = yMin;
		 ySpeed = -ySpeed;
		 }
		 else if (y+size > yMax) {
		 y = yMax - size;
		 ySpeed = -ySpeed;
		 } 
	}
}
