package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;

    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        this.articleNumber = createArticleNumber(vendor);
    }

    public String getVendor() {
        return vendor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String createArticleNumber(String vendor) {
        this.articleNumber = vendor.substring(0, 3).toUpperCase();


        while (this.articleNumber.length() < 3) {
            this.articleNumber += "X";
        }

        this.articleNumber += "-" + createRandomNumber();


        return this.articleNumber;
    }

    private String createRandomNumber() {
        Random rand = new Random();
        int articleRand = rand.nextInt(100000);
        String finalRandom = Integer.toString(articleRand);

        while (finalRandom.length() < 4) {

            finalRandom = "0" + finalRandom;
        }

        return finalRandom;
    }
}
