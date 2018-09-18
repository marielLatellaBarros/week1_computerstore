package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral {

    private KeyboardLayout layout;

    public Keyboard(String vendor, String name, double price, KeyboardLayout layout) {
        super(vendor, name, price);
        this.layout = layout;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.layout;
    }
}
