package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

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
            int freeLocation = getFreeLocation();
            if (freeLocation != -1) {
                peripherals[freeLocation] = peripheral;
            } else {
//                System.out.println("You cannot add more than 3 peripherals!");
                throw new TooManyPeripheralsException("You've reached the limit of peripherals!");
            }
        }
    }

    private boolean isPresent(Peripheral p) {
        for (Peripheral peripheral : peripherals) {
            if (p.equals(peripheral)) {
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

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    @Override
    public double totalPriceExcl() {
        double mainComponentsPrice = this.processor.getPrice() + this.hardDisk.getPrice() + this.computerCase.getPrice();
        double peripheralsPrice = 0;

        for (Peripheral peripheral : peripherals) {
            if (peripheral != null) {
                peripheralsPrice = +peripheral.getPrice();
            }
        }
        return mainComponentsPrice + peripheralsPrice;
    }

}
