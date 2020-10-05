package com.company;

import java.util.ArrayList;

public class Path {
    ArrayList<Integer> path= new ArrayList<>();

    public Path(int n){
        for(int i=0;i<n;i++){
            path.add(-1);
        }
    }

    public int visited(int x){
        if(path.get(x)==-1)
            return 0;
        return 1;
    }

    public int check(){
        for(int i=0;i<path.size();i++){
            if(path.get(i)==-1)
                return 0;
        }
        return 1;
    }

    public int setpath(int x,int y){
        return path.set(x,y);
    }

}
