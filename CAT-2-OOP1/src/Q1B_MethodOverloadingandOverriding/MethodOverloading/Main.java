package Q1B_MethodOverloadingandOverriding.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Math math = new Math();  // Correct class name
        System.out.println("Multiply 2 numbers: " + math.multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + math.multiply(2, 3, 4));
    }
}
