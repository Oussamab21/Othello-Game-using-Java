package ou;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ou.card2;

/**
 *

 */
public  class card2 extends JPanel implements MouseListener,ActionListener{ 
    static int i ;
	static int j;
    int x, y, carré_x, carré_y;
    static String pj1;
	String pj2;
    boolean pausm=false;
    JLabel p=new JLabel();
    static Graphics2D dissin;
    static int table[][] = { //matrice d'afichage
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0}};
    static ImageIcon tab_carré;       // les images
	ImageIcon carré_jaune;
	ImageIcon carré_blanc;
	ImageIcon guide;
	ImageIcon tour2;
	ImageIcon score1;
	static ImageIcon echequié;
	ImageIcon ga;
	ImageIcon hlp;
	ImageIcon mar;
	ImageIcon pp;
    static int WIDTH = 70; // longeur de l'image
	static int HEIGHT = 70;
    private static int etat = 0; // tour de joeur 
    private Color caseColor;
	private Color helpColor;
    boolean d=true;
    static int sn=2;
    static int sb=2;
    static String scn;
    static String scb;
    boolean jouer=true;
    public final static int NORDOUEST = 3;
   	public final static int NORD =4 ;
   	public final static int NORDEST = 5;
   	public final static int OUEST = 6;
   	public final static int EST = 7;
   	public final static int SUDOUEST = 8;
   	public final static int SUD = 9;
   	public final static int SUDEST = 10;
    static JLabel t=new JLabel("LE TOUR");
    static JLabel noire =new JLabel("score du noir");
    static JLabel blanc= new JLabel("score du blanc");
    JLabel gag=new JLabel();
    JLabel rany=new JLabel();
    JLabel ded=new JLabel("BY OUSSAMA ET KHALED");
    JButton b1m=new JButton("RETOUR AU MENU PRINCIPAL");
    JButton b2m=new JButton("PAUSE",pp);
    JButton b3m=new JButton("REPRENDRE LA PARTIE");
    JLabel hh=new JLabel();
    JLabel pai=new JLabel();
    JLabel hh2=new JLabel();
    JLabel hh3=new JLabel();
    ImageIcon hlp2;
    
    
    
    
    
    
    
    
    public card2() {
    //pj1=Identite.pn1();	
    //pj2=Identite.pn2();
    //System.out.println(pj1);
    //System.out.println(pj2);
    //this.setLayout(new BorderLayout());	
   	boolean re=false;			
			
    String ch = " ABCDEFGH";
	for(int i=0;i<8;i++)
	{
		JLabel lbl = new JLabel(String.valueOf(ch.charAt(i+1)));
		lbl.setBounds(i*70+20,540, 80, 80);
		lbl.setFont(new Font("", Font.BOLD, 12));
		//System.out.println("ipman");
		lbl.setForeground(Color.RED);
		this.add(lbl);
	}
	for(int i=0;i<=7;i++)
	{
		JLabel lbl = new JLabel(String.valueOf(i+1));
		lbl.setBounds(580, 10 + 70*i, 80, 80);
		lbl.setFont(new Font("", Font.BOLD, 12));
		this.add(lbl);
	}
		 caseColor = new Color(112,210,13);
    	 helpColor = new Color(192, 192, 192);	
        //ici on charge les images   "tab_carrï¿½.png" dans ses variables  tab_carrï¿½   ///
        tab_carré = new ImageIcon(getClass().getResource("/image/tab_carré.png"));    ///
        carré_blanc = new ImageIcon(getClass().getResource("/image/carré_blanc1.jpg"));////
        carré_jaune = new ImageIcon(getClass().getResource("/image/carré_blanc2.jpg"));////
        echequié=new ImageIcon(getClass().getResource("/image/éch.PNG"));
        //guide = new ImageIcon(getClass().getResource("guide.png"));//
       tour2=new ImageIcon(getClass().getResource("/image/tour1.png"));
       score1=new ImageIcon(getClass().getResource("/image/score2.png"));
       ga=new ImageIcon(getClass().getResource("/image/imagesge.jpg"));
       hlp=new ImageIcon(getClass().getResource("/image/aide2.png"));
       mar=new ImageIcon(getClass().getResource("/image/batna.jpg"));
       pp=new ImageIcon(getClass().getResource("/image/pa.png"));
       hlp2=new ImageIcon(getClass().getResource("/image/aide3.png"));
        this.setLayout(null);
        this.add(t);
        t.setBounds(650, 20, 20000000, 111);
        t.setIcon(tour2);
        this.add(noire);
        this.add(blanc);
        this.add(gag);
        p.setBounds(1000,300,300,40);
        this.add(p);
        this.add(ded);
        ded.setBounds(1000,-20,600,200);
        ded.setIcon(mar);
        //rany.setBounds(1000,900,4000,900);
        gag.setBounds(650,400,2000,200);
        noire.setBounds(650,100,2000,200);
        blanc.setBounds(650,200,2000,200);
        noire.setIcon(score1);
        blanc.setIcon(score1);
        gag.setIcon(ga);
        
        rany.setBounds(800,350,400,100);
       // rany.setIcon(hlp);
        this.add(rany);
        //JLabel hh=new JLabel(hlp);
        hh.setBounds(630,350,100,100);
        this.add(hh);
        //JLabel pai=new JLabel(pp);
        pai.setBounds(1200,200,200,200);
        this.add(pai);
        this.add(b1m);
        this.add(b2m);
        this.add(b3m);
        b1m.addActionListener(this);
        b2m.addActionListener(this);
        b3m.addActionListener(this);
        b1m.setBounds(5,600,200,70);
        b2m.setBounds(210,600,100,70);
        b3m.setBounds(315,600,170,70);
        hh2.setBounds(750,600,170,70);
        hh3.setBounds(650,600,170,70);
        //hh3.setIcon(hlp2);
        this.add(hh3);
        this.add(hh2);
        
        
        
        
        new afficher().start(); 
    }
        	
        
	
				
			
				// inctencer un thread et le dï¿½marer  mise.ï¿½.jour d'affichage
    



	public void paint(Graphics g) { // methode de creation de graphisme
        //
        super.paint(g); /// appele de la methode original de paint de super class
        dissin = (Graphics2D) g; /// instecer un objet de dessination
       
       
        for (int i = 0; i < 8; i++) {// boucle  de dessination de la matrice table
            for (int j = 0; j < 8; j++) {

                if (table[i][j] == 0) { ///test si les indices de tableau egale a 0 on affiche image de la attribut tab_carrï¿½

                	
                	               dissin.drawImage(tab_carré.getImage(), j * WIDTH, i * HEIGHT, 70, 70, this);// methode de dissination
                	      
                }
                if ((table[i][j] == 1)) {///test si les indix de tableau egale a 0 on affiche image de la attribut tab_carrï¿½
                	g.drawRect(j*70, i*70, 70, 70);
					g.drawOval(j*70+4, i*70+4, 60, 60);
					g.setColor(caseColor);	
					g.fill3DRect(j*70, i*70, 70, 70, true);
					g.setColor(Color.BLACK);	
					g.fillOval(j*70+4, i*70+4, 60, 60);
						
                	
                }
                if ((table[i][j] == 2) ) {///test si les indix de tableau egale a 0 on affiche image de la attribut tab_carrï¿½

//pour le clickage sur les image on change l'image  vue
                	
                	g.drawRect(j*70, i*70, 70, 70);
					g.drawOval(j*70+4, i*70+4, 60, 60);
					g.setColor(caseColor);	
					g.fill3DRect(j*70, i*70, 70, 70, true);
					g.setColor(Color.WHITE);	
					g.fillOval(j*70+4, i*70+4, 60, 60);
                }
                	              }
                }
            }
        
 

public void mouseClicked(MouseEvent e) {
	 if(pausm==false){ 
        x = e.getX();  // les coordoner ou la sourie click  >>>> "e" et 7 pour eliminï¿½ le bourdure fenetre 
        y = e.getY()-47; ;
        String ch="ABCDEFGH";
        String c;
        // les coordoner ou la sourie click  >>>> "e" et 30 pour eliminï¿½ le bourdure fenetre 
        if ((x <= 560 && x>= 0  ) && (0 <= y && y <= 560)) { // pour evitï¿½ le clickage hors la matrice
            carré_x =( x / WIDTH);  //pour detecte quelle carrÃ© on click
            carré_y = (y / HEIGHT);
           // System.out.println("carré x  : " + carré_x + " carré y  : " + carré_y + "\n"); // afficher les indix de la matrice
          //  System.out.println("X  : " +x + " Y  : " +y + "\n"); // afficher les indix de la matrice
        }
        int nbrco=0;
        for(int i=0; i<8; i++){
        	for(int j=0; j<8; j++){
        		if (table[i][j]!=0){
        			nbrco=nbrco+1;
        		}
        	}
        }
        if (nbrco<64){
        	if((ncpn(1)>0)||(ncpb(2)>0)){
        		jouer=true;
        	}
        	if ((ncpn(1)<=0) && (ncpb(2)<=0)){
        	jouer=false;}
        }
        else jouer=false;
//terminer la partie en cas ou tous les case sont occuppées   	
      /*  if  (nbrco==64){
       	 String q;
       	 q=compa(sn,sb);
       	 afga(q);
        }       	
if((ncpn(1)==0)&&(ncpb(2)==0)){
	String q2;  String q3="n";
q2=compa(sn,sb);
int ll=0;
if (q2=="sn") {sn=sn+ll; q3="sn";}
if (q2=="sb") {sb=sb+ll; q3="sb";}
if (q2=="match NULL") q3="match NULL";
afga(q3);
}*/
        	
            
        if (jouer==true){
      
        	//tester si il y a des  coup possible pour le noir
       
          
        		
            if (table[carré_y][carré_x] == 0 && etat == 1){
            if (poserPion( carré_y,carré_x,1)){
            	hh2.setText(null);
            	hh3.setIcon(null);
            	t.setText("le tour du blanc   "+Identite.pn2());
            	//System.out.println("le coup est possible pour le noir ");
            	etat = 2;
            	rany.setText(null);
            	hh.setIcon(null);
            }
            	
            else{
            if (ncpn(1)>0){
            	
            	// new afficher2().start(); 
            	rany.setText("Esseyez un coup possible");
            	hh.setIcon(hlp);
            	System.out.println("il y a des coups possibles donc essayer un autre");
            	
            }
            else{
            	hh2.setText("pas de coup possible le tour va se passer au blanc");
            	hh3.setIcon(hlp2);
            	etat=2;
            	t.setText("le tour du blanc   "+Identite.pn2());
            }
            	
            	
            	
            	
            	
            	
            	
            //	System.out.println("le coup est impossible pour le noir");
              //  System.out.println("esseyer un coup possible");
                }
            }
            //pas de coup possible pour le noir donc on passe le tour au blanc
           
            //pour la deusieme click jeour 2
            
            if (table[carré_y][carré_x] == 0 && etat == 2) {
            	
            if	(poserPion(carré_y,carré_x,2))
            	{
            	 hh2.setText(null);
            	 hh3.setIcon(null);
            	 t.setText("le tour du noir   "+Identite.pn1());
            //	System.out.println("le coup est possible pour le blanc");
            	etat=1;	
               rany.setText(null);
               hh.setIcon(null);
            	}
            
            	else{
            		if (ncpb(2)>0){
            			System.out.println("Esseyer un coup valide");
            			//new afficher3().start();
            			hh.setIcon(hlp);
            			rany.setText("Esseyez un coup possible");
            			
            			
            		}
            		//passer le tour
            		else{
            		hh2.setText("pas de coup possible le tour va se passer au noir");
            		hh3.setIcon(hlp2);
            		etat=1;
            		t.setText("le tour du noir   "+Identite.pn1());
            		
            		
            		
            		
            	
            	//	System.out.println("le coup est impossible pour le blanc");
            	}
            }

          //terminer la partie en cas ou tous les case sont occuppées   	
        
        }          
                 
            
        }         
            
            
        if  (nbrco==64){
          	 String q;
          	 q=compa(sn,sb);
          	 afga(q);
           }       	
   if((ncpn(1)==0)&&(ncpb(2)==0)){
   	String q2;  String q3="n";
   q2=compa(sn,sb);
   int ll=0;
   for(int i=0; i<8; i++){
	   for(int j=0; j<8; j++) 
	   { if(table[i][j]==0){
		   ll=ll+1;
	   }
	   }
   }
   if (q2=="sn") {sn=sn+ll; q3="sn";}
   if (q2=="sb") {sb=sb+ll; q3="sb";}
   if (q2=="match NULL") q3="match NULL";
   afga(q3);
   }                         
            
                 
            
        }

}     

	// les autres methode de la sourer 
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
     }

    public class afficher extends Thread {

        @Override
        public void run() {
        	
            while (true) {
                try {
                	
                    repaint(); // mis a jour de l' afichage  chaque 40 milisecond
                    final int name =40;
                    this.sleep(name);
                } catch (Exception e) {
                }

            }
        }
    }
    
    
/*public class afficher2 extends Thread{
	public void run(){
	
	 try {
		 final int name2=80;
		 hl.setText("esseyer un coup legal pour le noir");
		this.sleep(name2);
		hl.setText(null);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}


public class afficher3 extends Thread{
	 public void run(){
		 try{
			 final int name3=80;
			 hl.setText("esseyer un coup legal pour le blanc");
			 this.sleep(name3);
			 hl.setText(null);
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		 
		 }
		 
	 }
}

*/
	private int ncpn(int couleur) {
		
		
			int count = 0;
			for(int i=0; i<8; i++)
				for(int j=0; j<8; j++)
					if(coupPossible(i, j, couleur,false)) count++;
				
			return count;
	}

		private int ncpb(int couleur) {
			int count = 0;
			for(int i=0; i<8; i++)
				for(int j=0; j<8; j++)
					if(coupPossible(i, j, couleur,false)) count++;
				
			return count;
		
	}

			public static void start() {
				
				//System.out.println("initialisation");
				    etat=1;
		        	table[3][3]=2;  
		        	table[4][4]=2;
		        	table[3][4]=1;
		        	table[4][3]=1;	
		        t.setText("le tour du noir   "+Identite.pn1());
		        sn=2; sb=2;
		        rscore(sn,sb);
		       
			}
			private static void rscore(int sn,int sb) {
				 scn=scn.valueOf(sn);
			        scb=scb.valueOf(sb);
			        noire.setText(" NOIR           "+scn);
			        blanc.setText(" BLANC          "+scb);
				
			}

			private String compa(int sn, int sb) {
				String max =("rien");
				if (sn>sb) max=("sn");
				if (sn<sb) max=("sb");
				if (sn==sb) max=("match null"); 
				return max;
			}
			
			private void afga(String fe) {
			if (fe=="sn"){gag.setText("le gagniat c'est le NOIR  "+Identite.pn1());}	
			if (fe=="sb"){gag.setText("le gagiant c'est le BLANC  "+Identite.pn2());}
			if (fe=="match NULL"){gag.setText("pas de gagiant match NULL");}
			t.setText("FIN DE LA PARTIE");
			}
			
			
			
			public boolean coupPossible(int i, int j, int couleur,boolean mise) {
				
				int retourne = 0;
        		boolean valide = false;
        		try{
        			if(table[i][j]==0){
        				// Nord Ouest
        				retourne+=nbrRetourneDirection(i, j, couleur,NORDOUEST);
        				//System.out.println("NORDOUST");
        			//	System.out.println("nbr "+retourne);
        				// Nord 
        				retourne+=nbrRetourneDirection(i, j, couleur,NORD);
        			//	System.out.println("NORD");
        			//	System.out.println("nbr "+retourne);
        				// Nord Est
        				retourne+=nbrRetourneDirection(i, j, couleur,NORDEST);
        			//	System.out.println("NORDEST");
        			//	System.out.println("nbr"+retourne);
        				// Ouest
        				retourne+=nbrRetourneDirection(i, j, couleur,OUEST);
        			//	System.out.println("OUST");
        			//	System.out.println("nbr "+retourne);
        				// Est
        				retourne+=nbrRetourneDirection(i, j, couleur,EST);
        			//	System.out.println("EST");
        			//	System.out.println("nbr "+retourne);
        				// Sud Ouest
        				retourne+=nbrRetourneDirection(i, j, couleur,SUDOUEST);
        		//		System.out.println("SUDOUEST");
        		//		System.out.println("nbr "+retourne);
        				// Sud
        				retourne+=nbrRetourneDirection(i, j, couleur,SUD);
        		//		System.out.println("SUD");
        		//		System.out.println("nbr "+retourne);
        				// Sud Est
        				retourne+=nbrRetourneDirection(i, j, couleur,SUDEST);
        		//		System.out.println("SUDEST");
        		//		System.out.println("nbr "+retourne);
        				//System.out.println("hna tani 3eda");
        				System.out.println("la valeur de retourne est "+retourne);
        				if(retourne>0){
        					if (mise==true){
        					if (couleur==1){
        						sn=sn+retourne+1;
        						sb=sb-retourne;
        					rscore(sn,sb);	
        					}else
        					{
        						sb=sb+retourne+1;
        						sn=sn-retourne;
        					rscore(sn,sb);	
        					}
        					}
        					valide= true;
        			 System.out.println("valide ="+valide);
        						
        				}
        			}
        			
        		}
        		catch(ArrayIndexOutOfBoundsException e){
        			/* Consultation hors plateau */
        		}
        		return valide;
        	}
				
				
			 public boolean poserPion(int i, int j, int couleur) {
					
				 int retourne;
         		boolean possible = false;
         	//	System.out.println("voila : "+i+" "+j+" "+couleur);
         		if(coupPossible(i,j,couleur,true)){
         			possible = true;
         			
         			table[i][j] = couleur;
         			//System.out.println("MAINTENANT LES MODIFICATION");
         			//System.out.println("                           ");
         			
         			// Nord Ouest
         			          
         			retourne = nbrRetourneDirection(i, j, couleur, NORDOUEST);
         			//System.out.println("NORDOUST retourne est "+retourne);
         			for(int k=1; k<retourne+1; k++){
         				table[i-k][j-k]=couleur;
         			}
         			// Nord
         			retourne = nbrRetourneDirection(i, j, couleur, NORD);
         		//	System.out.println("NORD retourne est "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("NORD je modifie");
         				table[i-k][j]=couleur;
         			}			
         			// Nord Est
         			retourne = nbrRetourneDirection(i, j, couleur, NORDEST);
         		//	System.out.println("NORDEST retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("NORDEST je modifie");
         				table[i-k][j+k]=couleur;
         			}			
         			// Ouest
         			retourne = nbrRetourneDirection(i, j, couleur, OUEST);
         		//	System.out.println("OUST retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("OUST je modifie");
         				table[i][j-k]=couleur;
         			}			
         			// Est
         			retourne = nbrRetourneDirection(i, j, couleur, EST);
         		//	System.out.println("EST retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("EST je modifie");
         				table[i][j+k]=couleur;
         			}			
         			// Sud Ouest
         			retourne = nbrRetourneDirection(i, j, couleur, SUDOUEST);
         		//	System.out.println("SUDOUST retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("SUDOUST je modifie");
         				table[i+k][j-k]=couleur;
         			}			
         			// Sud
         			retourne = nbrRetourneDirection(i, j, couleur, SUD);
         		//	System.out.println("SUD retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("SUD je modifie");
         				table[i+k][j]=couleur;
         			}			
         			// Sud Est
         			retourne = nbrRetourneDirection(i, j, couleur, SUDEST);
         		//	System.out.println("SUDEST retourne "+retourne);
         			for(int k=1; k<retourne+1; k++){
         			//	System.out.println("SUDEST je modifie");
         				table[i+k][j+k]=couleur;
         			} 		      		
         		
         		System.out.println("possible  "+possible);
         		}
		
         		return possible;
		}


			public int nbrRetourneDirection(int i, int j, int couleur,int direction) {
	
				int nbr = 0;
				int incrI;
				int incrJ;
				int couleurCase;
				int k,l;
				switch(direction){
					case NORDOUEST :
						incrI = -1;
						incrJ = -1;
						break;
					case NORD : 
						incrI = -1;
						incrJ = 0;
						break;
					case NORDEST : 
						incrI = -1;
						incrJ = +1;
						break;
					case OUEST : 
						incrI = 0;
						incrJ = -1;
						break;
					case EST : 
						incrI = 0;
						incrJ = +1;
						break;
					case SUDOUEST : 
						incrI = +1;
						incrJ = -1;
						break;
					case SUD : 
						incrI = +1;
						incrJ = 0;
						break;
					case SUDEST : 
						incrI = +1;
						incrJ = +1;
						break;
					default:
						incrI = 0;
						incrJ = 0;
				}
				k = i+incrI;
				l = j+incrJ;
				try{
					couleurCase = table[k][l];
					while((couleurCase!=couleur) && (couleurCase!=0)){
						nbr++;
						k += incrI;
						l += incrJ;
						couleurCase = table[k][l];
						
					}
					if(couleurCase==0){
						nbr = 0;
					}
				}
				catch(ArrayIndexOutOfBoundsException e){ 
					/* On a regardï¿½ hors echequier */
					nbr = 0;
				}
			
				return nbr;
			}

			public static void redemarer() {
				
				for(int i=0; i<8; i++){
					for(int j=0; j<8; j++){
						table[i][j]=0;
						start();
					}
				}
			for(i=0; i<8; i++){
				for(j=0; j<8; j++){
					//dissin.drawImage(tab_carré.getImage(), j * WIDTH, i * HEIGHT, 70, 70, new card2());	// methode de dissination
          	      
				}
			}
			}

			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		 
				if(source == b1m){
					if(JOptionPane.showConfirmDialog(this, "etes vous sur de vouloir quitter la partie en mode mono poste ?", "OTHELLO", JOptionPane.YES_NO_CANCEL_OPTION) == 0)
					{
					Fenetre.ret();
				}}
				 else{ if(source == b2m){
					pausm=true;
					
					//p.setText("en pause");
					// afficher2 Tp=new afficher2();
					 //Tp.start();
					p.setText("LE JEUX EST EN PAUSE");
				    pai.setIcon(pp);}
				 //}
				else {
					
					pausm=false;
					//Tp.stop();
					p.setText(null);
					pai.setIcon(null);
				}
			}
	
			}			
			
/*public class afficher2 extends Thread{			
     			
	public void run(){
		try{
		p.setText(null);
		p.setText("pause");
		
		final int sl=3;
		
			this.sleep(sl);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
			
			
			
			
			
			
			
			
			
			
			
				
				
			}*/
			
				




				
}			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		



