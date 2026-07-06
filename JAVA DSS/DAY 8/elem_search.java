import java.util.*;

public class elem_search {

    public int findelement(int[] a, int x) 
    {
        for(int i=0;i<a.length;i++)
        {
        if(x==a[i]){
            return i;
        }
    } 
            return -1;  
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter " + i + " element");
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to find: ");
        int element = sc.nextInt();
        
        elem_search ap = new elem_search();
        int index = ap.findelement(a, element);
        
        System.out.print("Element at  " + index );
        sc.close();
    }
}
