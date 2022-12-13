import java.util.Scanner;

public class Fourth_task {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        if (x > 0 && y > 0)
        {
            System.out.println("Цель находится в I четверти.");
        } else if (x < 0 && y > 0) {
            System.out.println("Цель находится в II четверти.");
        } else if (x < 0 && y < 0) {
            System.out.println("Цель находится в III четверти.");
        } else if (x > 0 && y < 0) {
            System.out.println("Цель находится в IV четверти.");
        } else if (x == 0 && y == 0) {
            System.out.println("Цель находится в начале координат.");
        }

    }
}
