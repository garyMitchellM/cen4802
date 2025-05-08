
public class FibonacciSequence {

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


