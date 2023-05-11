public class Hero extends Character {
    public void move() {
        System.out.println("Hero mulai bergerak dan melangkah maju");
    }

    public void move(String direction) {
        System.out.println("Hero mulai bergerak dan " + direction);
    }
}