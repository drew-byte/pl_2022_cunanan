import java.util.Scanner;

class Activity3 {

    public static void main(String[] args) {

        // Andrew Felix Cunanan

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
        String input[] = i.split(" ");
        String choices[] = { "String", "int", "char", "double" };
        int val = 0;
        String array[] = new String[5];
        int x = 0;
        String CONSTANT = "<data_type>";
        for (String string : input) {

            if (string.contains(choices[0])) {
                array[x] = CONSTANT;

            } else if (string.contains(choices[1])) {
                array[x] = CONSTANT;

            } else if (string.contains(choices[2])) {
                array[x] = CONSTANT;

            } else if (string.contains(choices[3])) {
                array[x] = CONSTANT;

            } else if (string.contains("=")) {
                array[x + 2] = "<assignment_operator>";

            } else if (string.contains(";")) {
                if (val == 0 && string.contains("\"") || string.contains(";")
                        || string.contains("'")) {
                    array[x + 3] = "<value>";
                    array[x + 4] = "<delimiter>";

                } else if (string.contains(";")) {
                    array[x + 4] = "<delimiter>";

                }
            } else if (val == 0 && string.contains("\"") || string.contains("'")) {
                val++;
                array[x + 3] = "<value>";

            } else {
                array[x + 1] = "<identifier>";
            }

        }
        for (String string : array) {
            printer(string);
        }
    }
}