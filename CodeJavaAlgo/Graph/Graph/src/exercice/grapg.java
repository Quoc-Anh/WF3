package exercice;

import java.util.Stack;

public class grapg {
    static Stack <Integer> nodesToExplore = new Stack<Integer>();
    static Stack <Integer> exploredNodes = new Stack<Integer>();
    static int currentNode;
    static int[][] matrice = {
            {0,1,1,0,0,0},
            {1,0,0,0,1,1},
            {1,0,0,1,0,0},
            {0,0,1,0,0,0},
            {0,1,0,0,0,0},
            {0,1,0,0,0,0}
    };

    public static void main(String[] args) {
        //exploredNodes[0] = currentNode;
        nodesToExplore.push(0);
        while (!nodesToExplore.isEmpty()) {
            currentNode = nodesToExplore.pop();
            System.out.println("noeud en cour d'exploration : " + currentNode);
            for(int nextNode = 0; nextNode <= 5; nextNode++) {
                if (matrice[currentNode][nextNode] == 1) {
                    if (nodesToExplore.search(nextNode) == -1 && exploredNodes.search(nextNode) == -1) {
                        nodesToExplore.push(nextNode);
                    }
                }
            }
            exploredNodes.push(currentNode);
        }

    }
}
