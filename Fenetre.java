package ou;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane; 
import javax.swing.JPanel;
import javax.swing.JTextField;

import ou.Soc;
import ou.card2r;

import ou.card2;

import ou.card2.afficher;
public class Fenetre extends JFrame implements  ActionListner, ActionListener {

	static CardLayout cl = new CardLayout();
	static JPanel content = new JPanel();
	static String[] listContent = {"Hi","CARD_2", "CARD_2r","CARD_1"};
	JLabel label=new JLabel();
	int indice=0;
//Liste des noms de nos conteneurs pour la pile de cartes

final JButton bouton = new JButton("jouer");
/** Nouvelle partie */
private MenuItem nouv1;
private MenuItem nouv2;
/** Quitter */
private MenuItem quit;
/**A propos*/
private MenuItem régles;
private MenuItem demarer;

public Fenetre(){
	//le menu
	  MenuBar menu =new MenuBar();
	  Menu jeu=new Menu("Jeu");
	  menu.add(jeu); 
	  nouv1 = new MenuItem("Nouvelle partie en mode mono poste");
	  nouv2 = new MenuItem("Nouvelle partie en mode Reseau");
	  nouv1.addActionListener(this);
	  nouv2.addActionListener(this);
	  jeu.add(nouv1);
	  jeu.add(nouv2);
	  quit=new MenuItem("Quitter");
	  quit.addActionListener(this);
	  jeu.addSeparator();
	  jeu.add(quit);
	 
	  Menu help =new Menu(" ? ");
	  régles = new MenuItem("régles");
	  régles.addActionListener(this);
	  help.add(régles);
	  menu.add(help
			  
			  );
	 this.setMenuBar(menu);
	 
	 régles.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent event){
		 //Via cette instruction, on passe au prochain conteneur de la pile
			// if(++indice > 2)
				// indice = 0;
				 //Via cette instruction, on passe au conteneur
				 //correspondant au nom fourni en paramètre
				 //cl.show(content, listContent[3]);
			     Regles f=new Regles();
				 }
				 });
		 
		 
//Panneau i=new Panneau();	 
card1 ik = new card1();
	 
this.setTitle("OTHELLO");

card2 ip = new card2();
card2r it=new card2r();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//Dï¿½finition de l'action du bouton

//On dï¿½finit le layout
content.setLayout(cl);
//On ajoute les cartes ï¿½ la pile avec un nom pour les retrouver
this.addMouseListener(ip);
this.addMouseListener(it);
content.add(new Panneau(),listContent[0]);
content.add(ip, listContent[1]);
content.add(it, listContent[2]);
content.add(ik,listContent[3]);
//content.addMouseListener(ip);
this.addMouseListener(ip);
this.addMouseListener(it);

this.getContentPane().add(content, BorderLayout.CENTER);
this.setSize(1500,950);
this.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource() == this.quit)
	{
		if(JOptionPane.showConfirmDialog(this, "etes vous sur de vouloir quitter mon jeu ?", "OTHELLO", JOptionPane.YES_NO_CANCEL_OPTION) == 0)
		{
			this.dispose();
			System.exit(0);
		}
			
	}
	if(e.getSource() == this.nouv1) 
	{
		//indice = 0;
		//cl.show(content, listContent[1]);
		Identite r=new Identite();
		//card2.start();
		//card2.redemarer();	
		
	}
	if(e.getSource()==this.nouv2){
		indice=0;
		
		//cl.show(content,listContent[2]);
		//Soc t=new Soc();
		//card2r.start2();
		Choix2 ch=new Choix2();

	}
}
public static void ret() {
	cl.show(content, listContent[0]);
	
}
public static void af() {
	cl.show(content,listContent[2]);
	
}
public static void af1() {
	cl.show(content, listContent[1]);
	
}










}


	   

		
		


