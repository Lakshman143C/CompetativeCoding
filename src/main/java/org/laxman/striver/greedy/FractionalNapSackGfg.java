package org.laxman.striver.greedy;

import java.util.ArrayList;
import java.util.List;

public class FractionalNapSackGfg {
    public static void main(String[] args) {
        int[] vals={8 ,2, 10, 1, 9, 7, 2 ,6, 4, 9};//{100,60,100,200};
        int[] wt={10, 1, 7, 7, 5, 1, 8, 6, 8, 7};//{20,10,50,50};
        fractionalKnapsack(vals,wt,21);
    }
    static public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        List<double[]> list=new ArrayList<>();
        for(int i=0;i<val.length;i++){
            list.add(new double[]{(double)val[i]/wt[i],i});
        }
        list.sort((a,b)->Double.compare(b[0],a[0]));
        int res=0,temp=capacity;
        for(double[] arr: list){
            if(temp>wt[(int)arr[1]]){
                res+=val[(int)arr[1]];
                temp-=wt[(int)arr[1]];
            }else {
                res+=arr[0]*temp;
                break;
            };
        }
        return res;
    }
}
