package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    private static double MIN_CLOCKSPEED = 0.7;
    private double clockspeed;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
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

    @Override
    public String toString() {
        return super.toString() + "Processor{" +
                "clockspeed=" + clockspeed +
                '}';
    }

//    public void getFullDescription() {
////        super.getFullDescription();
////        System.out.printf("Clock speed = %.2fGhz%n", this.clockspeed);
////    }

    public String getFullDescription() {
        return super.getFullDescription() + " Clock speed = " + this.clockspeed;
    }


}
