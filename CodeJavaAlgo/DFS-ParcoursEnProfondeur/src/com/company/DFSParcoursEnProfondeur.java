package com.company;
import java.util.Stack;

public class DFSParcoursEnProfondeur {
        public static void main(String[] args) {

                Stack knotesToExplore = new Stack();
                Stack exploredKnotes = new Stack();
                int currentNode;

                int[][] matrice = {
                        {0,1,1,0,0,0},
                        {1,0,0,0,1,1},
                        {1,0,0,1,0,0},
                        {0,0,1,0,0,0},
                        {0,1,0,0,0,0},
                        {0,1,0,0,0,0}
                };

                knotesToExplore.push(0);
                System.out.println("noeuds à explorer : " + knotesToExplore);
                while (!knotesToExplore.empty()){
                        currentNode = (int)knotesToExplore.pop();
                        System.out.println("noeud : " + currentNode);
                        for(int i = 0 ; i < matrice.length ; i++){
                                int nextNode = i;
                                int poids = matrice[currentNode][nextNode];
                                if (poids == 1 && knotesToExplore.search(nextNode) == -1 && exploredKnotes.search(nextNode) == -1){
                                      knotesToExplore.push(nextNode);
                                        System.out.println("poids : " + poids);
                                        System.out.println("Noeuds à explorer : " + knotesToExplore);
                                }

                        }
                        exploredKnotes.push(currentNode);
                        System.out.println("Noeuds déjà explorer : " + exploredKnotes);
                        System.out.println("Noeuds à explorer : " + knotesToExplore);
                }

        }




}
