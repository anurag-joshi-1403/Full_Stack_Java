import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter Operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Result = " + (a+b));
                break;
            case '-':
                System.out.println("Result = " + (a -b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                System.out.println("Result = " + (a / b));
                break;
            case '%':
                System.out.println("Result = " + (a % b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
