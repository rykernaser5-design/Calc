import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        boolean as = true;
        Scanner scanner = new Scanner(System.in);

        while (as == true) { //checks if exit is typed

            System.out.print("Solve: ");

            String firstInput = scanner.next();

            if ("exit".equals(firstInput)) { // stops everything if exit is typed
                System.out.println("Exiting");
                as = false;
                continue;
            }
       
            String operator = scanner.next();
            double secondInput = scanner.nextDouble();

            double a = 0;
            double firstNum = Double.parseDouble(firstInput);
            switch (operator) {
                case "+" -> a = firstNum + secondInput; // all of the calculations
                case "-" -> a = firstNum - secondInput;
                case "*" -> a = firstNum * secondInput;
                case "/" -> a = firstNum / secondInput;
                default -> System.out.println("Invalid operator");
            }

            System.out.println(firstNum + " " + operator + " " + secondInput + " = " + a); 

        }
        
       
    }
}
