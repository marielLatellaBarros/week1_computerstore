package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    public static double MIN_CLOCKSPEED = 0.75;
    private double clockspeed;

    public Processor(String vendor, String name, double price) {
        super(vendor, name, price);
    }

    public static double getMinClockspeed() {
        return MIN_CLOCKSPEED;
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed < MIN_CLOCKSPEED) {
            this.clockspeed = MIN_CLOCKSPEED;
        } else {
            this.clockspeed = clockspeed;
        }

    }
}
