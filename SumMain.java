public class SumMain {
    
    // Method that provides two numbers and calls the sum method
    public static void performSum(int numberA, int numberB) {
        // Call the calculateSum method from Sum class
        int result = Sum.calculateSum(numberA, numberB);
        
        // Display the result
        System.out.println("Sum of " + numberA + " and " + numberB + " is: " + result);
    }
    
    public static void main(String[] args) {
        // Call performSum method with two numbers
        performSum(25, 10);
    }
}
