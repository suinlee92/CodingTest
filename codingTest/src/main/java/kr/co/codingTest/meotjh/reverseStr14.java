import java.util.*;

public class reverseStr14 {

    String[] ArraysStr = null;

    private void inputTargetData(){

        Scanner sc = new Scanner(System.in);

        int loopCnt = sc.nextInt();
        this.ArraysStr = new String[loopCnt];

        for(int i = 0 ; i < loopCnt ;i++){
            ArraysStr[i] = sc.next();
        }


    }

    private void reverseArr(String[] ArraysStr){

        for(int i = 0 ; i < ArraysStr.length ;i++){

            String target = ArraysStr[i];
            String[] strArr = target.split("");

            List<String> strList = new ArrayList<String>();
            strList = Arrays.asList(strArr);
            Collections.reverse(strList);

            ArraysStr[i] = new String( arrToString(strList) );
        }

    }

    private StringBuilder arrToString ( List<String> strList ){

        StringBuilder sb = new StringBuilder();
        for (String s : strList) {
            sb.append(s);
        }

        return sb;

    }

    private void printResultData(){
        for(int i = 0 ; i < ArraysStr.length ;i++){
            System.out.println(ArraysStr[i]);
        }
    }

    public static void main(String[] args) {

        reverseStr14 main = new reverseStr14();

        main.inputTargetData();
        main.reverseArr(main.ArraysStr);
        main.printResultData();

    }
}
