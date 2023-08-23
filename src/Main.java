
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Paweł", "Jonik", "p.jonik2005@gmail.com", "Pawel2023");
        System.out.println("Zarejestruj się");
        System.out.println("Podaj imię: ");
        person.setName(scanner.nextLine());
        System.out.println("Podaj nazwisko: ");
        person.setSurname(scanner.nextLine());
        System.out.println("Podaj email: ");
        person.setEmail(scanner.nextLine());
        System.out.println("Podaj haslo: ");
        person.setPassword(scanner.nextLine());
        System.out.println("Imię : " + person.getName());
        System.out.println("Nazwisko : " + person.getSurname());
        System.out.println("email : " + person.getEmail());
        System.out.println("haslo: " + hidePassword(person.getPassword()));
        System.out.println("1. Pokaz haslo");
        System.out.println("2. Ukryj haslo");
        System.out.println("3. Wyświetl wszystkie dane");
        System.out.println("4. Zakończ rejestrację");
        while (true) {
            int hide = scanner.nextInt();
            switch (hide) {
                case 1:
                    System.out.println("haslo: " + person.getPassword());
                    System.out.println("2. Ukryj haslo");
                    continue;
                case 2:
                    System.out.println("haslo: " + hidePassword(person.getPassword()));
                    System.out.println("1. Pokaz haslo");
                    continue;
                case 3:
                    System.out.println("Imię : " + person.getName());
                    System.out.println("Nazwisko : " + person.getSurname());
                    System.out.println("email : " + person.getEmail());
                    System.out.println("haslo: " + hidePassword(person.getPassword()));
                    continue;
                case 4:
                    System.out.println("Udało ci się zarejestrować!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static String hidePassword(String password) {
        int passwordLength = password.length();
        return "*".repeat(passwordLength);
    }
}