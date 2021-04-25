package tableau;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HEGEL
 */
public class Tableau {

    public static void main(String[] args) {
        
        Scanner cl=new Scanner(System.in);
        
         /*
         * Taille du tableau
         */
        System.out.print("Donner la taille du tableau:");
        int taille=cl.nextInt();
        
        int[] tableau=new int[taille];
        
        System.out.println("-- Passons au remplisage --");
        
         /*
         * Remplissage du tableau
         */
        for(int i=0; i<taille; i++)
        {
            System.out.print("tableau["+i+"]=");
            tableau[i]=cl.nextInt();
        }
        
        
        System.out.println("\n Affichage : "+Arrays.toString(tableau));        
        System.out.print("\n Donner l'entier à supprimer:");
        int val=cl.nextInt();
        
        /*
         * Suppression d'un entier dans le tableau
         */
        for(int i=0; i<tableau.length; i++)
        {
            if(tableau[i]==val)
            {
                for(int j=i; j<tableau.length-1; j++)
                {
                    tableau[i]=tableau[i+1];
                    i++;
                }
            }
        }
        tableau=Arrays.copyOf(tableau, tableau.length-1);
        
        System.out.println("\n Resultat : "+Arrays.toString(tableau));
        
    }
}
