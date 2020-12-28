package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FIFO {
        static int tete = 0;
        static int queue = 0;
        static int[] tab = new int[10];
        static int cpt = 0;

        public static void main(String[] args) {
                //add stack
                for (int i = 0 ; i<10 ; i++){
                        int a = input();
                        offer(a);
                        printFifo();
                        printTab();
                        System.out.println("tete : " + tete + "  queue : " + queue);
                }
                //remove stack
                for (int i = 0 ; i<10 ; i++){
                        System.out.println("Valeur récupérer Poll : " + poll());
                        printFifo();
                        printTab();
                        System.out.println("tete : " + tete + "  queue : " + queue);
                }//add stack
                for (int i = 0 ; i<10 ; i++){
                        int a = input();
                        offer(a);
                        printFifo();
                        printTab();
                        System.out.println("tete : " + tete + "  queue : " + queue);
                }

        }

        private static void offer(int a) {
                if(cpt < 10){

                        tab[tete] = a;
                        tete++;
                        if (tete == tab.length) {
                                tete = 0;

                        }
                        cpt++;
                }
                else {
                        System.out.println("ERRRRRRRRRR");
                }
                System.out.println("cpt " + cpt);
        }

        private static int poll() {

                if (cpt > 0){
                        int memo = tab[queue];
                        queue++;
                        if(queue == 10){queue = 0 ;}
                        cpt--;
                        return memo;
                }else{
                        System.out.println("HAHA");
                }


                return 0;

        }


        private static void printTab(){
                System.out.println("Tableau : " + Arrays.toString(tab));
        }

        private static  void printFifo(){
                System.out.print("FIFO : ");
                if(queue < tete){
                        for (int i = queue ; i < tete ; i++){
                                System.out.print(tab[i] + " ");
                        }
                }
                else if(tete < queue){
                        for (int j = queue ; j < tab.length ; j++){
                                System.out.print(tab[j] + " ");
                        }
                        for (int k = 0 ; k < tete ; k++){
                                System.out.print(tab[k] + " ");
                        }
                }else if (tete == queue) {
                        if(cpt <= 0) {
                                System.out.print("vide");
                        }
                        else
                        {
                                System.out.print("remplit  : ");
                                for (int j = queue ; j < tab.length ; j++){
                                        System.out.print(tab[j] + " ");
                                }
                                for (int k = 0 ; k < tete ; k++){
                                        System.out.print(tab[k] + " ");
                                }
                        }
                }


                System.out.println();
        }


        //Lecture du nombre
        private static int input(){
                Scanner entreNb = new Scanner(System.in);
                return entreNb.nextInt();
        }


}
