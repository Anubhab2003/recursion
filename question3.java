public class question3{
    
    public static int length(String str,int idx){
        
        //base case
        if(idx>=str.length()){
            return 0;
        }
        //Recursive case
        return 1+length(str,idx+1);
    }
    public static void main(String args[]){
        System.out.println(length("Anubhab",0));
    }
}