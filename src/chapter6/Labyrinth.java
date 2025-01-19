package chapter6;

public class Labyrinth {
    public static void main(String [] args) {
        int[][] map = new int [8][7];

        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for(int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        System.getProperty("java.classpath");
        FindWay mytest = new FindWay();
        mytest.findWay(map, 1,1);

        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class FindWay {
    /*当前点为0，表明可以走，但是还未走过
      当前点为1，表明是障碍物
      当前点为2，表明可以走，且已经走过
      当前点为3，表明可以走，但是走不通
     */
    public boolean findWay (int [][] map, int i, int j) {
        if(map[6][5] == 2) {
            return true;
        } else {
            if(map[i][j] == 0) {
                map[i][j] = 2;

                //寻径策略：下-右-上-左1
                if(findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i -1, j)) {
                    return true;
                } else if(findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }
}
