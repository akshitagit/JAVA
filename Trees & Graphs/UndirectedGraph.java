package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//  Undirected Graph
public class UndirectedGraph {
    private ArrayList<ArrayList<Integer>> arlist= new ArrayList<>();

    public UndirectedGraph(int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp= new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i<j){
                    System.out.println(i+","+j);    //index of position to be filled
                    temp.add(sc.nextInt());         //manual input
                }
                else if(i==j)
                    temp.add(0);
                else
                    temp.add(arlist.get(j).get(i)); //auto-completes the rest of the arraylist
            }
            /*
             * for a 4x4 array the positions to be filled are
             * x manually
             * y automatically
             *
             * 0 x x x
             * y 0 x x
             * y y 0 x
             * y y y 0
             *
             */
            arlist.add(temp);
        }
        //System.out.println(arlist);
    }

    public int find_max(){
        int max=0;
        for(int i=0;i<arlist.size();i++){
            for(int j=i+1;j<arlist.size();j++){
                if(get_vertice(i,j)>max)
                    max=get_vertice(i,j);
            }
        }
        return max;
    }

    public int get_vertice(int x,int y){
        return arlist.get(x).get(y);
    }

}
