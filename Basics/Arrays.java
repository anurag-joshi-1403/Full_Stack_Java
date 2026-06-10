
public class Arrays {

    public static void main(String[] args) {
        // int array[] = new int[5];

        // Array Initialization
        int array[] = { 10, 20, 30, 40, 50 };

        // Accessing Elements
        System.out.println("Accessing Elements...");
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[4]);

        // Array Traversal Using Loop
        System.out.println("Array Traversal...");
        int arr[] = { 11, 22, 33, 44, 55 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // // Taking Array Input
        // System.out.println("Taking Array Input...");
        // Scanner sc = new Scanner(System.in);
        // sc.useDelimiter(",");
        // int arr2[] = new int[5];
        // for(int i =0; i < 5; i++){
        // arr2[i] = sc.nextInt();
        // }
        // for(int i=0; i<5; i++){
        // System.out.println(arr2[i]);
        // }

        // Find Sum of Array Elements
        System.out.println("Sum of Array Elements...");
        int sum[] = { 10, 20, 30, 40, 50 };
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        System.out.println(add);

        // Find Largest Element
        int l[] = { 11, 33, 22, 55, 88 };
        int max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println("Largest Element: " + max);

        // Find smallest Value
        int s[] = { 22, 33, 11, 1, -1, 3 };
        int min = s[0];

        for (int i = 1; i < s.length; i++) {
            if (s[i] < min) {
                min = s[i];
            }
        }
        System.out.println("Smallest number : " + min);

        // Find Average of array elements.
        int arr1[] = { 1, 2, 3, 4, 5 };
        int sum1 = 0;
        System.out.println("Find Average of Array Elements...");
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        double average = (double) sum1 / arr1.length;
        System.out.println(average);

        // Find Second Largest Element
        int[] arr2 = { 10, 50, 30, 90, 70 };
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > largest) {
                secondlargest = largest;
                largest = arr2[i];
            } else if (arr2[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr2[i];
            }
        }
        System.out.println("Second Largest : " + secondlargest);

        // Search an Element in Array
        int[] arr3 = { 10, 20, 30, 40, 50 };
        int target = 30;
        boolean found = false;
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] == target) {
                System.out.println("Target Found: " + arr3[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found...");
        }

        // Remove Duplicate Elements
        int[] arr4 = { 10, 20, 30, 20, 40, 10, 50 };
        int empty = 0;
        for (int i = 0; i < arr4.length; i++) {
            boolean skip = false;
            for (int j = 0; j < i; j++) {

                if (arr4[i] == arr4[j]) {
                    empty = arr4[i];
                    skip=true;
                    break;
                } 
            }
            if(!skip){
                System.out.print(+arr4[i] + " ");
            }
        }
        System.out.println();

        // Find Frequency of Elements...
        int[] arr5 = {10,20,30,20,10};
        System.out.println("Find Frequency of Elements...");


        for(int i =0; i< arr5.length; i++){
            boolean visited = false;
            for(int k=0; k <i ;k++){
                if(arr5[i] == arr5[k]){
                    visited = true;
                    break;
                }
            }
            // Skip Duplicate Elements
            if(visited){
                continue;
            }

            // Counting of elements
            int count = 0;
            for(int j=0; j <arr5.length; j++){
                if(arr5[i] == arr5[j]){
                    count++;
                }
            }
            System.out.println(arr5[i] +" -> " +count);
        }

        // Pair Problems
        // 1 : Find Pair with Given Sum.
        int[] arr6 = {2,7,11,15};
        int target2 = 9;

        for(int i =0; i< arr6.length; i++){
            for(int j=i +1; j<arr6.length; j++){
                if(arr6[i] + arr6[j] == target2){
                    System.out.println(arr6[i] + "+" + arr6[j] + " = " + target2);
                }
            }
        }

        // 2 : Count Total Pairs...
        int[] arr7 = {1,2,3,4};
        int count =0;

        for(int i=0; i <arr7.length; i++){
            for(int j=i+1; j<arr7.length; j++){
                System.out.println(("(" + arr7[i] + ", "+ arr7[j] + ")"));
                count++;
            }
        }
        System.out.println("Total count Pairs:" + count);

        // Find All Pair Sum
        int[] arr8 = {1,2,3};
        for(int i=0; i<arr8.length; i++){
            for(int j = i+1; j<arr8.length; j++){
                int sum8 = arr8[i] + arr8[j];
                System.out.println(arr8[i] + " + "+ arr8[j]+ " = "+ sum8);
            }
        }
    }

}
