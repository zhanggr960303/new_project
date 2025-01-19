package chapter4;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author zhanggengrui
 * @version 1.0
 */

public class StarTest {

    public static void main(String []args) {
        diaStar();

    }

    /**
     * 输出空心三角形
     */
    public static void sanStar () {
        System.out.println("请输入空心塔的层数");
        Scanner scannner = new Scanner(System.in);
        int totalLevel = scannner.nextInt();

        for(int i = 1;i <= totalLevel;i++) {

            for(int k = 1;k <= totalLevel - i ;k++) {
                System.out.print(" ");
            }

            for(int j = totalLevel - i + 1;j <= totalLevel + i -1;j++ ) {
                if(j == totalLevel - i + 1 || j == totalLevel + i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    /**
     * 输出空心菱形
     */
    public static void diaStar () {
        System.out.println("请输入菱形空心塔的层数");
        Scanner scannner = new Scanner(System.in);
        int totalLevel = scannner.nextInt();
        int midLevel = totalLevel / 2 + 1;

        for(int i = 1;i <= totalLevel;i++) {

            if(i <= midLevel) {
                for(int k = 1;k <= midLevel - i ;k++) {
                    System.out.print(" ");
                }

                for(int j = midLevel - i + 1;j <= midLevel + i -1;j++ ) {
                    if(j == midLevel - i + 1 || j == midLevel + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            } else {

                for(int k = 1;k <= i - midLevel ;k++) {
                    System.out.print(" ");
                }

                for(int j = i - midLevel + 1;j <= 3 * midLevel - i -1;j++ ) {
                    if(j == i - midLevel + 1 || j == 3 * midLevel - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");

            }

        }
    }


    /**
     * 输出空心菱形精简版
     */
    public static void diaStarv1() {
        System.out.println("请输入菱形空心塔的层数");
        Scanner scannner = new Scanner(System.in);
        int totalLevel = scannner.nextInt();
        int midLevel = totalLevel / 2 + 1;
        int diffnum;

        for(int i = 1;i <= totalLevel;i++) {

            diffnum = Math.abs(midLevel - i);
            for(int k = 1;k <= diffnum ;k++) {
                System.out.print(" ");
            }

            for(int j = diffnum + 1;j <= 2 * midLevel - 1 -diffnum;j++ ) {
                if(j == diffnum + 1 || j == 2 * midLevel - 1 -diffnum) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");


        }
    }

}
