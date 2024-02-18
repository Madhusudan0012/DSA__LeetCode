package Recursion;
import java.util.*;
public class Coin_change1{
    public static void main(String[] args) {
        System.out.println(coin(0,11,0));
    }
    public static int coin(int curr,int n,int x, int arr[]){
        //Coin Function Kitni barr call karegaa
        if(x>=arr.length) return 0;
        if(curr==n)
        return 1;
        if(curr>n)
        return 0;


       int cnt= 0;
        for(int i=0; i<arr.length ; i++){
            cnt+=coin(curr+arr[i], n,i+1);
        }
       return cnt;

    }
}
    

