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
        createAndSetArticleNumber(vendor);
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

    public String getArticleNumber() {
        return articleNumber;
    }

    private void createAndSetArticleNumber(String vendor) {

        while (vendor.length() < 3) {
            vendor += "X";
        }

        this.articleNumber = vendor.substring(0, 3).toUpperCase();

        this.articleNumber += "-" + createRandomNumber();
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

    @Override
    public String toString() {
        return name + " (" + articleNumber + ") ";
    }

//    public void getFullDescription() {
//        System.out.printf("ArticleNumber = %s %n" +
//                "Vendor = %s %n" +
//                "Name = %s %n" +
//                "Price = %.2f %n", this.articleNumber, this.vendor, this.name, this.price);
//    }

    public String getFullDescription() {
        return "ArticleNumber = " + this.articleNumber + "\n " +
                "Vendor = " + this.vendor + "\n " +
                "Name = " + this.name + "\n " +
                "Price = " + this.price + "\n ";
    }
}
