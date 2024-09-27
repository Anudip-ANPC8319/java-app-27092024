import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        float quotient = (float) firstNumber / secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}

public class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.performOperation();
    }
}

class Operations {
    public void performOperation() {
        System.out.println("Operation performed!");
    }
}

