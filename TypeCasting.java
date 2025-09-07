public class TypeCasting{

    // in this program we will convert double type to integer type

    public static void main(String[] args){

        double num1 = 500;
        int num2 = 10, sum;

        int intNum1 = (int)num1;

        sum = intNum1 + num2;

        System.out.println("num1 before TypeCasting : " + num1 + " After : " + intNum1);
        System.out.println("sum : " + sum);

    }

}

