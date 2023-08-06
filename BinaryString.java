public class BinaryString{
    public static void printbin(int n,int lastplace,String str){
        //Base Case
        if(n==0){
            System.out.println(str);
            return;
        }
        //Working
        if(lastplace==0){
            //Place 0 in chair n
            printbin(n-1,0,str+"0");
            printbin(n-1,1,str+"1");
        }else{
            printbin(n-1,0,str+"0");
        }
    }
    public static void main(String args[]){
        printbin(3,0,"");
    }
}