

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

        // // Taking Array Input
        // System.out.println("Taking Array Input...");
        // Scanner sc = new Scanner(System.in);
        // sc.useDelimiter(",");
        // int arr2[] = new int[5];
        // for(int i =0; i < 5; i++){
        //     arr2[i] = sc.nextInt();
        // }
        // for(int i=0; i<5; i++){
        //     System.out.println(arr2[i]);
        // }

        // Find Sum of Array Elements
        System.out.println("Sum of Array Elements...");
        int sum[] = {10,20,30,40,50};
        int add = 0;
        for(int i=0; i<arr.length; i++){
            add += arr[i];
        }
        System.out.println(add);

        // Find Largest Element
        int l[] = {11,33,22,55,88};
        int max = l[0];
        for(int i = 1; i< l.length; i++){
            if(l[i] > max){
                max = l[i];
            }
        }
        System.out.println("Largest Element: " +max);

        // Find smallest Value
        int s[] = {22,33,11,1,-1,3};
        int min = s[0];
        
        for(int i=1; i<s.length; i++){
            if(s[i] < min){
                min = s[i];
            }
        }
        System.out.println("Smallest number : "+min);
        

        // Find Average of array elements.
        int arr1[] = {1,2,3,4,5};
        int sum1 = 0;
        System.out.println("Find Average of Array Elements...");
        for(int i =0; i< arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        double average = (double)sum1 / arr1.length;
        System.out.println(average);
    }

}
