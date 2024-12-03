import MemoryPool.*;

public class Exercise5 {
    public static void main(String[] args) {

        Gun gun1 = new Gun();
        System.out.println("Start");
        gun1.fire();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);

        Bullet.resetCount();

        Gun gun2 = new Gun();
        System.out.println("Start");
        gun2.fireInPool();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
