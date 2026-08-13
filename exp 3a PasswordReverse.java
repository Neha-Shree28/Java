import java.util.Scanner;

public class PasswordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        StringBuilder sb = new StringBuilder(password);

        System.out.println("Original Password : " + password);
        System.out.println("Reversed Password : " + sb.reverse());

        sc.close();
    }
}
