import java.util.*;

public class array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements of odd place: ");
        for(int i=0; i<size; i+=2){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
