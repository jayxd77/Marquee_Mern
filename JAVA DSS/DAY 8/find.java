import java.util.*;

public class find {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search:  ");
        int search=sc.nextInt();

        for(int i=0; i<size; i++){
            if(arr[i]==search){
                System.out.println("Element is at index: "+i);
            }
            
        }
        sc.close();
    }
}


