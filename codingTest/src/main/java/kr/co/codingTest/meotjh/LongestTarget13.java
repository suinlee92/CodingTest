import java.util.Scanner;

public class LongestTarget13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();

        String[] ArraysStr = target.split(" ");

        String longest = ArraysStr[0];

        for (String longestTarget : ArraysStr) {
               Integer temp = longestTarget.length();

               if( temp > longest.length() ){
                   longest = longestTarget;
               }

        }

        System.out.println(longest);


    }
}
