package chapter5;

public class BubbleSort {
    public static void main(String [] args) {
        int[] data = {24,69,80,57,13};

        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - i - 1; j++) {
                if(data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
