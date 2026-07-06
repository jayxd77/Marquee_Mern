import java.util.*;

public class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ASCII code");
        int n=sc.nextInt();
        System.out.println("Enter size");
        int size=sc.nextInt();
        

        for(int i=0;i<size;i++){
            
            char ch=(char)(n+i);
            
            for(int j=0;j<size;j++){
               
                System.out.print(ch);
                
            }
            System.out.println();
        }
        sc.close();
    }

    
}