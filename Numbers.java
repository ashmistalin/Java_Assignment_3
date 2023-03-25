import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        try {
            int num1, num2;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the divident: ");
            num1=sc.nextInt();
            System.out.println("Enter the divisor: ");
            num2=sc.nextInt();
            int divi = num1 % num2;
            System.out.println("Quotient: " + divi);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }catch (ArithmeticException  e)
        {
            System.out.print(e);
        }
    }
    }

