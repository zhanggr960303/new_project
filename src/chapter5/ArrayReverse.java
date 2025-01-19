package chapter5;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] data = {11,22,33,44,55,66,77};
        int temp;
        for(int i = 0;i < data.length / 2 ;i++) {
            temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }

        for(int i = 0;i < data.length;i++) {
            System.out.println(data[i]);
        }
    }
}
