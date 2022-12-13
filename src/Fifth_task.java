import java.util.Scanner;

public class Fifth_task {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a + b > c && a + c > b && b + c > a)
        {
            System.out.println("Такой треугольник можно построить.");
        }
        else
        {
            System.out.println("Такой треугольник построить нельзя.");
        }


    }
}
