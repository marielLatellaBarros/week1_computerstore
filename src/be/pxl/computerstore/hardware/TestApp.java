package be.pxl.computerstore.hardware;


import be.pxl.computerstore.util.Dimension;

public class TestApp {
    public static void main(String[] args) {

        ComputerCase computer1 = new ComputerCase("Sharkoon", "VS4-V ATX", 30.63);
//        System.out.println(computer1);
        computer1.setDimension(new Dimension(200, 430, 445));
        computer1.setWeight(3.5);
        computer1.getFullDescription();

        System.out.println();

        Processor processor1 = new Processor("AMD", "Ryzen7 1800X", 400.27, 2.4);
//        System.out.println(processor1);
//        System.out.println(Processor.getMinClockspeed());
        processor1.getFullDescription();
    }
}
