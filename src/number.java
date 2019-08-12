import java.util.Scanner;

class number{
    public static void main(String args[]){
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x > 7) {
            System.out.printf("Привет");
        }
    }
}
