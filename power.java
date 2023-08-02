import java.util.*;
public class power{
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }
    public static void main(String args[]){
        System.out.println(pow(100,10));
    }
}