package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int  sumaCifara(int n){
        int s=0,pom=0;
        while(n!=0){
            pom=n%10;
            n=n/10;
            s=s+pom;

        }
        return s;
    }
    public static void main(String[] args) {
    System.out.println("Unesite n:" );
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<n;i++){
        if(i%sumaCifara(i)==0){
            System.out.println(i +" ");
        }
    }
    }
}
