
import java.util.Scanner;

public class Activity5 {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        sc.close();
        semanticMethod(i);
    }

    public static void semanticMethod(String insert) {
        String array[] = insert.split(" ");
        String data[] = { "String", "int", "double", "char", "boolean" };

        boolean checker1 = false, checker2 = false, checker3 = false, checker4 = false, checker5 = false;
        String output = "";

        for (String s : array) {

            checker1 = insert.contains(data[0]) && insert.contains("=") && insert.contains("\"") && insert.contains(";")
                    ? true
                    : false;

            if (insert.contains(data[1]) && insert.contains(data[1]) && insert.contains("=") && insert.contains(";")) {
                try {
                    Integer.parseInt(array[3]);
                    checker2 = true;
                } catch (Exception e) {
                    checker2 = false;
                }

            } else if (insert.contains(data[2]) && insert.contains("=") && insert.contains(";")
                    && insert.contains(".")) {
                try {
                    Double.parseDouble(array[3]);
                    checker3 = true;
                } catch (Exception e) {
                    checker3 = false;
                }

            }
            checker4 = insert.contains(data[3]) && insert.contains("=") && insert.contains("\'") && insert.contains(";")
                    ? true
                    : false;
            checker5 = insert.contains(data[4]) && insert.contains("=") && insert.contains(";")
                    || insert.contains("true") || insert.contains("false") ? true : false;

        }
        output = checker1 || checker2 || checker3 || checker4 || checker5 ? "Semantically Correct!"
                : "Semantically Incorrect!";
        System.out.println(output);

    }

    public static void main(String[] args) {

        // Andrew Felix Cunanan

        input();

    }
}
