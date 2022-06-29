package ou;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class card1 extends JPanel {

public card1(){
	
	
	this.setLayout(new FlowLayout());
	JLabel a=new JLabel("Description:");
	JLabel b=new JLabel("Reversi est un jeu de société combinatoire abstrait, qui oppose deux joueurs (pions Noirs et Blancs) sur un tablier appeler Othellier");
	JLabel c=new JLabel("•Nombre de Joueurs - 2.	"); 
	JLabel d=new JLabel("•Pions - 64 pions bicolores, noirs d'un côté et blancs de l'autre");
	JLabel e=new JLabel("• 	Tablier - 64 cases, 8 sur 8, appelé othellier.");
	JLabel f=new JLabel("•	Objectif - Être le joueur ayant le plus grand nombre de pion de sa couleur sur l'othellier à la fin de la partie");
	JLabel g=new JLabel("Le jeu commence quand les 2 deux joueurs posent les quatre pions de départ sur les quatre cases centrales. Le premier à jouer est le joueur possédant les pions noirs                                                                                                                             ");                                                                                                                   
	JLabel h=new JLabel("Règles:             ");
	JLabel i=new JLabel("Placement des Pions:  "); 
	JLabel j=new JLabel("•	La capture de pions survient lorsqu'un joueur place un de ses pions à l'extrémité d'un alignement de pions adverses contigus et dont l'autre extrémité est déjà" );
	JLabel k=new JLabel("occupée par un de ses propres pions. Les alignements considérés peuvent être une colonne, une ligne, ou une diagonale. Si le pion nouvellement placé vient fermer"); 
	JLabel l=new JLabel("plusieurs alignements, il capture tous les pions adverses des lignes ainsi fermées. La capture se traduit par le retournement des pions capturés");
	JLabel m=new JLabel("Ces retournements n'entraînent pas d'effet de capture en cascade : seul le pion nouvellement posé est pris en compte."); 
	JLabel n=new JLabel("•	Les joueurs jouent à tour de rôle, chacun étant tenu de capturer des pions adverses lors de son mouvement. Si un joueur ne peut pas capturer de pion(s) adverse(s), il est forcé de passer son tour." );
	JLabel o=new JLabel("Fin de la partie");
	JLabel p=new JLabel("Si aucun des deux joueurs ne peut jouer, ou si l'othellier ne comporte plus de case vide, la partie s'arrête. Le gagnant en fin de partie est celui qui possède le plus de pions.");
	JLabel q=new JLabel("Si le nombre de pions est le même pour les 2 joueurs il y aura égalité.");
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
