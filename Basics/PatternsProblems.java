public class PatternsProblems {
    public static void main(String[] args) {
        for(int i=1; i <=4; i++){
            //  Vertical Star
            System.out.println("*");
        }
        for(int i=1; i <=4; i++){
            // Horizontal star
            System.out.print("* ");
        }
        System.out.println("===Triangle Pattern ===");
        for(int i=1; i <=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
