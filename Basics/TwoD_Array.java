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

    }

}
