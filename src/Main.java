import java.io.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Hello! Please, enter your string for anargam:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String textForReverse = null;

        try {
            textForReverse = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReverseMessageService reverseMessageService = new ReverseMessageService();

        String reversedText = reverseMessageService.reverseLettersInWords(textForReverse);
        System.out.println(reversedText);
    }
}

