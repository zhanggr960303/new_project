package chapter5;

public class ArrayExercise02 {

    public static void main(String [] args) {
        int [] testData = {4,-1,9,10,23};
        int max = testData[0];
        int maxIndex = 0;
        for(int i = 1;i<testData.length;i++) {
            if(max <= testData[i]) {
                max = testData[i];
                maxIndex = i;
            }
        }
        System.out.println("数组中最大数是：" + max + "下标是："+maxIndex);
    }
}
