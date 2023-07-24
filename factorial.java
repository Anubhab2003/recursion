import java.util.*;
public class factorial{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=a.nextInt();
        System.out.println(fact(n));
    }
}