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

    // Find Square of a number
    static int square(int s){
        return s * s;
    }

    //  Finding Area of circle
    static float circleArea(float r){
        float pi = 3.14f;
        return pi * r * r;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println("First digit: " + firstdigit(n));
        System.out.println("Last digit: " + lastdigit(n));

        int result = add(10, 20);
        System.out.println(result);

        // Factorial 
        System.out.println("Factorial of n : " +factorial(5));

        // Square value
        System.out.println("Square of number :" +square(5));

        // Area of circle
        System.out.println("Area of circle :" + circleArea(2));
    }
}
