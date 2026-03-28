import java.util.Scanner;
public class SumOfThreeNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st numbers:");
        int a=scanner.nextInt();
        System.out.print("Enter 2nd numbers:");
        int b=scanner.nextInt();
        System.out.print("Enter 3rd numbers:");
        int c=scanner.nextInt();
        int sumValue=a+b+c;
        System.out.println(sumValue);
        scanner.close();
    }
}