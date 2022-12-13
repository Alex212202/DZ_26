import java.util.Scanner;
public class First_task {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int currentYear = console.nextInt();
        int friendYear = console.nextInt();
        int friendAge = currentYear - friendYear;
        System.out.println("Моему другу " + friendAge + " лет.");
    }
}
