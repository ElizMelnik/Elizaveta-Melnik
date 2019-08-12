import java.util.Scanner;

public class name {
    public static void main(String args[]) {
        System.out.print("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.equals("Вячеслав")) {
            System.out.printf("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
