
public class FibonacciSequence {

    /***
     * This method includes the logic for calculating the nth number of the Fibonacci sequence
     * by using recursion
     * @param n
     * @return "the result the method gives for n-1" added to "the result the method gives for n-2"
     */
    public static int Fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        int result = FibonacciSequence.Fibonacci(n);

        System.out.println("The " + n + " term of the Fibonacci sequence is " + result + ".");
    }

}


