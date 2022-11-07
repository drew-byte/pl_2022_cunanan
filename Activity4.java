import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {

        // Andrew Felix Cunanan

        method();

    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = "";

        str = input.contains("<data_type> <identifier> <assignment_operator> <value> <delimiter>")
                || input.contains("<data_type> <identifier> <delimiter>") ? "Syntax is Correct!" : "Syntax is Correct!";

        System.out.println(str);

    }

}
