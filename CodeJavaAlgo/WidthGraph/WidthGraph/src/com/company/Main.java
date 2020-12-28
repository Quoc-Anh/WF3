package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {
	// write your code here
         LinkedList<Integer> nodesToExplore = new LinkedList<Integer>();
         Stack <Integer> exploredNodes = new Stack<Integer>();
         int currentNode = 0;
         int[][] matrice = {
                {0,1,1,0,0,0},
                {1,0,0,0,1,1},
                {1,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,1,0,0,0,0},
                {0,1,0,0,0,0}
        };
         nodesToExplore.offer((0));

         while (!nodesToExplore.isEmpty()) {
             currentNode = nodesToExplore.poll();
             System.out.println("noeud en cours d'explo : " + currentNode);
             for(int nextNode = 0; nextNode <= 5; nextNode++){
                 if(matrice[currentNode][nextNode] == 1){
                     if(!nodesToExplore.contains(nextNode) && exploredNodes.search(nextNode) == -1 ) {
                         nodesToExplore.offer(nextNode);
                     }
                 }
             }
             exploredNodes.push(currentNode);
         }
    }
}
