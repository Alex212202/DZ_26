import java.util.Scanner;
public class Third_task {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();
        String name = "Алексей";
        if (age <= 30 && age >= 18)
        {
            System.out.println(name + ", поздравляю вы разобрались как работает if.");
        }
        else {
            System.out.println(name + ", поздравляю вы не выучили теорию про if.");
        }

    }
}
