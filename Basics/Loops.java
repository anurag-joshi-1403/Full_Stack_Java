
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("===== For Loop =====");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // -----------------------------------------------------------------
        System.out.println("===Sum of First 10 Numbers===");
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        // --------------------------------------------------------------------
        System.out.println("==== while loop =====");
        int e = 1;
        while (e <= 5) {
            System.out.println(e);
            e++;
        }
        // -------------------------------------------------------------------
        System.out.println("do while loop");
        do {
            System.out.println(e);
            e++;
        } while (e <= 5);

        // --------------------------------------------------------------------
        // Count digit 
        int n, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        n = sc.nextInt();
        ans = 0;
        while(n > 0){
            n = n/10;
            ans++;
        }
        System.out.println(ans);
// --------------------------------------------------------------------------
        System.out.println("Printing a vertical line(Columns)....");
        int z = 1;
        while(z <=5){
            System.out.print("* ");
            z++;
        }

    }
}
