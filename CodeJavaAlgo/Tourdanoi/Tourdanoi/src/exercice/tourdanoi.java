package exercice;

public class tourdanoi {

    public static void main(String[] args) {
        tours( 'a','b','c',3); //a = emplacement de départ, b = emplacement d'arrivé, c = emplacement de repos
    }

    public static void tours(char dep, char temp, char dest, int n)
    {
        if(n==1)
        {
            System.out.println("Déplacez " + dep + " vers " + dest);
        }
        else
        {
            tours(dep, dest, temp, n-1);
            tours(dep, temp, dest, 1);
            tours(temp, dep, dest, n-1);
        }
    }
}
