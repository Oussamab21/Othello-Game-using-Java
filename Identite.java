package ou;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Identite extends JFrame implements ActionListener {
ImageIcon id;
ImageIcon okk;
JButton b1=new JButton("OK");
JButton b2=new JButton("CLOSE");	
JButton b3=new JButton("SUPPRIMER LE DERNIER CARACTERE");	
static JTextArea jt1=new JTextArea();	
static JTextArea jt2=new JTextArea();	
JLabel j1=new JLabel("LE NOM DU PREMIER JOUEUR(PION NOIR)");
JLabel j2=new JLabel("LE NOM DU DEXIEME JOUEUR(PION BLANC)");
JLabel j3=new JLabel("SVP:SAISISSEZ VOS NOMS");	
JLabel j4=new JLabel(id);	
JLabel j5=new JLabel(okk);	
public Identite(){
this.setTitle("LA SAISIE DES NOMS");	
this.setSize(1000, 700);	
this.setLocationRelativeTo(null);	
JPanel tt=new JPanel();
tt.setLayout(null);
j3.setBounds(300,20,300,100);
j3.setFont(new Font("serif",Font.ITALIC,24));
j3.setForeground(Color.blue);	
tt.add(j3);	
id=new ImageIcon(getClass().getResource("/image/id_card2.png"));	
JLabel j4=new JLabel(id);	
j4.setBounds(4,4,200,200);	
tt.add(j4);	
j1.setForeground(Color.red);
j1.setBounds(120,170,260,100);
tt.add(j1);	
jt1.setBounds(370,200,350,50);	
tt.add(jt1);	
j2.setForeground(Color.red);
j2.setBounds(120,260,260,100);
tt.add(j2);
jt2.setBounds(370,290,350,50);
tt.add(jt2);
okk=new ImageIcon(getClass().getResource("/image/ok.jpg"));
JLabel j5=new JLabel(okk);
j5.setBounds(750,400,300,300);
tt.add(j5);
b1.setBounds(700,530,100,50);
tt.add(b1);
b1.addActionListener(this);




this.setContentPane(tt);	
this.setVisible(true);	
}
@Override
public void actionPerformed(ActionEvent e) {
	Object source=e.getSource();
	if(source==b1)
	Fenetre.af1();
	card2.start();
	card2.redemarer();
	//System.out.println("1"+jt1.getText());
	//System.out.println("2"+jt2.getText());
	this.dispose();
	
}
public static String pn1() {
	String ff;
	ff=jt1.getText();
	return ff;
}
public static String pn2() {
	String ff2;
	ff2=jt2.getText();
	return ff2;
}
	
	
	
	
}
