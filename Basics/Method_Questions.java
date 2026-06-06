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

    public static void main(String[] args) {
        int n = 123;
        System.out.println("First digit: " + firstdigit(n));
        System.out.println("Last digit: " + lastdigit(n));
    }
}
