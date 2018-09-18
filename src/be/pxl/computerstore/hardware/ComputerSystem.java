package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;

public class ComputerSystem implements Computable {

    public static int MAX_PERIPHERAL = 3;
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral[] peripherals = new Peripheral[MAX_PERIPHERAL];

    public ComputerSystem() {
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if (peripheral == null) {
            return;
        }

        if (!isPresent(peripheral)) {
            if (getFreeLocation() != -1) {
                peripherals[getFreeLocation()] = peripheral;
            } else {
//                System.out.println("You cannot add more than 3 peripherals!");
                throw new TooManyPeripheralsException("You've reached the limit of peripherals!");
            }
        }
    }

    private boolean isPresent(Peripheral p) {
        for (int i = 0; i < peripherals.length; i++) {
            if (p.equals(peripherals[i])) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation() {
        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] == null) {
                return i;
            }
        }
        return -1;
    }


    public int getNumberOfPeripherals() {
        int counter = 0;
        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] != null) {
                counter++;
            }
        }
        return counter;
    }


    @Override
    //TODO: check the exercise, this method needs to be implemented!
    public double totalPriceExcl() {
        double mainComponentsPrice = this.processor.getPrice() + this.hardDisk.getPrice() + this.computerCase.getPrice();
        double peripheralsPrice = 0;

        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] != null) {
                peripheralsPrice = +peripherals[i].getPrice();
            }
        }
        return mainComponentsPrice + peripheralsPrice;
    }

    @Override
    public double totalPriceIncl() {
        return 0;
    }
}
