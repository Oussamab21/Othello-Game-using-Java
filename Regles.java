package ou;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Regles extends JFrame implements ActionListener {
	ImageIcon ai;
	ImageIcon ai2;
	ImageIcon ai3;	
	ImageIcon ai4;
	
	
	
JButton b1=new JButton("RETOURE");
JLabel l1=new JLabel(ai);	
JLabel l2=new JLabel(ai2);
JLabel l3=new JLabel(ai3);
JLabel l4=new JLabel(ai4);
	public Regles(){
		
	this.setTitle("LES REGLES DU JEU");	
	this.setSize(2000, 1000);
	//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);	
	JPanel ca=new JPanel();
	ca.setLayout(new FlowLayout());
	ai=new ImageIcon(getClass().getResource("/image/aide2.png"));
	ai2=new ImageIcon(getClass().getResource("/image/aide3.png"));
	ai3=new ImageIcon(getClass().getResource("/image/ex.png"));
	ai4=new ImageIcon(getClass().getResource("/image/1(1).png"));
	JLabel l1=new JLabel(ai);	
	JLabel l2=new JLabel(ai2);
	JLabel l3=new JLabel(ai3);
    //ca.add(l1);
	//ca.add(l2);
	//ca.add(l3);
	JLabel it=new JLabel("                                 BIENVENUE DANS L'ASSISTANT D'AIDE DU JEU OTHELLO:                                                                                          ");
	it.setForeground(Color.blue);
	it.setFont(new Font("serif",Font.BOLD,30));
	JLabel es=new JLabel("                                                                                                                                                              ");
	JLabel a=new JLabel("Description:");
	a.setForeground(Color.red);
	a.setFont(new Font("serif",Font.BOLD,24));
	JLabel s1=new JLabel("                                                                                                                                                                                        ");
	JLabel b=new JLabel("Reversi est un jeu de société combinatoire abstrait, qui oppose deux joueurs (pions Noirs et Blancs) sur un tablier appeler Othellier");
	b.setFont(new Font("serif",Font.BOLD,18));
	JLabel c=new JLabel("•Nombre de Joueurs - 2.	"); 
	c.setFont(new Font("serif",Font.BOLD,18));
	JLabel d=new JLabel("•Pions - 64 pions bicolores, noirs d'un côté et blancs de l'autre");
	d.setFont(new Font("serif",Font.BOLD,18));
	JLabel e=new JLabel("• 	Tablier - 64 cases, 8 sur 8, appelé othellier.");
	e.setFont(new Font("serif",Font.BOLD,18));
	JLabel f=new JLabel("•	Objectif - Être le joueur ayant le plus grand nombre de pion de sa couleur sur l'othellier à la fin de la partie");
	f.setFont(new Font("serif",Font.BOLD,18));
	JLabel g=new JLabel("Le jeu commence quand les 2 deux joueurs posent les quatre pions de départ sur les quatre cases centrales. Le premier à jouer est le joueur possédant les pions noirs               ");
	g.setFont(new Font("serif",Font.BOLD,18));
	JLabel ss2=new JLabel("                                                                                                                 ");
	JLabel l4=new JLabel(ai4);
	JLabel h=new JLabel("Règles:             ");
	h.setForeground(Color.red);
	h.setFont(new Font("serif",Font.BOLD,24));
	JLabel ss=new JLabel("                                                                                                                                                                                                                                           ");
	JLabel i=new JLabel("Placement des Pions:  ");
	i.setFont(new Font("serif",Font.BOLD,18));
	JLabel j=new JLabel("•	La capture de pions survient lorsqu'un joueur place un de ses pions à l'extrémité d'un alignement de pions adverses contigus et dont l'autre extrémité est déjà" );
	j.setFont(new Font("serif",Font.BOLD,18));
	JLabel k=new JLabel("    occupée par un de ses propres pions. Les alignements considérés peuvent être une colonne, une ligne, ou une diagonale. Si le pion nouvellement placé vient fermer"); 
	k.setFont(new Font("serif",Font.BOLD,18));
	JLabel l=new JLabel("plusieurs alignements, il capture tous les pions adverses des lignes ainsi fermées. La capture se traduit par le retournement des pions capturés");
	l.setFont(new Font("serif",Font.BOLD,18));
	JLabel m=new JLabel("Ces retournements n'entraînent pas d'effet de capture en cascade : seul le pion nouvellement posé est pris en compte."); 
	m.setFont(new Font("serif",Font.BOLD,18));
	JLabel n=new JLabel("•	Les joueurs jouent à tour de rôle, chacun étant tenu de capturer des pions adverses lors de son mouvement.                                                             ");
	JLabel n2=new JLabel ("                •Si un joueur ne peut pas capturer de pion(s) adverse(s), il est forcé de passer son tour.                                                                                                                                 " );
	n.setFont(new Font("serif",Font.BOLD,18));
	n2.setFont(new Font("serif",Font.BOLD,18));
	JLabel o=new JLabel("Fin de la partie:");
	o.setFont(new Font("serif",Font.BOLD,24));
	o.setForeground(Color.red);
	JLabel ss3=new JLabel("                                                                                                                    ");
	JLabel p=new JLabel("Si aucun des deux joueurs ne peut jouer, ou si l'othellier ne comporte plus de case vide, la partie s'arrête. Le gagnant en fin de partie est celui qui possède le plus de pions.");
	p.setFont(new Font("serif",Font.BOLD,18));
	JLabel q=new JLabel("Si le nombre de pions est le même pour les 2 joueurs il y aura égalité.                                                                                                           ");
	q.setFont(new Font("serif",Font.BOLD,18));
	JLabel z=new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
	JLabel w=new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
	ca.add(it);
	ca.add(es);
	ca.add(l1);
	ca.add(l2);
	ca.add(l3);
	ca.add(a);
	ca.add(s1);
	ca.add(b);
	ca.add(c);
	ca.add(d);
	ca.add(e);
	ca.add(f);
	ca.add(g);
	ca.add(ss2);
	ca.add(l4);
	ca.add(h);
	ca.add(ss);
	ca.add(i);
	ca.add(j);
	ca.add(k);
	ca.add(l);
	ca.add(m);
	ca.add(n);
	ca.add(n2);
	ca.add(o);
	ca.add(ss3);
	ca.add(p);
	ca.add(q);
	ca.add(z);
	ca.add(w);
	ca.add(b1);
	b1.addActionListener(this);
	//ai=new ImageIcon(getClass().getResource("/image/aide2.png"));
	//ai2=new ImageIcon(getClass().getResource("/image/aide3.png"));
	//ai3=new ImageIcon(getClass().getResource("/image/ex.png"));
    this.setContentPane(ca);
    this.setVisible(true);
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==b1)this.dispose();
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	

