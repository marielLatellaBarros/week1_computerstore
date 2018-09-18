package be.pxl.computerstore.hardware;


import be.pxl.computerstore.util.Dimension;

import java.security.Key;

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

        System.out.println();


        Mouse mouse1 = new Mouse("HP", "X100", 15.44);
        System.out.println(mouse1);

        System.out.println();

        Monitor monitor1 = new Monitor("HPI", "V-Line 2000", 4333.44);
        System.out.println(monitor1);

        System.out.println();

        Keyboard keyboard1 = new Keyboard("AAA", "BBB", 34, KeyboardLayout.QWERTY);
        System.out.println(keyboard1);
    }
}
