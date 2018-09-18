package be.pxl.computerstore.hardware;


import be.pxl.computerstore.util.Dimension;

public class TestApp {
    public static void main(String[] args) {

        ComputerCase computerCase1 = new ComputerCase("Sharkoon", "VS4-V ATX", 1500.50);
        computerCase1.setDimension(new Dimension(200, 430, 445));
        computerCase1.setWeight(3.5);
        computerCase1.getFullDescription();

        System.out.println();

        Processor processor1 = new Processor("AMD", "Ryzen7 1800X", 500.50, 2.4);
        processor1.getFullDescription();

        System.out.println();

        GamingController gamingController1 = new GamingController("AMD", "GmContr", 50.50);
        System.out.println(gamingController1);

        HardDisk hardDisk1 = new HardDisk("Intel", "SATA", 50.00, 500);
        System.out.println(hardDisk1);

        Keyboard keyboard1 = new Keyboard("AAA", "BBB", 34, KeyboardLayout.QWERTY);
        System.out.println(keyboard1);

        Monitor monitor1 = new Monitor("HPI", "V-Line 2000", 4333.44);
        System.out.println(monitor1);

        Mouse mouse1 = new Mouse("HP", "X100", 15.44);
        System.out.println(mouse1);


        ComputerSystem computerSystem1 = new ComputerSystem();
        computerSystem1.setComputerCase(computerCase1);
        computerSystem1.setProcessor(processor1);
        computerSystem1.setHardDisk(hardDisk1);


        computerSystem1.addPeripheral(mouse1);
        computerSystem1.addPeripheral(mouse1);
        computerSystem1.addPeripheral(monitor1);
        computerSystem1.addPeripheral(keyboard1);
        System.out.println(computerSystem1.getPeripherals());
        computerSystem1.addPeripheral(gamingController1);


    }
}
