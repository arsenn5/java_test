import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите условия: ");

        int val = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите значание: ");

        String asd = scanner.nextLine();

        System.out.print("Введите условия: ");

        int val2 = Integer.parseInt(scanner.nextLine());

        int result = 0;

        if (asd.equals("+")) {
            result = (val + val2);
        } else if (asd.equals("-")) {
            result = (val - val2);
        } else {
            System.out.println("неверено");
            return;
        }
        System.out.println(result);
        scanner.close();
    }
}
