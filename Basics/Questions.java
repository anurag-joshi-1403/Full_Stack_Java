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
    }
}
