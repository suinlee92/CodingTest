import java.util.Scanner;

public class UpperLower12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        int cnt = 0;
        boolean flag = true;
        StringBuilder sb = new StringBuilder();

        while(flag){

            if( ( target.length()-1 ) == cnt ) flag = false;

            Character tarChar = target.charAt(cnt);
            Character afterChar;
            if( Character.isUpperCase(tarChar) ){
                afterChar = Character.toLowerCase(tarChar);
            }else{
                afterChar = Character.toUpperCase(tarChar);
            }
            sb.append(afterChar);

            cnt ++;

        }
        System.out.println(sb);
    }
}
