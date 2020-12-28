package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSParcoursEnLargeur {
        public static void main(String[] args) {

                LinkedList knotesToExplore = new LinkedList();
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

                knotesToExplore.offer(0);
                System.out.println("noeuds à explorer : " + knotesToExplore);
                while (!knotesToExplore.isEmpty()){
                        currentNode = (int)knotesToExplore.poll();
                        System.out.println("noeud : " + currentNode);
                        for(int i = 0 ; i < matrice.length ; i++){
                                int nextNode = i;
                                int poids = matrice[currentNode][nextNode];
                                if (poids == 1 && knotesToExplore.contains(nextNode) == false && exploredKnotes.search(nextNode) == -1){
                                        knotesToExplore.offer(nextNode);
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
