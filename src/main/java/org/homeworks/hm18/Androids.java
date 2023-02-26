package org.homeworks.hm18;

public class Androids implements Smartphones, LinuxOS {

    private String androidBrand;
    private String androidModel;
    private int androidYearOfEstablished;
    private int androidMemory;
    private double androidPrice;
    private boolean androidUsed;

    public Androids() {

    }

    public Androids(String androidBrand, String androidModel, int androidYearOfEstablished, int androidMemory, double androidPrice, boolean androidUsed) {
        this.androidBrand = androidBrand;
        this.androidModel = androidModel;
        this.androidYearOfEstablished = androidYearOfEstablished;
        this.androidMemory = androidMemory;
        this.androidPrice = androidPrice;
        this.androidUsed = androidUsed;
    }

    public String getAndroidBrand() {
        return androidBrand;
    }

    public String getAndroidModel() {
        return androidModel;
    }

    public int getAndroidYearOfEstablished() {
        return androidYearOfEstablished;
    }

    public int getAndroidMemory() {
        return androidMemory;
    }

    public double getAndroidPrice() {
        return androidPrice;
    }

    public boolean isAndroidUsed() {
        return androidUsed;
    }

    public void setAndroidPrice(double androidPrice) {
        if (androidPrice >= 100.00) {
            this.androidPrice = androidPrice;
        }

    }

    public void setAndroidUsed(boolean androidUsed) {
        if (!this.androidUsed) {
            this.androidUsed = androidUsed;
        }
    }

    @Override
    public void call() {
        System.out.println("Android use native call app or you can download call app from PlayMarket");
    }

    @Override
    public void sms() {
        System.out.println("Android use Messages for sms or you can download sms app from PlayMarket");
    }

    @Override
    public void internet() {
        System.out.println("Android use Google Chrome by default browser");
    }

    @Override
    public void releasedByAssistance() {
        System.out.println("Android OS was created with Linux OS assistance, but not implement their architecture");
    }

    public void androidLanguage() {
        System.out.println("Java, Kotlin");
    }

    @Override
    public String toString() {
        return "Android: " + '\n' +
                "brand: " + androidBrand + '\n' +
                "model: " + androidModel + '\n' +
                "year: " + androidYearOfEstablished + '\n' +
                "memory: " + androidMemory + "GB" + '\n' +
                "price: " + androidPrice + "$" + '\n' +
                "used: " + androidUsed + '\n';
    }
}
