import java.util.Scanner;
import java.util.regex.*;

public class VietnameseCharacterCounter {
    public static int countVietnameseCharacters(String input) {
        Pattern pattern = Pattern.compile("aw|aa|dd|ee|oo|ow|w");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ki tu bat ki: ");
        String input = scanner.nextLine();
        int result = countVietnameseCharacters(input);
        System.out.println("Output: " + result);
    }
}