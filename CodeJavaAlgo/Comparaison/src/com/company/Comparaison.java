package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Comparaison {
        public static void main(String[] args) {
                int ruban[] = {0,0,1,0,-1,1,0,1,0,-1,-1};
                String etat = "e1";
                String etatSuivant = null;
                int posi_tete = 0;
                String x;
                int is_tour_boucle_termine;



                System.out.println("position : " + posi_tete);
                System.out.println("contenu du ruban : " + Arrays.toString(ruban));

                Scanner lire = new Scanner(System.in);



                while(etat != "fin"){
                        System.out.println("etat courant : " + etat);
                        is_tour_boucle_termine = 0;

                        if (etat == "e1"){
                                if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                        etatSuivant = "e7";
                                }else if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                        etatSuivant = "e2";
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e2" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = 0;
                                        posi_tete++;
                                }else if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = 1;
                                        posi_tete++;
                                }if (ruban[posi_tete] == -1){
                                        etatSuivant = "e3";
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e3" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                }else if (ruban[posi_tete] == 0){
                                        etatSuivant = "e9";
                                }if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete--;
                                        etatSuivant = "e4";
                                }
                                is_tour_boucle_termine = 1;
                        }


                        if (etat == "e4" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete--;
                                }else if (ruban[posi_tete] == 0 || ruban[posi_tete] == 1){
                                        etatSuivant = "e5";
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e5" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        etatSuivant = "e6";
                                }else if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = 0;
                                        posi_tete--;
                                }if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = 1;
                                        posi_tete--;
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e6" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                }else if (ruban[posi_tete] == 0 || ruban[posi_tete] == 1){
                                        etatSuivant = "e1";
                                }
                                is_tour_boucle_termine = 1;
                        }




                        if (etat == "e7" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = 0;
                                        posi_tete++;
                                }else if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = 1;
                                        posi_tete++;
                                }if (ruban[posi_tete] == -1){
                                        etatSuivant = "e8";
                                }
                                is_tour_boucle_termine = 1;
                        }



                        if (etat == "e8" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                }else if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = -1;
                                        posi_tete--;
                                        etatSuivant = "e4";
                                }if (ruban[posi_tete] == 1){
                                        etatSuivant = "e11";
                                }
                                is_tour_boucle_termine = 1;
                        }


                        if (etat == "e9" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                        etatSuivant = "e10";
                                }else if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = 0;
                                        posi_tete++;
                                }if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = 1;
                                        posi_tete++;
                                }
                                is_tour_boucle_termine = 1;
                        }


                        if (etat == "e10" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = 1;
                                        etatSuivant = "fin";
                                        System.out.println("etat courant : " + etat);
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e11" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = -1;
                                        posi_tete++;
                                        etatSuivant = "e12";
                                }else if (ruban[posi_tete] == 0){
                                        ruban[posi_tete] = 0;
                                        posi_tete++;
                                }if (ruban[posi_tete] == 1){
                                        ruban[posi_tete] = 1;
                                        posi_tete++;
                                }
                                is_tour_boucle_termine = 1;
                        }

                        if (etat == "e12" && is_tour_boucle_termine == 0){
                                if (ruban[posi_tete] == -1){
                                        ruban[posi_tete] = 0;
                                        etatSuivant = "fin";
                                        System.out.println("etat courant :" + etat);
                                }
                                is_tour_boucle_termine = 1;
                        }


                        x = lire.nextLine();

                        System.out.println("position : " + posi_tete);
                        System.out.println("contenu du ruban : " + Arrays.toString(ruban));
                        etat = etatSuivant;

                }

                System.out.println("position : " + posi_tete);
                System.out.println("contenu du ruban : " + Arrays.toString(ruban));


        }
}









/*

                String ruban[] = {"1","0","0","0","vide","1","0","1","1","vide","vide","vide"};
                String etat_courant = "e1";
                String etat_suivant = etat_courant;
                int pos_tete = 0;


                System.out.println(Arrays.toString(ruban));

                while ( (etat_courant != "fin") ){

                        if(etat_courant == "e1"){
                                if (ruban[pos_tete] == "1"){
                                        ruban[pos_tete] = "vide";
                                        etat_suivant = "e2";
                                        pos_tete++;
                                }

                        }else if (ruban[pos_tete] =="0"){
                                ruban[pos_tete] = "vide";
                                etat_suivant = "e7";
                                pos_tete++;
                        }else{
                                pos_tete++;
                        }


                        if (etat_courant == "e2"){
                                if (ruban[pos_tete] == "vide"){
                                        etat_suivant = "e3";
                                        pos_tete++;
                                }else {
                                        while (ruban[pos_tete] != "vide"){
                                                etat_suivant = etat_courant;
                                                pos_tete++;
                                        }
                                }
                        }

                        if (etat_courant == "e7"){
                                if (ruban[pos_tete] == "vide"){
                                        etat_suivant = "e8";
                                        pos_tete++;
                                }else {
                                        while (ruban[pos_tete] != "vide"){
                                                etat_suivant = etat_courant;
                                                pos_tete++;
                                        }
                                }
                        }


                        if (etat_courant == "e3"){
                                if (ruban[pos_tete]=="0"){
                                        etat_suivant = "e9";
                                        pos_tete++;
                                }else if (ruban[pos_tete] == "1"){
                                        ruban[pos_tete] = "vide";
                                        etat_suivant = "e4";
                                        pos_tete--;
                                }else{
                                        while (ruban[pos_tete] == "vide"){
                                                etat_suivant = etat_courant;
                                                pos_tete++;
                                        }
                                }

                        }


                        if (etat_courant == "e8"){
                                if (ruban[pos_tete] == "1"){
                                        etat_suivant = "e11";
                                        pos_tete++;
                                }else if (ruban[pos_tete] == "0"){
                                        ruban[pos_tete] = "vide";
                                        etat_suivant = "e4";
                                        pos_tete--;
                                }else{
                                        while (ruban[pos_tete] == "vide"){
                                                etat_suivant = etat_courant;
                                                pos_tete++;
                                        }
                                }
                        }

                        if (etat_courant == "e4"){
                                if (ruban[pos_tete] == "0" || ruban[pos_tete]=="1"){
                                        etat_suivant = "e5";
                                        pos_tete--;
                                }else{
                                        while (ruban[pos_tete] == "vide") {
                                                pos_tete--;
                                        }
                                }
                        }

                        if (etat_courant == "e5"){
                                if (ruban[pos_tete] == "vide"){
                                        etat_suivant = "e1";
                                }else{
                                        while (ruban[pos_tete] == "0" || ruban[pos_tete] == "1"){
                                                pos_tete--;
                                        }
                                }
                        }

                        if (etat_courant == "e9"){
                                if (ruban[pos_tete] == "vide"){
                                        ruban[pos_tete] = "vide";
                                        pos_tete++;
                                        ruban[pos_tete] = "1 : Premier nombre > Deuxième nombre";
                                        etat_suivant = "fin";
                                }else{
                                        while (ruban[pos_tete] == "0" || ruban[pos_tete] == "1"){
                                                pos_tete++;
                                        }
                                }
                        }

                        if (etat_courant == "e11"){
                                if (ruban[pos_tete] == "vide"){
                                        ruban[pos_tete] ="vide";
                                        pos_tete++;
                                        ruban[pos_tete] = "0 : Premier nombre < Deuxième nombre";
                                        etat_suivant = "fin";
                                }else{
                                        while (ruban[pos_tete] == "0" || ruban[pos_tete] == "1"){
                                                pos_tete++;
                                        }
                                }
                        }

                        etat_courant = etat_suivant;


                }







                System.out.println("ruban actuel" + Arrays.toString(ruban));
        }

*/