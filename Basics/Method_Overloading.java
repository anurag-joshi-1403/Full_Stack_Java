
class Overload {

    // Method with two integer
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading {

    public static void main(String[] args) {
        Overload obj = new Overload();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
        System.out.println(obj.add(2.5, 3.5));
    }

}
