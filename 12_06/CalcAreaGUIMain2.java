

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
	JTextField radiusTf1,radiusTf2,areaTf2; JButton b1,b2;
	public CalcAreaGUIMain2(){
    
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1=new JLabel("������");
    radiusTf1= new JTextField(10);
    radiusTf2= new JTextField(10);
    areaTf2= new JTextField(10);
    b1= new JButton("���");
    b2= new JButton("���");
    b1.addActionListener(this);
    b2.addActionListener(this);
 
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    
    setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
    
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1){
		b1.setText("����߽��ϴ�");
		Double r=Double.parseDouble(radiusTf1.getText());
		areaTf2.setText(Double.toString(Math.PI*Math.pow(r, 2)));
			}
	else if(e.getSource()==b2){
		 radiusTf1.setText("");
		  areaTf2.setText("");

			}
		
		
	}
  
	
	public static void main(String[] args){
		CalcAreaGUIMain2 c= new CalcAreaGUIMain2();
		
		c.pack();
		c.setVisible(true);
			
		
		
		
	}
}