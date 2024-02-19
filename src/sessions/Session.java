package sessions;

import java.util.Scanner;

public class Session {
    public String input;

    public void getData(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        this.input = sc.nextLine();
    }
}
