package exercice;

import java.util.Arrays;

public class tourdanoi {
    static int n;
    static String[] tabA = {"__", "_", null};
    static String[] tabB = new String[n];
    static String[] tabC = new String[n];

    public static void main(String[] args) {
        tours( tabA,tabB,tabC,2); //a = emplacement de départ, b = emplacement d'arrivé, c = emplacement de repos
    }

    public static void tours(String[] dep, String[] temp, String[] dest, int n)
    {
        if(n==1)
        {
            deplacement(dep, dest);
            affichage();
        }
        else
        {
            tours(dep, dest, temp, n-1);
            tours(dep, temp, dest, 1);
            tours(temp, dep, dest, n-1);
        }
    }

    public static void affichage() {
        System.out.println(Arrays.toString(tabA));
        System.out.println(Arrays.toString(tabB));
        System.out.println(Arrays.toString(tabC));
        System.out.println("-------------------");
    }

    public static void deplacement(String[] dep, String[] dest)
    {
        int indexdep = 0;
        int indexdest = 0;
        //recherche du dernier disque de la pile dep
        for (int i = 0; i < 3; i++) {
            //si la valeur de la case en cours est vide
                if (dep[i] != null) {
                    indexdep = i;
                }
                //si la valeur de la case en cours est vide
                if (dest[i] != null) {
                    indexdest = i;
                }
        }
        if (indexdest == 0 && dest[0] == null) {
            dest[0] = dep[indexdep];
        }
        else {
            dest[indexdest + 1] = dep[indexdep];
        }
        dep[indexdep] = null;
        //System.out.println("indexdep = " + indexdep + " indexdest = " + indexdest);
    }
}
