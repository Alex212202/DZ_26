import java.util.Scanner;
public class Second_task {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
