import java.util.Scanner;
public class CheakEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("This is a Even number.");
        }
        else
        {
            System.out.println("This is Odd number.");
        }
        scanner.close();
    }
}
