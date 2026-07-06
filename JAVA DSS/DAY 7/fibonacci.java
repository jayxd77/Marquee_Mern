import java.util.*;

public class fibonacci {
    static int a=0,b=1;
    static void fib(int n){
        
        if(n==0){
           
            return ;
        }
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
        fib(n-1);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        fib(n);
        sc.close();
    }
    
}