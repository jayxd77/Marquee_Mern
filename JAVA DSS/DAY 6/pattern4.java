import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String space=" ";
        

        for(int i=1;i<=n;i++){
            char ch='A';

            for(int j=1;j<=n-i;j++){
                System.out.print(space);
            }
             for(int j=0;j<i;j++){
                System.out.print(ch++);
            }
            ch--;
             for(int j=1;j<i;j++){
                System.out.print(--ch);

            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            char ch='A';

            for(int j=1;j<=n-i;j++){
                System.out.print(space);
            }
             for(int j=0;j<i;j++){
                System.out.print(ch++);
            }
            ch--;
             for(int j=1;j<i;j++){
                System.out.print(--ch);

            }
            System.out.println();
        }
        sc.close();
    }
    
}

