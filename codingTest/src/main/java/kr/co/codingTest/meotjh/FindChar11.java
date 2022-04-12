import java.io.IOException;
import java.util.Scanner;

public class FindChar11 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String string = sc.next().toLowerCase();
        char targetChar = sc.next().toLowerCase().charAt(0);

        Long targetCnt = string.chars().filter( c -> c == targetChar ).count();

        System.out.println(targetCnt);
    }

}
