package com.company;

import java.util.Arrays;

public class Sudoku {
        public static void main(String[] args) {

                int [][] sudoku;
                int ligne = 9;
                int colonne = 9;

                sudoku = RemplitGrille(ligne,colonne);
                //nombre dans la grille ne devrait pas être inférieur à 50 sinon l'algo mettra trop de temps voir tres longtemps pour toruver une grille Sudoku

                //Print grid
                for (int i = 0 ; i < ligne ; i++){
                        for (int j = 0 ; j < colonne ; j++){
                                System.out.print(sudoku[i][j]+"  ");
                        }
                        System.out.println();
                }
                System.out.println(VerifSousGrille(sudoku,ligne,colonne));
                System.out.println(VerifColonnes(sudoku,ligne,colonne));
                System.out.println(VerifLignes(sudoku,ligne,colonne));
        }
        //return true if all different
        static boolean TousDifferents (int []tab9, int ligne, int colonne){

                for (int i = 0 ; i < ligne ; i++){
                        for (int j = 0 ; j < colonne ; j++){
                                if ( (tab9[i] == tab9[j]) && (i != j) ){ return false;}
                        }
                }

                return true;
        }
        //fill a grid
        static int[][] RemplitGrille (int ligne, int colonne){
                int sudoku[][] = new int[ligne][colonne];
                boolean condition = false;
                while(condition != true){
                        for (int i = 0 ; i < ligne ; i++){
                                for (int j = 0 ; j < colonne ; j++){
                                        sudoku[i][j] = (int) (1 + Math.random()*50);
                                }
                        }
                        //default with false for tour-on. Switch for test BUT it's not optimal
                        if (VerifColonnes(sudoku,ligne,colonne) && VerifLignes(sudoku,ligne,colonne) && VerifSousGrille(sudoku,ligne,colonne)){
                                condition = true;
                        }
                }
                return sudoku;
        }
        //return true if all different in line
        static boolean VerifLignes(int [][]grille, int ligne, int colonne){
                int []tab9 = new int[ligne];

                for (int i = 0 ; i < ligne ; i++){
                        for (int j = 0 ; j < colonne ; j++){
                                tab9[j] = grille[i][j];
                        }
                        if (TousDifferents(tab9,ligne,colonne) == false){return false;}
                }


                return true;
        }

        //return true if all different in column
        static boolean VerifColonnes(int [][]grille, int ligne , int colonne){
                int []tab9 = new int[ligne];

                for (int i = 0 ; i < ligne ; i++){
                        for (int j = 0 ; j < colonne ; j++){
                                tab9[j] = grille[j][i];
                        }
                        if (TousDifferents(tab9,ligne,colonne) == false){return false;}
                }

                return true;
        }

        //return true if all different in grid
        static boolean VerifSousGrille(int [][]grille,int ligne, int colonne){
                int [] tab3x3 = new int[9];

                int limite_ligne_min = 0, limite_ligne_max = 3, limite_colonne_min = 0, limite_colonne_max = 3;
                ligne = 0;
                colonne = 0;

                for (int i = 0 ; i < ligne ; i++) {
                        int cpt = 0;

                        if (i==1 || i==4 || i==7 ){
                                limite_colonne_min = 0;
                                limite_colonne_max = 3;
                        }
                        if (i==2 || i==5 || i==8 ){
                                limite_colonne_min = 3;
                                limite_colonne_max = 6;
                        }
                        if (i==3 || i==6 || i==9 ){
                                limite_colonne_min = 6;
                                limite_colonne_max = 9;
                        }
                        if (i==1 || i==2 || i==3 ){
                                limite_ligne_min = 0;
                                limite_ligne_max = 3;
                        }
                        if (i==4 || i==5 || i==6 ){
                                limite_ligne_min = 3;
                                limite_ligne_max = 6;
                        }
                        if (i==7 || i==8 || i==9 ){
                                limite_ligne_min = 6;
                                limite_ligne_max = 9;
                        }



                        for (ligne = limite_ligne_min; ligne < limite_ligne_max; ligne++) {
                                for (colonne = limite_colonne_min; colonne < limite_colonne_max; colonne++) {
                                        tab3x3[cpt] = grille[ligne][colonne];
                                        cpt++;
                                }

                        }
                        if (TousDifferents(tab3x3,ligne,colonne) == false) {
                                return false;
                        }
                }
                return true;
        }


}
