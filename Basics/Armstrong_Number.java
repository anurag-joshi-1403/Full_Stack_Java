public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        int OriginalNum = num;
        int sum = 0;
        int count = 0;

        // Count the number of digit
        int temp = num;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        // Calculate sum of digits raised to power of count
        temp = num;
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }

        // Check if Armstrong number
        if(OriginalNum == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
    
}
