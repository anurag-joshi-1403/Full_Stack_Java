
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        // int array[] = new int[5];

        // Array Initialization
        int array[] = {10, 20, 30, 40, 50};

        // Accessing Elements
        System.out.println("Accessing Elements...");
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[4]);

        // Array Traversal Using Loop
        System.out.println("Array Traversal...");
        int arr[] = {11, 22, 33, 44, 55};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Taking Array Input
        System.out.println("Taking Array Input...");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");
        int arr2[] = new int[5];
        for(int i =0; i < 5; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.println(arr2[i]);
        }

    }

}
