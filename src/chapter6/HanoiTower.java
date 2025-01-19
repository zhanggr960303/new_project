package chapter6;

public class HanoiTower {

    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
    }


}

class Tower {


    public void move (int number, char a, char b , char c) {
        if(number == 1) {
            System.out.println(a + "->" + c);
        } else {
            move(number - 1, a, c, b);
            System.out.println(a + "->" + c);
            move(number - 1, b, a, c);
        }
    }
}