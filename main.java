package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("bienvenue dans notre bibliothéque");
		System.out.println("vous etes un client ou un gérant?");
		Scanner sc=new Scanner(System.in);
		System.out.println("si vous etes un client tapez 1");
		System.out.println("si vous etes un gerant tapez 0");
		int a=sc.nextInt();
		int i=3;
		String c;
		List<String> c1 = new ArrayList<String>() ;
	            c1.add("OUI");
	            c1.add("Oui");
	            c1.add("OUi");
	            c1.add("oui");
	            c1.add("ouI");
	            c1.add("oUi");
	            c1.add("oUI");
	        
	    
		switch(a) {
		case 0:
			System.out.println("donner le code d'accès unique");
			int b=sc.nextInt();//b doit etre 1235
			if(b!=1235) {
			   do {
				System.out.println("donner le code exact s'il vous plait il vous reste"+i+"tentative(s)");
				b=sc.nextInt();
				i--;
				if(i==0) {System.out.println("échec de connection,essayez plus tard");return;}
				
				
			   }while(b!=1235);}
			else {
				System.out.println("vous avez maintenant l'accès au stock");
				System.out.println("si vous voulez voir la disponibilité des livres tapez 1");
				System.out.println("si vous vouler ajouter le nouvel arrivage tapez 2");
				System.out.println("si vous voulez ");
				
			}
			
			//traitement du gerant
		case 1:
			System.out.println("etes vous un etudiant?");
			c=sc.nextLine();
			if(c1.contains(c)) {
				System.out.println("donner votre numéro d'inscription ");
				int d=sc.nextInt();
				if((d>100000)||(d<999999)){
					System.out.println("Félicitations vous avez maintenant plus d'avantages!!  ");
				}
			
		}}}}
		
		
	


