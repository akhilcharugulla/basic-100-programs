import java.util.HashMap;

public class ConvertNumToWord {
    public static void main(String[] args) {
        int no = 121;
        HashMap<Integer, String> numString= new HashMap<>();
        numString.put(1,"one");
        numString.put(2,"two");
        numString.put(3,"three");
        numString.put(4,"four");
        numString.put(5,"five");
        numString.put(6,"six");
        numString.put(7,"seven");
        numString.put(8,"eight");
        numString.put(9,"nine");

        int n = no/10;
        int rem = no % 10;

    }
}