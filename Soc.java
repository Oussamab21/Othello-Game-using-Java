package ou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Soc {
	String aips=new String();
	int pors;
	static Socket sc,scc;
	static ServerSocket ss;
	static String outp=new String();
	static String outp2=new String();
	static String outp3=new String();
	String inpt;
	int inpt2,inpt3;
	static PrintWriter out;
	static String out3;
	static String out2;
	static BufferedReader in,in2,in3;
	static boolean sos=false;
	//static PrintWriter out;=new PrintWriter(sc.getOutputStream (),true);
	//static BufferedReader in;=new BufferedReader(new InputStreamReader(sc.getInputStream()));
	 public Soc() throws IOException 
		{
		   
		    if (Choix2.str()==true){
		    	
		    sos=false;
			ss=new ServerSocket(2011); 
			//sc=null;
			System.out.println("j'attend un clinet");
			sc=ss.accept();
			System.out.println("j'ai accepté un client");
			//System.out.println("j'ai acceptée le client");
			card2r.start2();
			card2r.redemarer();
			out=new PrintWriter(sc.getOutputStream(),true);
			//out2=new PrintWriter(sc.getOutputStream(),true);
			//out3=new PrintWriter(sc.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(sc.getInputStream()));
			//card2r.debloquer();
			Rese T=new Rese();
			T.start();
		
		    }
		    else{
		    	System.out.println(Choix2.aip());
		    	//System.out.println(Choix2.prs());
		    	sos=true;
		    	aips=Choix2.aip();
		    	//pors=Choix2.prs();
		    	System.out.println("je vais me connecter au serveur");
		    	sc=new Socket(aips,2011);
		    	System.out.println("il m a accepté");
		    	card2r.start2();
				card2r.redemarer();
				out=new PrintWriter(sc.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(sc.getInputStream()));
		    	Rese2 T2=new Rese2();
		    	T2.start();
		    }
		}
			 public static void en( int yy,int i, int couleur) {
					
					//String oi,k2,k,io2;
					//k=Integer.toString(i);
					//k2=Integer.toString(couleur);
					//io2=c.concat(k);
					//oi=io2.concat(k2);
					//System.out.println("les cordoonées "+i);
					
					//out2.println(i);
					//System.out.println("les cordoonnés 2 "+c);
					//out3.println(c);
					//card2r.b();
					//System.out.println("je suis le seveur je veut envoyer "+oi);
				   // outp=c; outp2=i; outp3=couleur;
				    outp=outp.valueOf(yy);
					//out.println(yy);
					//out2.println(i);
					//out3.println(couleur);
				    //out.flush();
				    //out2.flush();
				    //out3.flush();
				    outp2=outp2.valueOf(i);
				    outp3=outp3.valueOf(couleur);
				    out2=outp.concat(outp2);
				    out3=out2.concat(outp3);
				    out.println(out3);
				    out.flush();
			 }
			
public class Rese extends Thread{
	public void run(){
		
		while(true){	
			try {
				while((inpt=in.readLine()) == null){
						
					card2r.bloquer();}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
if(inpt=="154")
	//inpt=null;
	card2r.debloquersp();

else
{
	if (inpt=="176") card2r.mp();

	else
	{
		if(inpt=="177") card2r.rp();		
	
	else
	{	

//inpt=in.readLine();		
card2r.redc(inpt);			
//vider le string			
//inpt=null;			
			
				
card2r.debloquer();
}
		}					
					 
				 
			
		
				
	}				
			
		}

	}
}
		public class Rese2 extends Thread{
			public void run(){
				
				while(card2r.envr()==false)//card2r.debloquer4();
					System.out.println("il faux que le noir fait le premier coup");
				while(true){
					try {
						while((inpt=in.readLine())==null){
							card2r.bloquer();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(inpt=="165")card2r.debloquersp2();
					else{
						if(inpt=="176")card2r.mp();
						else{
							if(inpt=="177")card2r.rp();
							else{
								card2r.redc(inpt);	
								card2r.debloquer();	
							}	
						}	
					}
					
					
					
					
					//card2r.redc(inpt);
					inpt=null;
					//card2r.debloquer();
				}
			}
				
						
		
		
		}		
		
public static void fermer1() {
	try {
		sc.close();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	try {
		ss.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.close();

	
}
public static boolean tst() {
	
	
	return sos;
}
public static void fermer2() {
	try {
		sc.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.close();
}




























	 
	
	 
	 
	 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





