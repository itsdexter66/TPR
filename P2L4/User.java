
/*
1. Waarom kan ik geen switch gebruiken voor
   het testen van < 0 en 0 waarden?

   antwoord: Omdat een switch alleen een getal tegelijk kan checken.

2. Zorg nu ook dat de maximum leeftijd wordt gecheckt
   De leeftijd mag niet hoger worden dan 120.
3. Wijzig ook de main class
   - de gebruiker moet de grenzen weten die ingevoerd kunnen worden.
   - de loop moet ook voor de bovengrens gelden.
4. In de main class wordt de waarde opgehaald door getAge().
   wat zal het programma doen als je dit vervangt door user.age?

    antwoord: Dan zou het niet werken vanwegen het feit dat het een getter is en dus moet het eerst iets krijgen voordat het kan returnen.

*/

public class User
{
    private int age;

    // Constructor
    public User(int age)
    {
        setAge(age);
    }

    // Getter
    public int getAge()
    {
        return age;
    }

    // Setter met controle over de invoer.
    public void setAge(int age)
    {
        if (age <= 0)
        {
            if (age == 0)
            {
                System.out.printf("Kun jij al schrijven als je %d jaar bent%n", age);
            } else if (age < 0)
            {
                System.out.printf("Je kunt niet jonger dan %d jaar%n", this.age);
            }
        }
        else if (age >= 120)
        {
            System.out.println("Dat kan niet.");
        }

        else
            {

            this.age = age;

        }
    }
}
