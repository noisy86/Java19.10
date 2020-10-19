import java.util.Scanner;

public class Prg3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word");
        String word = myObj.nextLine();
        String str = "";
        for(int i = 0; i < word.length();i++){
            str += word.charAt(word.length()-1-i);
        }
        System.out.println(word.equalsIgnoreCase(str));
    }
}
