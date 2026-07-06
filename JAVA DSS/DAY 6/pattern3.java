import java.util.*;

class pattern3{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        char ch = 'A';


        for (int i = size; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }
        sc.close();
    }
}