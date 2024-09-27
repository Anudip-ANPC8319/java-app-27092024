public class MainClass {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        addition.add();
        subtraction.sub();
        multiplication.multi();
        division.div();
    }
}
