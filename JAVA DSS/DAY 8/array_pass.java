import java.util.*;

public class array_pass {

    public int findelement(int index, int[] a) {
        if (index >= 0 && index < a.length) {
            return a[index]; 
        } else {
            System.out.println("Invalid index!.");
            return -1; 
        }
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
        
        System.out.print("Enter index to find: ");
        int index = sc.nextInt();
        
        array_pass ap = new array_pass();
        int elem = ap.findelement(index, a);
        
        System.out.print("Element at index " + index + " is: " + elem);
        sc.close();
    }
}
