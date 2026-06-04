public class Operators {
    public static void main(String[] args){
        System.out.println("======Arithmetic Operators=======");
        int a = 19;
        int b = 11;
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum of a and b : " + sum);
        System.out.println("Subtraction of a and b :" +sub);
        System.out.println("Multiplication of a and b :" + multi);
        System.out.println("Division of a and b :" + div);
        System.out.println("Modulo of a and b :" + mod);

        System.out.println("======Unary Operators========");
        a++;
        System.out.println("Increment(++) :" + a);
        b--;
        System.out.println("Decrement(--) : " + b);
        ++a;
        System.out.println("Pre-Increment(++a) : " + a);
        --b;
        System.out.println("Post-Increment : " +b);

        System.out.println("===== Relational Operators=====");
        System.out.println(a ==b);
        System.out.println(b != a);
        System.out.println(a > b);
        System.out.println( a < b);

        System.out.println("=====Logical Operators=====");
        int age = 21;
        System.out.println(age > 18 && age < 30);
        // OR (||) Operator is used.
        int age2 = 16;
        System.out.println(age < 18 || age > 60);
        // NOT (!) operator is used
        boolean pass = true;
        System.out.println(!pass);
    }
}