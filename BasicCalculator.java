import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        float num1, num2;

        System.out.println("Enter first number : ");
        num1 = obj.nextFloat();

        System.out.println("Enter second number : ");
        num2 = obj.nextFloat();

        // menu
        System.out.println("choose opertaion to perform : ");
        System.out.println("1 : Addition ");
        System.out.println("2 : Substraction ");
        System.out.println("3 : Multiplication ");
        System.out.println("4 : Division ");

        int choice = obj.nextInt();

        switch(choice){
            case 1:
            System.out.println("1 : Addition  = " + (num1 + num2));
            break;

            case 2:
            System.out.println("2 : Substraction   = " + (num1 - num2));
            break;

            case 3:
            System.out.println("3 : Multiplication  = " + (num1 * num2) );
            break;

            case 4:
            System.out.println("4 : Division = " + (num1 / num2));
            break;

            default :
            System.out.println("Invalid Option");

        }

        obj.close();

    }
    
}
