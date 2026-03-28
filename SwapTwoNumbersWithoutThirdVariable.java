import java.util.Scanner;
public class SwapTwoNumbersWithoutThirdVariable {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value for a:");
        int a=scanner.nextInt();
        System.out.println("Enter a value for b:");
        int b=scanner.nextInt();
        System.out.println("Before Swap:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap:a="+a+",b="+b);
        scanner.close();
    }
}
