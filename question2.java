import java.util.*;
public class question2{

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void eng(int n){
        //Base Case
        if(n==0){
            return;
        }
        //Working
        int lastdigit=n%10;
        eng(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
        
    public static void main(String args[]){
        eng(1947);
    }
}