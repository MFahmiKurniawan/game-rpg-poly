public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy mulai bergerak dan melangkah maju");
    }

    public void move(int step) {
        System.out.println("Enemy mulai bergerak maju sebanyak " + step + " langkah.");
    }
}
