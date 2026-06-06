public class Method_Questions {

    // Finding firstdigit
    static int firstdigit(int n){
        while(n >= 10){
            n = n / 10;
        }
        return n;
    }

    // Finding lastdigit number
    static int lastdigit(int n){
        n = n % 10; 
        return n;
    }

    // Method Returning Value
    static int add(int a, int b){
        return a + b;
    }

    // Factorial Using Method
    static int factorial(int f){
        int fact = 1;
        for(int i =1; i <= f; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println("First digit: " + firstdigit(n));
        System.out.println("Last digit: " + lastdigit(n));

        int result = add(10, 20);
        System.out.println(result);

        // Factorial 
        System.out.println("Factorial of n : " +factorial(5));
    }
}
