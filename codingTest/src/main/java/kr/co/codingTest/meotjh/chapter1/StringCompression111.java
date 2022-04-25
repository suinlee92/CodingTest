package kr.co.codingTest.meotjh.chapter1;

public class StringCompression111 {

    public static void main(String[] args) {
        StringCompression111 sc = new StringCompression111();

        String target = "KKHSSSSSSSE";//new Scanner(System.in).next();

        StringBuilder sb = sc.getSolution(target);
        System.out.println(sb);

    }

    public StringBuilder getSolution(String target) {
        int temp = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < target.length(); i++ ){


            if( i != target.length()-1 && target.charAt(i) == target.charAt(i+1) ){
                temp ++;
            }else {
                sb.append(target.charAt(i));
                if( temp!= 1)sb.append(temp);
                temp = 1;
            }
        }
        return sb;
    }
}
