import java.util.Scanner;
public class LargestOfThreeNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int f = sc.nextInt();
        System.out.print("Enter second Number :");
        int s = sc.nextInt();
        System.out.print("Enter third Number : ");
        int t = sc.nextInt();

        if(f > s && f > t){
            System.out.println("A is largest :" +f);
        }
        else if(s > t){
            System.out.println("S is largest: "+ s);
        }
        else {
            System.out.println("t is largest: "+ t);
        }
    }
}
