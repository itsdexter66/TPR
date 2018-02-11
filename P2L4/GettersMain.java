import java.util.Scanner;

public class GettersMain
{
    public static void main(String[] args)
    {
        System.out.println("Voordat jij je leeftijd invoerd, je kan niet ouder dan 120 doen.");
        GettersMain program = new GettersMain();
        program.run();

    }

    private void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Wat is je leeftijd, je leeftijd moet groter zijn dan 0 jaar%n");
        User user = new User(scanner.nextInt());

        while (user.getAge() <= 0 || user.getAge() >= 120)
        {
            user.setAge(scanner.nextInt());
        }

        System.out.printf("Je bent %d jaar oud%n", user.getAge());

    }
}
