package chapter5;

public class YangHui {
    public static void main(String [] args) {
        int [][] data = new int [10][];
        for(int i = 0; i < data.length; i++) {
            data[i] = new int [i + 1];

            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i ) {
                    data[i][j] = 1;
                } else {
                    data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
                }
            }
        }

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
