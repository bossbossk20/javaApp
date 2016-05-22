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
	ufoClass u1;
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
	int rX10=0 , rY10=0 , xMax10=980 , xMin10 =10 , yMin10=110, yMax10=730 , xSpeed10=80, ySpeed10=80 , size10 = 40 ;
	int rX11=0 , rY11=0 , xMax11=980 , xMin11 =10 , yMin11=110, yMax11=730 , xSpeed11=80, ySpeed11=80 , size11 = 40 ;
	int rX12=0 , rY12=0 , xMax12=980 , xMin12 =10 , yMin12=110, yMax12=730 , xSpeed12=80, ySpeed12=80 , size12 = 40 ;
	int rX13=0 , rY13=0 , xMax13=980 , xMin13 =10 , yMin13=110, yMax13=730 , xSpeed13=80, ySpeed13=80 , size13 = 40 ;
	int rX14=0 , rY14=0 , xMax14=980 , xMin14 =10 , yMin14=110, yMax14=730 , xSpeed14=80, ySpeed14=80 , size14 = 40 ;
	int rX15=0 , rY15=0 , xMax15=980 , xMin15 =10 , yMin15=110, yMax15=730 , xSpeed15=80, ySpeed15=80 , size15 = 40 ;
	int rX16=0 , rY16=0 , xMax16=980 , xMin16 =10 , yMin16=110, yMax16=730 , xSpeed16=80, ySpeed16=80 , size16 = 40 ;
	int rX17=0 , rY17=0 , xMax17=980 , xMin17 =10 , yMin17=110, yMax17=730 , xSpeed17=80, ySpeed17=80 , size17 = 40 ;
	int rX18=0 , rY18=0 , xMax18=980 , xMin18 =10 , yMin18=110, yMax18=730 , xSpeed18=80, ySpeed18=80 , size18 = 40 ;
	int rX19=0 , rY19=0 , xMax19=980 , xMin19 =10 , yMin19=110, yMax19=730 , xSpeed19=80, ySpeed19=80 , size19 = 40 ;
	int rX20=0 , rY20=0 , xMax20=980 , xMin20 =10 , yMin20=110, yMax20=730 , xSpeed20=80, ySpeed20=80 , size20 = 40 ;
	private ImageIcon m1;
	int active1 = 0,active2 = 0,active3 = 0,active4 = 0,active5 = 0,active6 = 0,active7 = 0,active8 = 0,active9 = 0;
	int active10 = 0,active11 = 0,active12 = 0,active13 = 0,active14 = 0,active15 = 0,active16 = 0,active17 = 0,active18 = 0,active19=0,active20=0;
	private Timer t;
	//Picture image1;
	ImageIcon myLogo = new ImageIcon("bg.gif");
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
		u1 = new ufoClass();
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
	    rX10 = (int )(Math.random() * 1024 + 100);
	    rY10 = (int )(Math.random() * 786 + 10);
	    rX11 = (int )(Math.random() * 1024 + 100);
	    rY11 = (int )(Math.random() * 786 + 10);
	    rX12 = (int )(Math.random() * 1024 + 100);
	    rY12 = (int )(Math.random() * 786 + 10);
	    rX13 = (int )(Math.random() * 1024 + 100);
	    rY13 = (int )(Math.random() * 786 + 10);
	    rX14 = (int )(Math.random() * 1024 + 100);
	    rY14 = (int )(Math.random() * 786 + 10);
	    rX15 = (int )(Math.random() * 1024 + 100);
	    rY15 = (int )(Math.random() * 786 + 10);
	    rX16 = (int )(Math.random() * 1024 + 100);
	    rY16 = (int )(Math.random() * 786 + 10);
	    rX17 = (int )(Math.random() * 1024 + 100);
	    rY17 = (int )(Math.random() * 786 + 10);
	    rX18 = (int )(Math.random() * 1024 + 100);
	    rY18 = (int )(Math.random() * 786 + 10);
	    rX19 = (int )(Math.random() * 1024 + 100);
	    rY19 = (int )(Math.random() * 786 + 10);
	    rX20 = (int )(Math.random() * 1024 + 100);
	    rY20 = (int )(Math.random() * 786 + 10);
	    addMouseListener(this);
		t = new Timer(600,this);
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
		myLogo.paintIcon(this,g,10,110);
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
			if (active10==0){
				m1.paintIcon(this, g, rX10, rY10);
			}else {
				
			}
			if (active11==0){
				m1.paintIcon(this, g, rX11, rY11);
			}else {
				
			}
			if (active12==0){
				m1.paintIcon(this, g, rX12, rY12);
			}else {
				
			}
			if (active13==0){
				m1.paintIcon(this, g, rX13, rY13);
			}else {
				
			}
			if (active14==0){
				m1.paintIcon(this, g, rX14, rY14);
			}else {
				
			}
			if (active15==0){
				m1.paintIcon(this, g, rX15, rY15);
			}else {
				
			}
			if (active16==0){
				m1.paintIcon(this, g, rX16, rY16);
			}else {
				
			}
			if (active17==0){
				m1.paintIcon(this, g, rX17, rY17);
			}else {
				
			}
			if (active18==0){
				m1.paintIcon(this, g, rX18, rY18);
			}else {
				
			}
			if (active19==0){
				m1.paintIcon(this, g, rX19, rY19);
			}else {
				
			}
			if (active20==0){
				m1.paintIcon(this, g, rX20, rY20);
			}else {
				
			}
		}	
	}
	public void fw()
	{	
		 Times--;
		 FTime.setText(Times+"");
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
		 rX3 = xMin3;
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
		 rY3 = yMax3 - size3;
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
		 rX10 = rX10 + xSpeed10;
		 rY10 = rY10 + ySpeed10;
		 if (rX10 < xMin10) {
		 rX10 = xMin10;
		 xSpeed10 = -xSpeed10;
		 }
		 else if (rX10+size10 > xMax9) {
		 rX10 = xMax10 - size10;
		 xSpeed10 = -xSpeed10;
		 }
		 if (rY10 < yMin10) {
		 rY10 = yMin10;
		 ySpeed10 = -ySpeed10;
		 }
		 else if (rY10+size10 > yMax10) {
		 rY10 = yMax10 - size10;
		 ySpeed10 = -ySpeed10;
		 }
		 rX11 = rX11 + xSpeed11;
		 rY11 = rY11 + ySpeed11;
		 if (rX11 < xMin11) {
		 rX11 = xMin11;
		 xSpeed11 = -xSpeed11;
		 }
		 else if (rX11+size11 > xMax11) {
		 rX11 = xMax11 - size11;
		 xSpeed11 = -xSpeed11;
		 }
		 if (rY11 < yMin11) {
		 rY11 = yMin11;
		 ySpeed11 = -ySpeed11;
		 }
		 else if (rY11+size11 > yMax11) {
		 rY11 = yMax11 - size11;
		 ySpeed11 = -ySpeed11;
		 }
		 rX12 = rX12 + xSpeed12;
		 rY12 = rY12 + ySpeed12;
		 if (rX12 < xMin12) {
		 rX12 = xMin12;
		 xSpeed12 = -xSpeed12;
		 }
		 else if (rX12+size12 > xMax12) {
		 rX12 = xMax12 - size12;
		 xSpeed12 = -xSpeed12;
		 }
		 if (rY12 < yMin12) {
		 rY12 = yMin12;
		 ySpeed12 = -ySpeed12;
		 }
		 else if (rY12+size12 > yMax12) {
		 rY12 = yMax12 - size12;
		 ySpeed12 = -ySpeed12;
		 }
		 rX13= rX13 + xSpeed13;
		 rY13 = rY13 + ySpeed13;
		 if (rX13 < xMin13) {
		 rX13 = xMin13;
		 xSpeed13 = -xSpeed13;
		 }
		 else if (rX13+size13 > xMax13) {
		 rX13 = xMax13 - size13;
		 xSpeed13 = -xSpeed13;
		 }
		 if (rY13 < yMin13) {
		 rY13 = yMin13;
		 ySpeed13 = -ySpeed13;
		 }
		 else if (rY13+size13 > yMax13) {
		 rY13 = yMax13 - size13;
		 ySpeed13 = -ySpeed13;
		 }
		 rX14 = rX14 + xSpeed14;
		 rY14 = rY14 + ySpeed14;
		 if (rX14 < xMin14) {
		 rX14 = xMin14;
		 xSpeed14 = -xSpeed14;
		 }
		 else if (rX14+size14 > xMax14) {
		 rX14 = xMax14 - size14;
		 xSpeed14 = -xSpeed14;
		 }
		 if (rY14 < yMin14) {
		 rY14 = yMin14;
		 ySpeed14 = -ySpeed14;
		 }
		 else if (rY14+size14 > yMax14) {
		 rY14 = yMax14 - size14;
		 ySpeed14 = -ySpeed14;
		 }
		 rX15 = rX15 + xSpeed15;
		 rY15 = rY15 + ySpeed15;
		 if (rX15 < xMin15) {
		 rX15 = xMin15;
		 xSpeed15 = -xSpeed15;
		 }
		 else if (rX15+size15 > xMax15) {
		 rX15 = xMax15 - size15;
		 xSpeed15 = -xSpeed15;
		 }
		 if (rY15 < yMin15) {
		 rY15 = yMin15;
		 ySpeed15 = -ySpeed15;
		 }
		 else if (rY15+size15 > yMax15) {
		 rY15 = yMax15 - size15;
		 ySpeed15 = -ySpeed15;
		 }
		 rX16 = rX16 + xSpeed16;
		 rY16 = rY16 + ySpeed16;
		 if (rX16 < xMin16) {
		 rX16 = xMin16;
		 xSpeed16 = -xSpeed16;
		 }
		 else if (rX16+size16 > xMax16) {
		 rX16 = xMax16 - size16;
		 xSpeed16 = -xSpeed16;
		 }
		 if (rY16 < yMin16) {
		 rY9 = yMin9;
		 ySpeed16 = -ySpeed16;
		 }
		 else if (rY16+size16 > yMax16) {
		 rY16 = yMax16 - size16;
		 ySpeed16 = -ySpeed16;
		 }
		 rX17 = rX17 + xSpeed17;
		 rY17 = rY17 + ySpeed17;
		 if (rX17 < xMin17) {
		 rX17 = xMin17;
		 xSpeed17 = -xSpeed17;
		 }
		 else if (rX17+size17 > xMax17) {
		 rX17 = xMax17 - size17;
		 xSpeed17 = -xSpeed17;
		 }
		 if (rY17 < yMin17) {
		 rY17 = yMin17;
		 ySpeed17 = -ySpeed17;
		 }
		 else if (rY17+size17 > yMax17) {
		 rY17 = yMax17 - size17;
		 ySpeed17 = -ySpeed17;
		 }
		 rX18 = rX18 + xSpeed18;
		 rY18 = rY18 + ySpeed18;
		 if (rX18 < xMin18) {
		 rX18 = xMin18;
		 xSpeed18 = -xSpeed18;
		 }
		 else if (rX18+size18 > xMax18) {
		 rX18 = xMax18 - size18;
		 xSpeed18 = -xSpeed18;
		 }
		 if (rY18 < yMin18) {
		 rY18 = yMin18;
		 ySpeed18 = -ySpeed18;
		 }
		 else if (rY18+size18 > yMax18) {
		 rY18 = yMax18 - size18;
		 ySpeed18 = -ySpeed18;
		 }
		 rX19 = rX19 + xSpeed19;
		 rY19 = rY19 + ySpeed19;
		 if (rX19 < xMin19) {
		 rX19 = xMin19;
		 xSpeed19 = -xSpeed19;
		 }
		 else if (rX19+size19 > xMax19) {
		 rX19 = xMax19 - size19;
		 xSpeed19 = -xSpeed19;
		 }
		 if (rY19 < yMin19) {
		 rY19 = yMin19;
		 ySpeed19 = -ySpeed19;
		 }
		 else if (rY19+size19 > yMax19) {
		 rY19 = yMax19 - size19;
		 ySpeed19 = -ySpeed19;
		 }
		 rX20 = rX20 + xSpeed20;
		 rY20 = rY20 + ySpeed20;
		 if (rX20 < xMin20) {
		 rX20 = xMin20;
		 xSpeed20 = -xSpeed20;
		 }
		 else if (rX20+size20 > xMax20) {
		 rX20 = xMax20 - size20;
		 xSpeed20 = -xSpeed20;
		 }
		 if (rY20 < yMin20) {
		 rY20 = yMin20;
		 ySpeed20 = -ySpeed20;
		 }
		 else if (rY20+size20 > yMax20) {
		 rY20 = yMax20 - size20;
		 ySpeed20 = -ySpeed20;
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
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active1=1;
		repaint();
		
		
		}
		if(e.getX()>=rX2&e.getX()<=(rX2+70)&&e.getY()>=rY2&&e.getY()<=(rY2+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r2");
		rX2=6000;
		rY2=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active2=1;
		repaint();
		
		}
		if(e.getX()>=rX3&&e.getX()<=(rX3+70)&&e.getY()>=rY3&&e.getY()<=(rY3+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r3");
		rX3=6000;
		rY3=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active3=1;
		repaint();
		}
		if(e.getX()>=rX4&&e.getX()<=(rX4+70)&&e.getY()>=rY4&&e.getY()<=(rY4+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r4");
		rX4=6000;
		rY4=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active4=1;
		repaint();
		}
		if(e.getX()>=rX5&&e.getX()<=(rX5+70)&&e.getY()>=rY5&&e.getY()<=(rY5+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r5");
		rX5=6000;
		rY5=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active5=1;
		repaint();
		}
		if(e.getX()>=rX6&&e.getX()<=(rX6+70)&&e.getY()>=rY6&&e.getY()<=(rY6+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r6");
		rX6=6000;
		rY6=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active6=1;
		repaint();
		}
		if(e.getX()>=rX7&&e.getX()<=(rX7+70)&&e.getY()>=rY7&&e.getY()<=(rY7+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r3");
		rX7=6000;
		rY7=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active7=1;
		repaint();
		}
		if(e.getX()>=rX8&&e.getX()<=(rX8+70)&&e.getY()>=rY8&&e.getY()<=(rY8+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r8");
		rX8=6000;
		rY8=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active8=1;
		repaint();
		}
		if(e.getX()>=rX9&&e.getX()<=(rX9+70)&&e.getY()>=rY9&&e.getY()<=(rY9+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r9");
		rX9=6000;
		rY9=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active9=1;
		repaint();
		}
		if(e.getX()>=rX10&&e.getX()<=(rX10+70)&&e.getY()>=rY10&&e.getY()<=(rY10+60))
		{
		
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r10");
		rX10=6000;
		rY10=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active10=1;
		repaint();
		}
		if(e.getX()>=rX11&&e.getX()<=(rX11+70)&&e.getY()>=rY11&&e.getY()<=(rY11+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r11");
		rX11=6000;
		rY11=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active11=1;
		repaint();
		}
		if(e.getX()>=rX12&&e.getX()<=(rX12+70)&&e.getY()>=rY12&&e.getY()<=(rY12+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r12");
		rX12=6000;
		rY12=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active12=1;
		repaint();
		}
		if(e.getX()>=rX13&&e.getX()<=(rX13+70)&&e.getY()>=rY13&&e.getY()<=(rY13+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r13");
		rX13=6000;
		rY13=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active13=1;
		repaint();
		}
		if(e.getX()>=rX14&&e.getX()<=(rX14+70)&&e.getY()>=rY14&&e.getY()<=(rY14+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r14");
		rX14=6000;
		rY14=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active14=1;
		repaint();
		}
		if(e.getX()>=rX15&&e.getX()<=(rX15+70)&&e.getY()>=rY15&&e.getY()<=(rY15+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r15");
		rX15=6000;
		rY15=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active15=1;
		repaint();
		}
		if(e.getX()>=rX16&&e.getX()<=(rX16+70)&&e.getY()>=rY16&&e.getY()<=(rY16+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r11");
		rX16=6000;
		rY16=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active16=1;
		repaint();
		}
		if(e.getX()>=rX17&&e.getX()<=(rX17+70)&&e.getY()>=rY17&&e.getY()<=(rY17+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r17");
		rX17=6000;
		rY17=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active17=1;
		repaint();
		}
		if(e.getX()>=rX18&&e.getX()<=(rX18+70)&&e.getY()>=rY18&&e.getY()<=(rY18+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r18");
		rX18=6000;
		rY18=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active18=1;
		repaint();
		}
		if(e.getX()>=rX19&&e.getX()<=(rX19+70)&&e.getY()>=rY19&&e.getY()<=(rY19+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r19");
		rX19=6000;
		rY19=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active19=1;
		repaint();
		}
		if(e.getX()>=rX20&&e.getX()<=(rX20+70)&&e.getY()>=rY20&&e.getY()<=(rY20+60))
		{
		System.out.print(e.getX()+" "+e.getY());
		System.out.print("active r20");
		rX20=6000;
		rY20=6000;
		u1.plusScore(1);
		FScore.setText(u1.getScore()+"");
		active20=1;
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
