import java.util.Scanner;

class number {
    public static void main(String args[]) {
        System.out.print("Введите число: \n");
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 100; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] <= 7) {
                System.out.printf("Не больше 7\n");
                System.out.printf("Введите число:\n");
            } else if (arr[i] > 7) {
                System.out.printf("Привет");
                break;
            }
        }

    }
}

