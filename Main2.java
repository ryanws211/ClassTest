import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by charles on 7/17/14.
 */
public class Main2 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type Something: ");
        String input = null;

        while ((input = br.readLine()) != null  ) {
            System.out.println(input);

            if (input.equals("I'm Done") ) {
                System.out.println("Fine! I'll DIE NOW!");
                return;
            }

        }
    }

    public static void game(String input) {
        //Use an if statement to make a guessing game
    }
}
