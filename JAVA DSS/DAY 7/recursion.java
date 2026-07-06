import java.util.*;

public class recursion {
    static void fun(int n){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        if (n == 11) {
            return;
        }
        fun(n+1);
        System.out.println(n*num);
        sc.close();
    }
    public static void main(String[] args) {

    int n=1;
    fun(n);
   
    }
}
