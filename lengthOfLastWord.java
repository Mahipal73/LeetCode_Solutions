import java.util.*;
public class lengthOfLastWord {
    static int lenOfLastWord(String s){
        String[] arrOfStr = s.split(" ");
        int l=arrOfStr.length;
        String str=arrOfStr[l-1];
        return str.length();
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    lenOfLastWord(sc.next());

    }
}
