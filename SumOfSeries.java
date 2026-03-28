import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number upto which the series will continue:");
        int ns=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=ns;i++)
        {
           sum=sum+i;     
        }
        System.out.println("Sum of series:"+sum);
        scanner.close();
     }
}
