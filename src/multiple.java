import java.util.Scanner;

public class multiple {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++)
        if (array[i]%3==0){
            System.out.print(array[i]+" ");
        }
    }
}
