public class Methods {
    // Using Static Method...
    static void greet(){
        System.out.println("Hello...");
    }
    // Instance Method...
    void name(){
        System.out.println("Anurag Joshi...");
    }
    public static void main(String[] args) {
        greet();
        Methods obj = new Methods();
        obj.name();
    }
}