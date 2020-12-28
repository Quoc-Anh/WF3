package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Dijkstra {

        static Stack exploredKnotes = new Stack();
        static HashMap<Integer, String> hashMapNodesToExploreHistorique = new HashMap<Integer, String>();
        static HashMap<Integer, Integer> hashMapNodesToExplorePoids = new HashMap<Integer, Integer>();

        static int minCout = 10000000;
        static int minNode;

        static int[][] matrice = {
                {-1,2,-1,-1,4,-1,-1},
                {2,-1,1,1,-1,-1,-1},
                {-1,1,-1,-1,-1,-1,9},
                {-1,1,-1,-1,-1,-1,8},
                {4,-1,-1,-1,-1,1,-1},
                {-1,-1,-1,-1,1,-1,1},
                {-1,-1,-1,-1,-1,-1,-1}
        };
        public static void main(String[] args) {

                //Initiation elements for explore
                int currentNode = 0;
                int coutCurrentNode = 0;
                String historiqueCurrentNode = "";

                //Put the initiation in hashMap
                hashMapNodesToExploreHistorique.put(0,"0");
                hashMapNodesToExplorePoids.put(0,0);

                while (!hashMapNodesToExplorePoids.isEmpty())                  //Both hashMap are synchronize, We need one of both to be empty to stop the loop
                {
                        currentNode = getCheaperNode();
                        coutCurrentNode = hashMapNodesToExplorePoids.get(currentNode);
                        historiqueCurrentNode = hashMapNodesToExploreHistorique.get(currentNode);
                        System.out.println("CurrentNode : " + currentNode);
                        System.out.println("coutCurrentNode : " + coutCurrentNode);
                        System.out.println("historiqueCurrentNode : " + historiqueCurrentNode);
                        exploreNode(currentNode, coutCurrentNode, historiqueCurrentNode);
                }
        }
        public static void exploreNode(int currentNode, int coutCurrentNode, String historiqueCurrentNode) {

                //Remove currentNode of HashMap to explore
                hashMapNodesToExploreHistorique.remove(currentNode);
                hashMapNodesToExplorePoids.remove(currentNode);
                for (int i = 0; i < matrice.length; i++)        //traitement of node currentNode : add "voisin" in list to explore
                {
                        int nextNode = i;
                        int poids = matrice[currentNode][nextNode];
                        if (poids >= 0 && exploredKnotes.search(nextNode) == -1 ) {
                                hashMapNodesToExploreHistorique.put(nextNode,historiqueCurrentNode + nextNode);
                                hashMapNodesToExplorePoids.put(nextNode,coutCurrentNode + poids);
                        }
                }
                exploredKnotes.push(currentNode);       //Add currentNode to ExploredKnotes
        }
        public static int getCheaperNode()      //Get low weight of path
        {
                minCout = 1000000;
                hashMapNodesToExplorePoids.forEach( (node, cout)-> {
                        if (cout < minCout){
                                minCout = cout;
                                minNode = node;
                        }
                } );
                return minNode;
        }
}
