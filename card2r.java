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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author oussama
 */
public  class card2r extends JPanel implements MouseListener,ActionListener{ 
    static int i2 ;
	static int j2;
    int x2, y2, carré_x2, carré_y2;
    static String co1;
	static String co2;
	static String co3;
	static int co1i;
	static int co2i;
	static int co3i;
	static boolean ispc=false;
	//static int ct1;
	//int ct2;
	//int ct3;
    static Graphics2D dissin;
    static int table2[][] = { //matrice d'afichage
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
	static ImageIcon echequié;
	ImageIcon score3;
	ImageIcon tour3;
	ImageIcon ga2;
	ImageIcon hlp2;
	ImageIcon mar2;
	static ImageIcon pcs;
	ImageIcon aipc;
	static String scn2;
	static String scb2;
    static int WIDTH = 70; // longeur de l'image
	static int HEIGHT = 70;
    private static int etat2 = 0; // tour de joeur 
    private Color caseColor;
	private Color helpColor;
    boolean d2=true;
    boolean jouer2=true;
    static boolean paus=false;
    public final static int NORDOUEST = 3;
   	public final static int NORD =4 ;
   	public final static int NORDEST = 5;
   	public final static int OUEST = 6;
   	public final static int EST = 7;
   	public final static int SUDOUEST = 8;
   	public final static int SUD = 9;
   	public final static int SUDEST = 10;
    static int sn2=2;
    static int sb2=2;
    static JLabel t2=new JLabel(" le tour");
    JLabel gag2=new JLabel();
    static JLabel noire2=new JLabel("score du noire");
    static JLabel blanc2=new JLabel("score du blanc");
    JLabel rany2=new JLabel(hlp2);
    JLabel ded2=new JLabel("BY OUSSAMA ET KHALED");
    //JLabel t1=new JLabel("le tour");
    JButton b1=new JButton("Retour au menu principale");
    JButton b2=new JButton("Pause");
    JButton b3=new JButton("Reprendre la partie");
    JLabel ecp2r=new JLabel();
    static JLabel ppcs=new JLabel();
    static JLabel popo=new JLabel();
    JLabel aa=new JLabel();
    JLabel aa2=new JLabel();
    public card2r() {
  //  this.setLayout(new BorderLayout());	
   	boolean re2=false;			
			
    String ch2 = " ABCDEFGH";
	for(int i=0; i<8;  i++)
	{
		JLabel lbl = new JLabel(String.valueOf(ch2.charAt(i+1)));
		lbl.setBounds(i*70+20,540, 80, 80);
		lbl.setFont(new Font("", Font.BOLD, 12));
		//System.out.println("oussama");
		lbl.setForeground(Color.RED);
		this.add(lbl);
	}
	for(int i=0; i<=7; i++)
	{
		JLabel lbl = new JLabel(String.valueOf(i+1));
		lbl.setBounds(580, 10 + 70*i, 80, 80);
		lbl.setFont(new Font("", Font.BOLD, 12));
		this.add(lbl);
		
		 caseColor = new Color(112,210,13);
    	 helpColor = new Color(192, 192, 192);	
        //ici on charge les images   "tab_carrï¿½.png" dans ses variables  tab_carrï¿½   ///
        tab_carré = new ImageIcon(getClass().getResource("/image/tab_carré.png"));    ///
        carré_blanc = new ImageIcon(getClass().getResource("/image/carré_blanc1.jpg"));////
        carré_jaune = new ImageIcon(getClass().getResource("/image/carré_blanc2.jpg"));////
        echequié=new ImageIcon(getClass().getResource("/image/éch.PNG"));
        //guide = new ImageIcon(getClass().getResource("guide.png"));//
        tour3=new ImageIcon(getClass().getResource("/image/tour1.png"));
        score3=new ImageIcon(getClass().getResource("/image/score2.png"));
        ga2=new ImageIcon(getClass().getResource("/image/imagesge.jpg"));
        hlp2=new ImageIcon(getClass().getResource("/image/aide2.png"));
        mar2=new ImageIcon(getClass().getResource("/image/batna.jpg"));
        pcs=new ImageIcon(getClass().getResource("/image/pa.png"));
        aipc=new ImageIcon(getClass().getResource("/image/aide3.png"));
        this.setLayout(null);
        this.add(t2);
        t2.setBounds(650, 20, 20000000, 111);
        t2.setIcon(tour3);
        this.add(noire2);
        this.add(blanc2);
        this.add(gag2);
        //t1.setBounds(650,40,20000000,111);
        //t1.setIcon(tou)
        this.add(ded2);
        ded2.setBounds(1000,-20,600,200);
        ded2.setIcon(mar2);
       // rany2.setBounds(1000,900,4000,900);
        gag2.setBounds(650,400,2000,200);
        noire2.setBounds(650,100,2000,200);
        blanc2.setBounds(650,200,2000,200);
        noire2.setIcon(score3);
        blanc2.setIcon(score3);
        gag2.setIcon(ga2);
        rany2.setBounds(630,330,100,100);
        //rany2.setIcon(hlp2);
        this.add(rany2);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b1.setBounds(5,600,200,70);
        b2.setBounds(210,600,100,70);
        b3.setBounds(315,600,170,70);
        ecp2r.setBounds(750,330,200,100);
        this.add(ecp2r);
        popo.setBounds(1000,300,300,40);
        this.add(popo);
        //JLabel ppcs=new JLabel(pcs);
        ppcs.setBounds(1200,200,200,200);
        this.add(ppcs);
        aa.setBounds(750,600,250,70);
        //JLabel aa2=new JLabel(aipc);
        aa2.setBounds(610,600,170,70);
        this.add(aa);
        this.add(aa2);
        
        
        
        new afficher2().start(); {
        	
        }
	}
				}
			
				// inctencer un thread et le dï¿½marer  mise.ï¿½.jour d'affichage
    



	public void paint(Graphics g) { // methode de creation de graphisme
        //
        super.paint(g); /// appele de la methode original de paint de super class
        dissin = (Graphics2D) g; /// instecer un objet de dessination
       
       
        for (int i = 0; i < 8; i++) {// boucle  de dessination de la matrice table
            for (int j = 0; j < 8; j++) {

                if (table2[i][j] == 0) { ///test si les indices de tableau egale a 0 on affiche image de la attribut tab_carrï¿½

                	
                	               dissin.drawImage(tab_carré.getImage(), j * WIDTH, i * HEIGHT, 70, 70, this);// methode de dissination
                	      
                }
                if ((table2[i][j] == 1)) {///test si les indix de tableau egale a 0 on affiche image de la attribut tab_carrï¿½
                	g.drawRect(j*70, i*70, 70, 70);
					g.drawOval(j*70+4, i*70+4, 60, 60);
					g.setColor(caseColor);	
					g.fill3DRect(j*70, i*70, 70, 70, true);
					g.setColor(Color.BLACK);	
					g.fillOval(j*70+4, i*70+4, 60, 60);
						
                	
                }
                if ((table2[i][j] == 2) ) {///test si les indix de tableau egale a 0 on affiche image de la attribut tab_carrï¿½

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
    	if(paus==false){
        x2 = e.getX();  // les coordoner ou la sourie click  >>>> "e" et 7 pour eliminï¿½ le bourdure fenetre 
        y2 = e.getY()-47; ;
        String h="ABCDEFGH";
        String c="o";
        String c2="ou";
        // les coordoner ou la sourie click  >>>> "e" et 30 pour eliminï¿½ le bourdure fenetre 
        if ((x2 <= 560 && x2>= 0  ) && (0 <= y2 && y2 <= 560)) { // pour evitï¿½ le clickage hors la matrice
            carré_x2 =( x2 / WIDTH);  //pour detecte quelle carrÃ© on click
            carré_y2 = (y2 / HEIGHT);
            //System.out.println("carré x  : " + carré_x2 + " carré y  : " + carré_y2 + "\n"); // afficher les indix de la matrice
            //System.out.println("X  : " +x2 + " Y  : " +y2 + "\n"); // afficher les indix de la matrice
        }
        int nbrco2=0;
        for(int i=0; i<8; i++){
        	for(int j=0; j<8; j++){
        		if (table2[i][j]!=0) nbrco2=nbrco2+1;
        	}
        }
        
        if (nbrco2<64){
        	if((ncpn2(1)>0)||(ncpb2(2)>0)){
        		jouer2=true;
        	}
        	if ((ncpn2(1)<=0) && (ncpb2(2)<=0)){
        	jouer2=false;}
        }
        else jouer2=false;
        
        
        
        
        if (jouer2 ==true){
        	
         if(Soc.tst()==true){
        
            if (table2[carré_y2][carré_x2] == 0 && etat2 == 1){
            	
            if (poserPion2( carré_y2,carré_x2,1)){
            	ecp2r.setText(null);
            	rany2.setIcon(null);
            	Soc.en(carré_x2,carré_y2,1);
            	ispc=true;
            	//etat2 = 3;
            	t2.setText("le tour du blanc");
                bloquer();
            	}
            else{
            	if(ncpn2(1)>0){
            		System.out.println("esseyer un coup possible");
            	    ecp2r.setText("esseyer un coup possible");
            	    rany2.setIcon(hlp2);}
            	else{
            		t2.setText("le tour du blanc");
            	    //Soc.pst();
                    Soc.en(1,5,4);
            	    //aa.setText("pas de coup possible le tour va se passer a l'autre joueur");
                    //aa2.setIcon(aipc);
                    
            	   bloquer();
            	   
            	}
            }	
            	
            }        	
         }else{       //pour la deusieme click jeour 2
            
            if (table2[carré_y2][carré_x2] == 0 && etat2 ==2) {
            	
            if	(poserPion2(carré_y2,carré_x2,2))
            	{
            	ecp2r.setText(null);
     	        rany2.setIcon(null);
            	Soc.en(carré_x2,carré_y2,2);
            	t2.setText("le tour du noir");
            	//etat2=3;	
                bloquer();
            	}
            
            	else{
            		if (ncpb2(2)>0){
            			System.out.println("esseyer un coup valide");
            		    ecp2r.setText("esseyer un coup possible");
             	        rany2.setIcon(hlp2);}
            		else
            		{	
            		//System.out.println("le tour va ce passer au noir");
            		//System.out.println("le coup est impossible pour le blanc");
            		t2.setText("le tour du noir");
            		//Soc.pst2();
            		
            		
            		Soc.en(1,6,5);
            		bloquer();
            		
            		
            		
            		}	
            	}
            		
            		
            		
            		
            	}
                 //pour la premiere click jeour 1
            

        
        //    }}
       // System.out.println("couleur " + table[carré_y][carré_x] + "\n"); //aficher l'etat de la matrice d'affichage
    }
        }      
        if  (nbrco2==64){
        	
         	 String qr;
         	 qr=compa2(sn2,sb2);
         	 afga2(qr);
         	if(Soc.tst()==true){
           	 Soc.fermer2();}
           	else{ Soc.fermer1();}
         	 
          }       	
  if((ncpn2(1)==0)&&(ncpb2(2)==0)){
  	String qr2;  String qr3="nr";
  	
  qr2=compa2(sn2,sb2);
  int ll2=0;
  for(int i=0; i<8; i++){
	   for(int j=0; j<8; j++) 
	    if(table2[i][j]==0)
		   ll2=ll2+1;
	   
	   
  }
 
  
  if (qr2=="sn") {sn2=sn2+ll2; qr3="sn";}
  if (qr2=="sb") {sb2=sb2+ll2; qr3="sb";}
  if (qr2=="match NULL") qr3="match NULL";
  afga2(qr3);
  if(Soc.tst()==true){
	  	 Soc.fermer2();}
	  	else{Soc.fermer1();}
  
  
  
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

    public class afficher2 extends Thread {

        @Override
        public void run() {
        	
            while (true) {
                try {
                	
                    repaint(); // mis a jour de l' afichage  chaque 50 milisecond
                    final int name2 =50;
                    this.sleep(name2);
                } catch (Exception e) {
                }

            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    private int ncpb2(int couleur) {
    	int count2 = 0;
		for(int i=0; i<8; i++)
			for(int j=0; j<8; j++)
				if(coupPossible2(i, j, couleur,false)) count2++;
		return count2;
	}

		private int ncpn2(int couleur) {
		
			int count2 = 0;
			for(int i=0; i<8; i++)
				for(int j=0; j<8; j++)
					if(coupPossible2(i, j, couleur,false)) count2++;
			
		return count2;
		
		
	}        	

		
		private void afga2(String fe3) {
			if (fe3=="sn2"){gag2.setText("le gagniant c'est le NOIR");}	
			if (fe3=="sb2"){gag2.setText("le gagiant c'est le BLANC");}
			if (fe3=="match NULL"){gag2.setText("pas de gagiant match NULL");}
			t2.setText("FIN DE LA PARTIE");
			}
			
			
			
			
			
			
			
		

			private String compa2(int sn2, int sb2) {
				String max2 =("rien");
				if (sn2>sb2) max2=("sn2");
				if (sn2<sb2) max2=("sb2");
				if (sn2==sb2) max2=("match null"); 
				return max2;
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void start2() {
				
				//System.out.println("initialisation");
				   
		        	table2[3][3]=2;  
		        	table2[4][4]=2;
		        	table2[3][4]=1;
		        	table2[4][3]=1;	
		        	 t2.setText("le tour du noir");
			        sn2=2; sb2=2;
			        rscore2(sn2,sb2);
			        etat2=1;
		        	 
		        	//System.out.println("fin de start");
		        	
			       
			      
			             	
			}
			
			
			 static void bloquer() {
		       	 etat2=3;
		       	
		       }

			
			
			
			
			
			
			
			
			
			
			
			
			public static boolean coupPossible2(int i, int j, int couleur,boolean mise2) {
				
				int retourne = 0;
        		boolean valide = false;
        		try{
        			if(table2[i][j]==0){
        				// Nord Ouest
        				retourne+=nbrRetourneDirection2(i, j, couleur,NORDOUEST);
        				//System.out.println("NORDOUST");
        				//System.out.println("nbr "+retourne);
        				// Nord 
        				retourne+=nbrRetourneDirection2(i, j, couleur,NORD);
        				//System.out.println("NORD");
        				//System.out.println("nbr "+retourne);
        				// Nord Est
        				retourne+=nbrRetourneDirection2(i, j, couleur,NORDEST);
        				//System.out.println("NORDEST");
        				//System.out.println("nbr"+retourne);
        				// Ouest
        				retourne+=nbrRetourneDirection2(i, j, couleur,OUEST);
        				//System.out.println("OUST");
        				//System.out.println("nbr "+retourne);
        				// Est
        				retourne+=nbrRetourneDirection2(i, j, couleur,EST);
        				//System.out.println("EST");
        				//System.out.println("nbr "+retourne);
        				// Sud Ouest
        				retourne+=nbrRetourneDirection2(i, j, couleur,SUDOUEST);
        				//System.out.println("SUDOUEST");
        				//System.out.println("nbr "+retourne);
        				// Sud
        				retourne+=nbrRetourneDirection2(i, j, couleur,SUD);
        				//System.out.println("SUD");
        				//System.out.println("nbr "+retourne);
        				// Sud Est
        				retourne+=nbrRetourneDirection2(i, j, couleur,SUDEST);
        				//System.out.println("SUDEST");
        				//System.out.println("nbr "+retourne);
        				//System.out.println("hna tani 3eda");
        				//System.out.println("la valeur de retourne est "+retourne);
        				if(retourne>0){
        					if (mise2==true){
            					if (couleur==1){
            						sn2=sn2+retourne+1;
            						sb2=sb2-retourne;
            					rscore2(sn2,sb2);	
            					}else
            					{
            						sb2=sb2+retourne+1;
            						sn2=sn2-retourne;
            					rscore2(sn2,sb2);	
            					}
            					}
        					valide= true;
        			// System.out.println("valide ="+valide);
        						
        				}
        			}
        		}
        		catch(ArrayIndexOutOfBoundsException e){
        			/* Consultation hors plateau */
        		}
        		return valide;
        	}
				
				
			 private static void rscore2(int sn2, int sb2) {
				 scn2=scn2.valueOf(sn2);
			        scb2=scb2.valueOf(sb2);
			        noire2.setText(" NOIR           "+scn2);
			        blanc2.setText(" BLANC          "+scb2);
				
			
				
			}

			public static boolean poserPion2(int i, int j, int couleur) {
					
				 int retourne;
         		boolean possible = false;
         		//System.out.println("voila : "+i+" "+j+" "+couleur);
         		if(coupPossible2(i,j,couleur,true)){
         			possible = true;
         			
         			table2[i][j] = couleur;
         			
         			// Nord Ouest
         			          
         			retourne = nbrRetourneDirection2(i, j, couleur, NORDOUEST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i-k][j-k]=couleur;
         			}
         			// Nord
         			retourne = nbrRetourneDirection2(i, j, couleur, NORD);
         			for(int k=1; k<retourne+1; k++){
         				table2[i-k][j]=couleur;
         			}			
         			// Nord Est
         			retourne = nbrRetourneDirection2(i, j, couleur, NORDEST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i-k][j+k]=couleur;
         			}			
         			// Ouest
         			retourne = nbrRetourneDirection2(i, j, couleur, OUEST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i][j-k]=couleur;
         			}			
         			// Est
         			retourne = nbrRetourneDirection2(i, j, couleur, EST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i][j+k]=couleur;
         			}			
         			// Sud Ouest
         			retourne = nbrRetourneDirection2(i, j, couleur, SUDOUEST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i+k][j-k]=couleur;
         			}			
         			// Sud
         			retourne = nbrRetourneDirection2(i, j, couleur, SUD);
         			for(int k=1; k<retourne+1; k++){
         				table2[i+k][j]=couleur;
         			}			
         			// Sud Est
         			retourne = nbrRetourneDirection2(i, j, couleur, SUDEST);
         			for(int k=1; k<retourne+1; k++){
         				table2[i+k][j+k]=couleur;
         			}
         			
         			
         		
         		
         		      		
         		
         		//System.out.println("possible  "+possible);
         		if(couleur==1) t2.setText("le tour du Blanc");
         		if (couleur==2) t2.setText("le tour du Noir");
         		}
		return possible;
     		}

			public static int nbrRetourneDirection2(int i, int j, int couleur,int direction) {
	
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
					couleurCase = table2[k][l];
					while((couleurCase!=couleur) && (couleurCase!=0)){
						nbr++;
						k += incrI;
						l += incrJ;
						couleurCase = table2[k][l];
						
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
						table2[i][j]=0;
						start2();
					}
				}
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					//dissin.drawImage(tab_carré.getImage(), j * WIDTH, i * HEIGHT, 70, 70, new card2r());// methode de dissination
          	      
				}
			}
			}
            //debloquer le joueur 2 apres avoir recu les cordoonnées 

			public static void redc(String ccc) {
				
				co1=String.valueOf(ccc.charAt(0));
				co2=String.valueOf(ccc.charAt(1));
				co3=String.valueOf(ccc.charAt(2));
				//System.out.println("la valeur de j avant frig est "+co1);
				Integer ct1=new Integer(co1);
				co1i=ct1.intValue();
			    Integer	ct2=new Integer(co2);
				co2i=ct2.intValue();
				//Integer ct2=new Integer(co2);
				//switch(co1){
				//case"A":co1i=0;break;
				//case"B":co1i=1;break;
				//case"C":co1i=2;break;
				//case"D":co1i=3;break;
				//case"E":co1i=4;break;
				//case"F":co1i=5;break;
				//case"G":co1i=6;break;
				//case"H":co1i=7;break;
				//default:
					//System.out.println("Il faut davantage travailler.");
					//}
					
				//co2i=ct2.intValue();
				Integer ct3=new Integer(co3);
				co3i=ct3.intValue();
				//System.out.println("i "+co2i);
				//System.out.println("j "+co1i);
				//System.out.println("couleur "+co3i);
				//co2i=jj; co1i=ccc; co3i=cl;
			    poserPion2(co2i,co1i,co3i);
			}

			public static void debloquer() {
				//la couleur inverse de la couleur recu
				if(co3i==1) etat2=2;
				if(co3i==2) etat2=1;
				
			}

			public static boolean envr() {
				
				return ispc;
			}
	
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		 
				if(source == b1){
					if(Soc.tst()==true){
						Soc.fermer2();
					}else{Soc.fermer1();}
					Fenetre.ret();
				} else if(source == b2){
					paus=true;
					Soc.en(1,7,6);
					popo.setText("LE JEU EST EN PAUSE");
					ppcs.setIcon(pcs);
				}else {
					
					paus=false;
					Soc.en(1,7,7);
					popo.setText(null);
					ppcs.setIcon(null);
			}
	







			}

			public static void debloquersp() {
			  etat2=2;
				
			}

			public static void mp() {
				paus=true;
				popo.setText("LE JEU EST EN PAUSE");
				ppcs.setIcon(pcs);
			}

			public static void rp() {
				paus=false;
				popo.setText(null);
				ppcs.setIcon(null);
			}

			public static void debloquersp2() {
				etat2=1;
				
			}











}			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
				




				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		



