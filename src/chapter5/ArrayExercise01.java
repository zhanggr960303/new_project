package chapter5;

public class ArrayExercise01 {
    public static void main(String []args) {
        char [] letters = new char[26];
        for(int i = 0;i < letters.length;i++) {
            letters[i] = (char)('A' + i);
        }

        for(int i = 0;i < letters.length;i++) {
            System.out.print(letters[i]+" ");
        }
    }
}
