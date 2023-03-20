import java.util.Scanner;

public class UserInput {
    public String input() {
        Scanner s = new Scanner(System.in);
        return s.nextLine().replace(" ", "");
    }
}