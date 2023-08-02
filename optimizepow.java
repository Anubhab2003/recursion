import java.util.*;
public class optimizepow{
    public static int pow(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpow=pow(a,n/2);
        int halfpowSq=halfpow*halfpow;
        if(n%2==1){
            halfpowSq=a*halfpowSq;
        }
        return halfpowSq;

    }
    public static void main(String args[]){
        int a=2;
        int n=101;
        System.out.println(pow(a,n));
    }
}