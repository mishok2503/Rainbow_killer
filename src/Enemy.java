import java.util.Random;

public class Enemy {
    private double x = 1;
    private final double y;
    private final int type;
    private double speed = 0.003;
    private static final double acceleration = 0.001;
    private static final Random rnd = new Random();

    public Enemy() {
        y = rnd.nextDouble();
        type = rnd.nextInt(3);
    }

    public void speedUp() {
        speed += acceleration;
    }

    public boolean move() {
        x -= speed;//TODO: remove fps correlation
        return true; //TODO: disapear
    }

    public int getType() {
        return type;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
