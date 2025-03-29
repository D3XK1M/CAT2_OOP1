package Q2B_ExceptionHandling;

class Division {
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide a number by zero, dummy!");
        }
        return numerator / denominator;
    }
}
