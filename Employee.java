public class Employee {

    // instance variable
    public String name;
    private double salary;

    //constructor
    public Employee(String yourName){
        name = yourName;
    }

    // function to set salary
    public void setSalary(double amount){
        salary = amount;
    }

    // function to fetch data
    public void getDetails(){
        System.out.println("\nName : " + name);
        System.out.println("\nSalary : " + salary + "LPA");
    }

    // main function
    public static void main(String args[]){

        // create a Employee Object
        Employee Emp1 = new Employee("Goutam"); 
        Emp1.setSalary(24.5);

        Employee Emp2 = new Employee("Layek"); 
        Emp2.setSalary(50);

        Emp1.getDetails();
        Emp2.getDetails();
    }

    
}
