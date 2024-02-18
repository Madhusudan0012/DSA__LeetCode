package Recursion;
import java.util.*;
public class Coin_Change {
    public static void main(String[] args) {
        System.out.println(coin(0,11));
    }
    public static int coin(int curr,int n){
        //Coin Function Kitni barr call karegaa
        if(curr==n)
        return 1;
        if(curr>n)
        return 0;


       int cnt= coin(curr+1, n);
        cnt =coin(curr+2, n);
        cnt = coin(curr+5, n);
       return cnt;

    }
}