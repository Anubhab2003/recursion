public class FriendPairing{
    public static int pair(int n){
        //Base Case
        if(n==1||n==2){
            return n;
        }
        //Working
        //if choice is single
        int fnm1=pair(n-1);
        //if choice is pair
        int fnm2=pair(n-2);
        int pairways=(n-1)*fnm2;
        int Totalways=fnm1+pairways;
        return Totalways;
    }
    public static void main (String args[]){
        System.out.println(pair(3));
    }
}