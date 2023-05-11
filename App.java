public class App {
    public static void main(String[] args) {
        // Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        System.out.println("->> Static polymorphism pada class Hero <<-");
        System.out.println("");
        Hero h1 = new Hero();
        h1.move();
        h1.move("Menyerang");
        Hero h2 = new Fighter();
        h2.move();

        System.out.println("");
        System.out.println("");

        System.out.println("->> Static polymorphism pada class Enemy <<-");
        System.out.println("");
        Enemy e1 = new Enemy();
        e1.move();
        e1.move(5);
        Enemy e2 = new Witch();
        e2.move();

        System.out.println("");
        System.out.println("");

        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter 
        System.out.println("->> Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter <<-");
        System.out.println("");
        Character c1 = new Character();
        c1.move();

        c1 = new Hero();
        c1.move();

        Hero h3 = (Hero) c1;
        h3.move("Bertahan");

        h3 = new Fighter();
        h3.move();

        c1 = new Enemy();
        c1.move();

        Enemy e3 = (Enemy) c1;
        e3.move(7);

        e3 = new Witch();
        e3.move();

        System.out.println("");
        System.out.println("");

        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        System.out.println("->> Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter <<-");
        System.out.println("");
        Character c2 = new Character();
        c2.move();

        c2 = new Witch();
        c2.move();

        c2 = new Fighter();
        c2.move();

        Fighter f1 = (Fighter) c2;
        f1.move();
    }
}
