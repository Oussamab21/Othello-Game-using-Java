package ou;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class card1 extends JPanel {

public card1(){
	
	
	this.setLayout(new FlowLayout());
	JLabel a=new JLabel("Description:");
	JLabel b=new JLabel("Reversi est un jeu de soci�t� combinatoire abstrait, qui oppose deux joueurs (pions Noirs et Blancs) sur un tablier appeler Othellier");
	JLabel c=new JLabel("�Nombre de Joueurs - 2.	"); 
	JLabel d=new JLabel("�Pions - 64 pions bicolores, noirs d'un c�t� et blancs de l'autre");
	JLabel e=new JLabel("� 	Tablier - 64 cases, 8 sur 8, appel� othellier.");
	JLabel f=new JLabel("�	Objectif - �tre le joueur ayant le plus grand nombre de pion de sa couleur sur l'othellier � la fin de la partie");
	JLabel g=new JLabel("Le jeu commence quand les 2 deux joueurs posent les quatre pions de d�part sur les quatre cases centrales. Le premier � jouer est le joueur poss�dant les pions noirs                                                                                                                             ");                                                                                                                   
	JLabel h=new JLabel("R�gles:             ");
	JLabel i=new JLabel("Placement des Pions:  "); 
	JLabel j=new JLabel("�	La capture de pions survient lorsqu'un joueur place un de ses pions � l'extr�mit� d'un alignement de pions adverses contigus et dont l'autre extr�mit� est d�j�" );
	JLabel k=new JLabel("occup�e par un de ses propres pions. Les alignements consid�r�s peuvent �tre une colonne, une ligne, ou une diagonale. Si le pion nouvellement plac� vient fermer"); 
	JLabel l=new JLabel("plusieurs alignements, il capture tous les pions adverses des lignes ainsi ferm�es. La capture se traduit par le retournement des pions captur�s");
	JLabel m=new JLabel("Ces retournements n'entra�nent pas d'effet de capture en cascade : seul le pion nouvellement pos� est pris en compte."); 
	JLabel n=new JLabel("�	Les joueurs jouent � tour de r�le, chacun �tant tenu de capturer des pions adverses lors de son mouvement. Si un joueur ne peut pas capturer de pion(s) adverse(s), il est forc� de passer son tour." );
	JLabel o=new JLabel("Fin de la partie");
	JLabel p=new JLabel("Si aucun des deux joueurs ne peut jouer, ou si l'othellier ne comporte plus de case vide, la partie s'arr�te. Le gagnant en fin de partie est celui qui poss�de le plus de pions.");
	JLabel q=new JLabel("Si le nombre de pions est le m�me pour les 2 joueurs il y aura �galit�.");
	this.add(a);
	this.add(b);
	this.add(c);
	this.add(d);
	this.add(e);
	this.add(f);
	this.add(g);
	this.add(h);
	this.add(i);
	this.add(j);
	this.add(k);
	this.add(l);
	this.add(m);
	this.add(n);
	this.add(o);
	this.add(p);
	this.add(q);


	
}
}
