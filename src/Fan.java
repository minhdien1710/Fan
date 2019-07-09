public class Fan {
    public final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return this.speed + " " + this.color + " " + this.radius + " fan is on";
        } else {
            return this.color + " " + this.radius + " fan is off";
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed =3;
        fan1.on = true;
        fan1.radius = 5;
        fan1.color = "yellow";
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.speed = 2;
        fan2.on = false;
        fan2.radius = 10;
        fan2.color = "blue";
        System.out.println(fan2);

    }
}
