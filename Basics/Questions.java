public class Questions {
    public static void main(String[] args) {
        // // Print even numbers from 1 to 50
        // int sum = 0;
        // for(int i = 1; i <=50; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // Print Multiplication table of 7
        // int n = 7;
        // int product;
        // for(int i =1; i <=10; i++){
        //     product = n * i;
        //     System.out.println(n + " X " + i +  " = " +product);
        // }

        // Print a patterns Triangle
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Factorial of Numbers
        int fact = 1;
        for(int i=1; i<=5; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of 5 : "+fact);

        // Reverse Numbers
        int num = 1234;
        while(num > 0){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }

        // Count Digits
        int num2 =12345;
        int count =0;

        while(num2 > 0){
            count++;
            num2 = num2/10;
        }
        System.out.println(count);
    }
}
