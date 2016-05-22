import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class ufo extends JApplet implements ActionListener,MouseListener{
	private static int Times =40;
	JButton btnPlayGame,btnStopGame,btnQuit;
	JLabel txtTime,txtScore;
	JTextField FTime,FScore;
	int score = 0;
	int start = 0 , x=0 , rX1=0 , rY1=0 , xMax1=980 , xMin1 =10, xSpeed1=80 , size1 = 40;
	int y=0 , ySpeed1 = 80 , yMax1 = 730 , yMin1 =110; 
	int rX2=0 , rY2=0 , xMax2=980 , xMin2 =10 , yMin2=110, yMax2=730 , xSpeed2=80, ySpeed2=80 , size2 = 40 ;
	int rX3=0 , rY3=0 , xMax3=980 , xMin3 =10 , yMin3=110, yMax3=730 , xSpeed3=80, ySpeed3=80 , size3 = 40 ;
	int rX4=0 , rY4=0 , xMax4=980 , xMin4 =10 , yMin4=110, yMax4=730 , xSpeed4=80, ySpeed4=80 , size4 = 40 ;
	int rX5=0 , rY5=0 , xMax5=980 , xMin5 =10 , yMin5=110, yMax5=730 , xSpeed5=80, ySpeed5=80 , size5 = 40 ;
	int rX6=0 , rY6=0 , xMax6=980 , xMin6 =10 , yMin6=110, yMax6=730 , xSpeed6=80, ySpeed6=80 , size6 = 40 ;
	int rX7=0 , rY7=0 , xMax7=980 , xMin7 =10 , yMin7=110, yMax7=730 , xSpeed7=80, ySpeed7=80 , size7 = 40 ;
	int rX8=0 , rY8=0 , xMax8=980 , xMin8 =10 , yMin8=110, yMax8=730 , xSpeed8=80, ySpeed8=80 , size8 = 40 ;
	int rX9=0 , rY9=0 , xMax9=980 , xMin9 =10 , yMin9=110, yMax9=730 , xSpeed9=80, ySpeed9=80 , size9 = 40 ;
	private ImageIcon m1;
	int active1 = 0,active2 = 0,active3 = 0,active4 = 0,active5 = 0,active6 = 0,active7 = 0,active8 = 0,active9 = 0;
	private Timer t;
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
		rX1 = (int )(Math.random() * 1024 + 100);
	    rY1 = (int )(Math.random() * 786 + 10);
		rX2 = (int )(Math.random() * 1024 + 100);
	    rY2 = (int )(Math.random() * 786 + 10);
		rX3 = (int )(Math.random() * 1024 + 100);
	    rY3 = (int )(Math.random() * 786 + 10);
	    rX4 = (int )(Math.random() * 1024 + 100);
	    rY4 = (int )(Math.random() * 786 + 10);
	    rX5 = (int )(Math.random() * 1024 + 100);
	    rY5 = (int )(Math.random() * 786 + 10);
	    rX6 = (int )(Math.random() * 1024 + 100);
	    rY6 = (int )(Math.random() * 786 + 10);
	    rX7 = (int )(Math.random() * 1024 + 100);
	    rY7 = (int )(Math.random() * 786 + 10);
	    rX8 = (int )(Math.random() * 1024 + 100);
	    rY8 = (int )(Math.random() * 786 + 10);
	    rX9 = (int )(Math.random() * 1024 + 100);
	    rY9 = (int )(Math.random() * 786 + 10);
	    addMouseListener(this);
		t = new Timer(800,this);
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
			if (active1==0){
				m1.paintIcon(this,g,rX1,rY1);
			}else {
				
			}
			if (active2==0){
				m1.paintIcon(this,g,rX2,rY2);
			}else {
				
			}
			if (active3==0){
				m1.paintIcon(this, g, rX3, rY3);
			}else{
				
			}
			if (active4==0){
				m1.paintIcon(this, g, rX4, rY4);
			}else{
				
			}
			if (active5==0){
				m1.paintIcon(this, g, rX5, rY5);
			}
			if (active6==0){
				m1.paintIcon(this, g, rX6, rY6);
			}else{
				
			}
			if (active7==0) {
				m1.paintIcon(this, g, rX7, rY7);
			}else{
				
			}
			if (active8==0){
				m1.paintIcon(this, g, rX8, rY8);
			}else {
				
			}
			if (active9==0){
				m1.paintIcon(this, g, rX9, rY9);
			}else {
				
			}	
		}	
	}
	public void fw()
	{	
		 Times--;
		 FTime.setText(Times+"");
//		 System.out.println(Times);
		 rX1 = rX1 + xSpeed1;
		 rY1 = rY1 + ySpeed1;
			 if (rX1 < xMin1) {
				 rX1 = xMin1;
				 xSpeed1 = -xSpeed1;
				 }
				 else if (rX1+size1 > xMax1) {
				 rX1 = xMax1 - size1;
				 xSpeed1 = -xSpeed1;
				 }
				 if (rY1 < yMin1) {
				 rY1 = yMin1;
				 ySpeed1 = -ySpeed1;
				 }
				 else if (rY1+size1 > yMax1) {
				 rY1 = yMax1 - size1;
				 ySpeed1 = -ySpeed1;
//				 m1.paintIcon(c, g, rX1, rY1);
				 }
		
		 rX2 = rX2 + xSpeed2;
		 rY2 = rY2 + ySpeed2;
		 if (rX2 < xMin2) {
		 rX2 = xMin2;
		 xSpeed2 = -xSpeed2;
		 }
		 else if (rX2+size2 > xMax2) {
		 rX2 = xMax2 - size2;
		 xSpeed2 = -xSpeed2;
		 }
		 if (rY2 < yMin2) {
		 rY2 = yMin2;
		 ySpeed2 = -ySpeed2;
		 }
		 else if (rY2+size2 > yMax2) {
		 rY2 = yMax2 - size2;
		 ySpeed2 = -ySpeed2;
		 }
		 rX3 = rX3 + xSpeed3;
		 rY3 = rY3 + ySpeed3;
		 if (rX3 < xMin3) {
		 rX2 = xMin2;
		 xSpeed3 = -xSpeed3;
		 }
		 else if (rX3+size3 > xMax3) {
		 rX3 = xMax3 - size3;
		 xSpeed3 = -xSpeed3;
		 }
		 if (rY3 < yMin3) {
		 rY3 = yMin3;
		 ySpeed3 = -ySpeed3;
		 }
		 else if (rY3+size3 > yMax3) {
		 rY3 = yMax3 - size2;
		 ySpeed3 = -ySpeed3;
		 }
		 rX4 = rX4 + xSpeed4;
		 rY4 = rY4 + ySpeed4;
		 if (rX4 < xMin4) {
		 rX4 = xMin4;
		 xSpeed4 = -xSpeed4;
		 }
		 else if (rX4+size4 > xMax4) {
		 rX4 = xMax4 - size4;
		 xSpeed4 = -xSpeed4;
		 }
		 if (rY4 < yMin4) {
		 rY4 = yMin4;
		 ySpeed4 = -ySpeed4;
		 }
		 else if (rY4+size4 > yMax4) {
		 rY4 = yMax4 - size4;
		 ySpeed4 = -ySpeed4;
		 }
		 rX5 = rX5 + xSpeed5;
		 rY5 = rY5 + ySpeed5;
		 if (rX5 < xMin5) {
		 rX5 = xMin5;
		 xSpeed5 = -xSpeed5;
		 }
		 else if (rX5+size5 > xMax5) {
		 rX5 = xMax5 - size5;
		 xSpeed5 = -xSpeed5;
		 }
		 if (rY5 < yMin5) {
		 rY5 = yMin5;
		 ySpeed5 = -ySpeed5;
		 }
		 else if (rY5+size5 > yMax5) {
		 rY5 = yMax5 - size5;
		 ySpeed5 = -ySpeed5;
		 }
		 rX6 = rX6 + xSpeed6;
		 rY6 = rY6 + ySpeed6;
		 if (rX6 < xMin6) {
		 rX6 = xMin6;
		 xSpeed6 = -xSpeed6;
		 }
		 else if (rX6+size6 > xMax6) {
		 rX6 = xMax6 - size6;
		 xSpeed6 = -xSpeed6;
		 }
		 if (rY6 < yMin6) {
		 rY6 = yMin6;
		 ySpeed6 = -ySpeed6;
		 }
		 else if (rY6+size6 > yMax6) {
		 rY6 = yMax6 - size6;
		 ySpeed6 = -ySpeed6;
		 }
		 rX7 = rX7 + xSpeed7;
		 rY7 = rY7 + ySpeed7;
		 if (rX7 < xMin7) {
		 rX7 = xMin7;
		 xSpeed7 = -xSpeed7;
		 }
		 else if (rX7+size7 > xMax7) {
		 rX7 = xMax7 - size7;
		 xSpeed7 = -xSpeed7;
		 }
		 if (rY7 < yMin7) {
		 rX7 = yMin7;
		 ySpeed7 = -ySpeed7;
		 }
		 else if (rY7+size7 > yMax7) {
		 rY6 = yMax7 - size7;
		 ySpeed7 = -ySpeed7;
		 }
		 rX8 = rX8 + xSpeed8;
		 rY8 = rY8 + ySpeed8;
		 if (rX8 < xMin8) {
		 rX8 = xMin8;
		 xSpeed8 = -xSpeed8;
		 }
		 else if (rX8+size8 > xMax8) {
		 rX8 = xMax8 - size8;
		 xSpeed8 = -xSpeed8;
		 }
		 if (rY8 < yMin8) {
		 rY8 = yMin8;
		 ySpeed8 = -ySpeed8;
		 }
		 else if (rY8+size8 > yMax8) {
		 rY8 = yMax8 - size8;
		 ySpeed8 = -ySpeed8;
		 }
		 rX9 = rX9 + xSpeed9;
		 rY9 = rY9 + ySpeed9;
		 if (rX9 < xMin9) {
		 rX9 = xMin9;
		 xSpeed9 = -xSpeed9;
		 }
		 else if (rX9+size9 > xMax9) {
		 rX9 = xMax9 - size9;
		 xSpeed9 = -xSpeed9;
		 }
		 if (rY9 < yMin9) {
		 rY9 = yMin9;
		 ySpeed9 = -ySpeed9;
		 }
		 else if (rY9+size9 > yMax9) {
		 rY9 = yMax9 - size9;
		 ySpeed9 = -ySpeed9;
		 
		 }
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX()>=rX1&&e.getX()<=(rX1+70)&&e.getY()>=rY1&&e.getY()<=(rY1+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r1");
		rX1=6000;
		rY1=6000;
		score++;
		FScore.setText(score+"");
		active1=1;
		repaint();
		
		
		}
		if(e.getX()>=rX2&e.getX()<=(rX2+70)&&e.getY()>=rY2&&e.getY()<=(rY2+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r2");
		rX2=6000;
		rY2=6000;
		score++;
		FScore.setText(score+"");
		active2=1;
		repaint();
		
		}
		if(e.getX()>=rX3&&e.getX()<=(rX3+70)&&e.getY()>=rY3&&e.getY()<=(rY3+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r3");
		rX3=6000;
		rY3=6000;
		score++;
		FScore.setText(score+"");
		active3=1;
		repaint();
		}
		if(e.getX()>=rX4&&e.getX()<=(rX4+70)&&e.getY()>=rY4&&e.getY()<=(rY4+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r4");
		rX4=6000;
		rY4=6000;
		score++;
		FScore.setText(score+"");
		active4=1;
		repaint();
		}
		if(e.getX()>=rX5&&e.getX()<=(rX5+70)&&e.getY()>=rY5&&e.getY()<=(rY5+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r5");
		rX5=6000;
		rY5=6000;
		score++;
		FScore.setText(score+"");
		active5=1;
		repaint();
		}
		if(e.getX()>=rX6&&e.getX()<=(rX6+70)&&e.getY()>=rY6&&e.getY()<=(rY6+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r6");
		rX6=6000;
		rY6=6000;
		score++;
		FScore.setText(score+"");
		active6=1;
		repaint();
		}
		if(e.getX()>=rX7&&e.getX()<=(rX7+70)&&e.getY()>=rY7&&e.getY()<=(rY7+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r3");
		rX7=6000;
		rY7=6000;
		score++;
		FScore.setText(score+"");
		active7=1;
		repaint();
		}
		if(e.getX()>=rX8&&e.getX()<=(rX8+70)&&e.getY()>=rY8&&e.getY()<=(rY8+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r8");
		rX8=6000;
		rY8=6000;
		score++;
		FScore.setText(score+"");
		active8=1;
		repaint();
		}
		if(e.getX()>=rX9&&e.getX()<=(rX9+70)&&e.getY()>=rY9&&e.getY()<=(rY9+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r9");
		rX9=6000;
		rY9=6000;
		score++;
		FScore.setText(score+"");
		active9=1;
		repaint();
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
