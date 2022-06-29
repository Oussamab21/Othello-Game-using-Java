package ou;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Choix2 extends JFrame implements ActionListener    {
ImageIcon oki;
ImageIcon cli;
ImageIcon sei;
ImageIcon clli;
ImageIcon ipi;
ImageIcon ai;
static boolean ses=false;









JLabel ll=new JLabel("FAITE VOTRE CHOIX ENTRE CLIENT ET SERVEUR");
//JLabel ll2=new JLabel(ai);
JTextArea jt1=new JTextArea();
JTextArea jt2=new JTextArea();	
JRadioButton jr2=new JRadioButton("CLIENT");
JRadioButton jr1=new JRadioButton("SERVEUR");
JPanel cont=new JPanel();	
ButtonGroup bg = new ButtonGroup();	
JButton b1=new JButton("OK");
JButton b2=new JButton("CLOSE");
static JTextField t1=new JTextField(90);
static JTextField t2=new JTextField(50);
JLabel i1=new JLabel("saisir l'adress ip  du serveur SVP");
JLabel i2=new JLabel("saisir le numero du port");
JLabel i3=new JLabel(sei);
JLabel i4=new JLabel(clli);


public Choix2(){
this.setTitle("LE CHOIX DU MODE");
this.setSize(700, 700);
//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
//oki =new ImageIcon(getClass().getResource("/image/accepted_48.png"));
cli=new ImageIcon(getClass().getResource("/image/cc.jpg")); 
sei=new ImageIcon(getClass().getResource("/image/blackservericon.png"));
ipi=new ImageIcon(getClass().getResource("/image/ip_lookup-icon.gif"));
clli=new ImageIcon(getClass().getResource("/image/client-icon.png"));
ai=new ImageIcon(getClass().getResource("/image/aide2.png"));

JPanel cont=new JPanel();	
//JButton b1=new JButton("OK",oki);
//JButton b2=new JButton("CLOSE",cli);
//JRadioButton jr1=new JRadioButton("SERVEUR",sei);
JLabel i3=new JLabel(sei);
JLabel i4=new JLabel(clli);


cont.setLayout(null); 
jr1.setSelected(true);
jr1.addActionListener(this);
jr2.addActionListener(this);
bg.add(jr1);
bg.add(jr2);
cont.add(jr1);
cont.add(jr2);
b1.addActionListener(this);
b2.addActionListener(this);
b2.setBackground(Color.red);
b2.setBounds(520,580,150,70);
//b2.setIcon(cli);
cont.add(b2);
jr1.setBounds(3,70,100,100);
jr2.setBounds(3,180,100,100);
//JLabel ll=new JLabel("FAITE VOTRE CHOIX",ai,4);
b1.setBackground(Color.green);
b1.setBounds(300,580,120,70);
//b1.setIcon(oki);
cont.add(b1);
ll.setBounds(200,30,300,10);
cont.add(ll);
JLabel ll2=new JLabel(ai);
ll2.setBounds(60,0,100,100);
cont.add(ll2);
t1.setBounds(400,300,250,50);
cont.add(t1);
t2.setBounds(400,400,150,50);
cont.add(t2);
i1.setBounds(4,300,250,50);
cont.add(i1);
i2.setBounds(4,400,250,50);
cont.add(i2);
i3.setBounds(110,40,140,140);
cont.add(i3);
i4.setBounds(110,180,140,140);
cont.add(i4);
	
this.setContentPane(cont);
this.setVisible(true); 	
}











@Override
public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
	/* if(source==jr1)
	 System.out.println("source : " + jr1.getText() + " - état : " + jr1.isSelected());
	 if(source==jr2)
     System.out.println("source : " + jr2.getText() + " - état : " + jr2.isSelected());
	// if(source==b2) dispose();*/
	 if(source==b1){
		 //System.out.println("oussama");		 
		if (jr1.isSelected()==true)
		{
			ses=true;
			Fenetre.af();
			this.dispose();	
			try {
				Soc t=new Soc();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
			
		}
		if(jr2.isSelected()==true) 
		{
		 ses=false;
		 Fenetre.af();
		 
			this.dispose();
		 try {
			Soc t=new Soc();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 
	 }
		
		

		
		
}
if(source==b2){
	System.out.println("oussama");
	
		this.dispose();
		//System.exit(0);
	
	























}
}











public static boolean str() {
	
	return ses;
}











public static String aip() {
	String op=new String();
	op=t1.getText();
	
	return op;
}











public static int prs() {
	int oo;
	String op2;
	op2=t2.getText();
	Integer y=new Integer("op2");
	oo=y.intValue();
	
	
	return oo;
}











}