import java.util.*;

public class largest

{

    static void search(int[] a,int n)

    {

        int large=a[0];

        for(int i=0;i<n;i++){

            if(a[i]>large){

                large=a[i+1];

            }

        }

        System.out.println("Largest:"+large);

    }

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++){

            System.out.println("enter "+i+" element:");

            a[i]=sc.nextInt();

            

        }

        
        search(a,n);

        sc.close();
        
        }

  
}


