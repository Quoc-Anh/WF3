import java.util.Arrays;
import java.util.Scanner;

public class pile {
    public static int []tab = new int[4];
    public static int tete=0;
    public static int entrees =0;

    public static void affichertab(){
        System.out.println("tableau:" + Arrays.toString(tab));
    }
    public static void afficherpile() {
        System.out.print("file : ");
        int i;
        for (i = 0; i < tete; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println(" ");
    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }
    public static void push(int valeur) {
        if (tete< 4 ) {

            tab[tete] = valeur;
            tete++;

        }
    }

    public static int pop(){
        if (tete>0){
            int a = tab[tete-1];
            tete--;
            return a;
        }else{
            return 0;
        }
    }
    public static void main(String[]args){
        for (int i = 0; i < 6; i++){
            int a = input();
            push(a);
            affichertab();
            afficherpile();
            System.out.println("tete: " + tete);

        }
        for (int i=0; i < 4; i++){

            System.out.println("valeur retirée " +  pop());
            affichertab();
            afficherpile();
            System.out.println("tete: " + tete);

        }
        for (int i=0; i < 4; i++){

            System.out.println("valeur retirée " +  pop());
            affichertab();
            afficherpile();
            System.out.println("tete: " + tete);

        }

    }
}
