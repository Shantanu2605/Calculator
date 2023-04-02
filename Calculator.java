import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to SK Calculator!!");
        System.out.println("--------------------------");
        System.out.print("Enter first number:");
        Scanner num= new Scanner(System.in);
        int numb1= num.nextInt();
        System.out.print("Enter second number:");
        Scanner no= new Scanner(System.in);
        int numb2= no.nextInt();
        System.out.println("What do you want to do ?");
        System.out.print(" Divide (d) \n Subtract (s) \n Add (a) \n Multiply (s):");
        Scanner input= new Scanner(System.in);
        String entered= input.next();
        switch (entered) {
            case "a" -> System.out.println(numb1 + numb2);
            case "d" -> System.out.println(numb1 / numb2);
            case "s" -> System.out.println(numb1 - numb2);
            case "m" -> System.out.println(numb1 * numb2);
            default -> System.out.println("Please enter any one of the operators");
        }

    }
}
