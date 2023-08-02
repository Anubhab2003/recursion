public class prob{
    public static void printdec(int n){
        if(n==50){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printdec(n+1);
    }
    public static void main(String args[]){
        int n=20;
        printdec(n);

    }
}