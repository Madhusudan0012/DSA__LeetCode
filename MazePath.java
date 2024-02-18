package Recursion;
import java.util.*;
public class MazePath{
    public static void main(String[] args){
       int ans =  C_MazePath(0,0,1,1," ");
       System.out.println(ans);

    }
    public static int C_MazePath(int cc, int cr , int ec , int er , String ans){
        if(cc==ec&& cr==er){ //Base case
            System.out.println(ans);
            return 1;

        }
        if(cc>ec&& cr>er){
            return 0;
        }
        //recursion Bolte yhaaa
        int hc =  C_MazePath(cc+1, cr, ec, er, ans+"H");
         int vc = C_MazePath(cc, cr+1 , ec , er , ans+"V");
         return hc+vc;

        
        
    }
    
}