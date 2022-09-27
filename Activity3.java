
import java.util.Scanner;

class Activity3 {
    public static void main(String[] args) {

        //Andrew Felix Cunanan
        
        method();

    }

    public static void printer(String p) {
        System.out.print(p);
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        printer("Enter Source Language: ");
        String i = sc.nextLine();

        printer("Output is: ");
        String input[] = i.split(" ", 5);
        String choices[] = { "String", "int", "char", "double" };
        int val = 0;
        for (String string : input) {

            if (string.contains(choices[0])) {
                printer("<data_type>");
            } else if (string.contains(choices[1])) {
                printer("<data_type>");
            } else if (string.contains(choices[2])) {
                printer("<data_type>");
            } else if (string.contains(choices[3])) {
                printer("<data_type>");
            } else if (string.contains("=")) {
                printer("<assignment_operator>");
            } else if (string.contains(";")) {
                if (val == 0 && string.contains("\"") || string.contains(";")
                        || string.contains("'")) {
                    printer("<value><delimiter>");
                } else if (string.contains(";")) {
                    printer("<delimiter>");
                }
            } else if (val == 0 && string.contains("\"")
                    || string.contains("'")) {
                val++;
                printer("<value>");
            } else {
                printer("<identifier>");
            }

        }
    }
}