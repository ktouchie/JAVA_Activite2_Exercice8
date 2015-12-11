import java.util.Scanner;
class Exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une annee:");
        int annee = sc.nextInt();
        System.out.println("Veuillez saisir un mois:");
        int mois = sc.nextInt();
        System.out.println("Veuillez saisir un jour:");
        int jour = sc.nextInt();        
        System.out.println("Veuillez saisir le numero de maison devant laquelle vous vous etes arrete(e):");
        int num = sc.nextInt();
        Boolean valid = true;
        if (jour>31) {
            valid = false;
        } else if (jour>30) {
            if (mois<8) {
                if (mois%2==1) {
                    valid = true;
                } else {
                    valid = false;
                }
            } else {
                if (mois%2==1) {
                    valid = false;
                } else {
                    valid = true;
                }
            }
        } else if (jour==29) {
            if (mois==2) {
                if (annee%100==0) {
                    if (annee%400==0) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                } else {
                    if (annee%4==0) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                }
            } else {
                valid = true;
            }
        } else {
            valid = true;
        }
        
        if (valid = false) {
            System.out.println("La date que vous avez saisi n'est pas valide");
        } else if ((jour>0)&&(jour<16)) {
            if (num%2==1) {
                System.out.println("Vous etes bien stationne(e).");
            } else {                
                System.out.println("Vous n'etes pas bien stationne(e).");
            }
        } else {
            if (num%2==0) {
                System.out.println("Vous etes bien stationne(e).");
            } else {                
                System.out.println("Vous n'etes pas bien stationne(e).");
            }
        }
        
        
	}

}

