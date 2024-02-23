import java.util.Scanner;

public class Calculatrice {

    public static double addition(double x,double y){
        return x+y;
    }
    public static double soustraction(double x,double y){
        return x-y;
    }
    public static double multiplication(double x,double y){
        return x*y;
    }
    public static double division (double x,double y){
        return x/y;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result;

        switch(operator) {
            case '+':
                result = addition(num1,num2);
                break;
            case '-':
                result = soustraction(num1,num2);
                break;
            case '*':
                result = multiplication(num1, num2);
                break;
            case '/':
                if(num2 != 0) {
                    result =  division(num1, num2);
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}

