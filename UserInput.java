import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in); 
        // So the warning is just telling you:
        //“You created a Scanner, but you didn’t close it before your program ends. 
        //This might cause a resource leak in more complex situations.”

        System.out.println("Enter your Details: ");

        System.out.println("Name : ");
        String name = obj.nextLine();

        System.out.println("Age : ");
        int age = obj.nextInt();

        System.out.println("Salary : ");
        float Salary = obj.nextFloat();

        System.out.println("Company : ");
        String Company = obj.next();

        System.out.println("Name : " + name + " Age: " + age + " Salary : " + Salary + " Company : " + Company);
        
        obj.close(); // closed the object
    }
    
}
