
public class Main {
    public static int palindromeOrNot(String word, int start, int end){
        if (start >= end){
            return 1;
        }
        if (word.charAt(start) != word.charAt(end)){
            return 0;
        }
        return palindromeOrNot(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "strings";
        System.out.println(palindromeOrNot(word, 0, word.length()-1));
    }
}