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

        if (input.contains("<data_type> <identifier> <assignment_operator> <value> <delimiter>")) {
            str += "Syntax is Correct!";
        } 
        else if(input.contains("<data_type> <identifier> <delimiter>"))
        {
            str += "Syntax is Correct!";
        }
        else {
            str += "Syntax is Error!";
        }

        System.out.println(str);

        sc.close();
    }

}
