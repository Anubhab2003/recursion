import java.util.*;
public class firstindex{
    public static int index(int arr[],int i,int key){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return index(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={1,4,8,9,55,40};
        int key=550;
        System.out.println(index(arr,0,key));
    }
}