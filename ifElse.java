import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name 1: ");
        String name1 = scanner.nextLine();

        if (name1.equals("maayan")) {
            System.out.println("Hello Maayan!");
        } else if (name1.equals("Matan")) {
            System.out.println("Hello Matan.");
        } else if (name1.equals("Yarden")) {
            System.out.println("Hello Yardan.");
        }
    }
}