import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        // 2D Array Example...
        int arr[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        // Control Rows
        for(int i =0; i<3; i++){
            // Control Columns
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Taking Input In 2D Array
        Scanner sc = new Scanner(System.in);
        int array2[][] = new int[2][2];

        // This two loop is used to take input
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                array2[i][j] = sc.nextInt();

            }
        }
        // This two loop is used to print 
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
