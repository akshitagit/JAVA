package com.company;

import java.util.Scanner;

public class Prim {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        Path path;

        int[] mst_path= new int[n];
        int[] edge_vertices= new int[2];    //the vertices at the start and the end of the mst path
        int min,r,temp=0,edge_vert = 0,weight_sum;

        for(int i=0;i<n;i++){   //execute the algorithm starting from
            //every vertice of the graph
            System.out.println();
            System.out.print(i+"-> ");
            r=0;
            weight_sum=0;
            path= new Path(n);          //reset for next iterations
            path.setpath(i,1);
            edge_vertices[1]=i;
            edge_vertices[0]=i;
            while (path.check()==0){
                min= undirectedGraph.find_max();
                for(int k=0;k<2;k++){
                    for(int j=0;j<n;j++){
                        if(undirectedGraph.get_vertice(edge_vertices[k],j)!=0){   //check if edge exists
                            if(undirectedGraph.get_vertice(edge_vertices[k],j)<=min && path.visited(j)==0) {
                                min= undirectedGraph.get_vertice(edge_vertices[k],j);
                                temp=j;       //keeps track of the next vertice that will enter the mst_path
                                edge_vert=k;  //used in order to replace the correct edge_vertice
                            }
                        }
                    }
                }
                weight_sum+=min;
                mst_path[++r]=temp;
                path.setpath(temp,1);
                edge_vertices[edge_vert]=temp;
                System.out.print(mst_path[r]+"-> ");
            }
            System.out.println(weight_sum);
        }
    }

}
