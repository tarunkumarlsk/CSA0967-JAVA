import java.util.Scanner;
public class calculator {
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        if (b==0){
            throw new("division by zero is not possible");
        }
        return a/b;
    }

    public static void main(String[] args){
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("enter the second number");
        double num2 = scanner.nextDouble();
        System.out.println("enter the operator");
        String operator = scanner.next();
        double result = 0;
        boolean validOperation = true;
        switch (operator) {
            case "+":
            result = calc.add(num1, num2);
            break;
            case "-":
            result = calc.sub(num1, num2);
            break;
            case "*":
            result = calc.mul(num1, num2);
            break;
            case "/":
            result = calc.div(num1, num2);
            break;
            default:
            validOperation = false;
            break;
            }
            if (validOperation) {
                System.out.println("the result is " + result);
                } else {
                    System.out.println("invalid operation");
                    }
                    }
    }