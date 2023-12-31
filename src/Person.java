import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private String email;
    private String password;

    public Person(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Scanner scanner = new Scanner(System.in);
        while (password.length() < 8) {
            System.out.println("Twoje haslo jest za krótkie, spróbuj ponownie: ");
            password = scanner.nextLine();
        }
        this.password = password;
    }

    public String getName() {
        return name;
    }
    Scanner scanner = new Scanner(System.in);
    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        while (name.length() <= 2) {
            System.out.println("Podaj prawidłowe imię: ");
            name = scanner.nextLine();
        }
        this.name = name;
    }

        public String getSurname() {
            return surname;
        }

    public void setSurname(String surname) {
        Scanner scanner = new Scanner(System.in);
        while (surname.length() <= 2) {
            System.out.println("Podaj prawidłowe nazwisko: ");
            surname = scanner.nextLine();
        }
        this.surname = surname;
    }
    }
