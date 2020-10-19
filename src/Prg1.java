import java.util.Scanner;

public class Prg1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word");
        String word = myObj.nextLine();
        System.out.println("Next word");
        String nextword = myObj.nextLine();
        int minLength;
        if (word.length()>nextword.length()){
            System.out.println(word.startsWith(nextword));
        }
        else{
            System.out.println(nextword.startsWith(word));
        }

    }
}
