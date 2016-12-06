

import javax.swing.*;

import java.awt.*;


public class CalcAreaGUIMain1 extends JFrame  {
	JTextField radiusTf1,radiusTf2,areaTf2; JButton b1,b2;
	public CalcAreaGUIMain1(){
    
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1=new JLabel("반지름");
    radiusTf1= new JTextField(10);
    radiusTf2= new JTextField(10);
    areaTf2= new JTextField(10);
    b1= new JButton("계산");
    b2= new JButton("취소");
  
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    
    setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
    
	}
	
	public static void main(String[] args){
		CalcAreaGUIMain1 c= new CalcAreaGUIMain1();
		
		c.pack();
		c.setVisible(true);
			
		
		
		
	}

	
}