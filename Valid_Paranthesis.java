package Recursion;

public class Valid_Paranthesis {
    public static void main(String[] args){
        System.out.println(generate(3,0,0," "));
    }
    public static int generate(int n , int op , int cl , String ans){

        if(op==n&&cl==n){
            return 1;

        }
        if(op<n){
            int a = generate(n, op+1,  cl , ans+"(" );
            
        }
    }
    
}
