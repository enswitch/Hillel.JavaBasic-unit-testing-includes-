package org.homeworks.hm18;

public class iPhones implements Smartphones, iOS {

    private String iphoneModel;
    private String iphoneImei;
    private int iphoneYearOfEstablished;
    private int iphoneMemory;
    private double iphonePrice;
    private boolean iphoneUsed;

    public iPhones() {

    }

    public iPhones(String iphoneModel, String iphoneImei, int iphoneYearOfEstablished, int iphoneMemory, double iphonePrice, boolean iphoneUsed) {
        this.iphoneModel = iphoneModel;
        this.iphoneImei = iphoneImei;
        this.iphoneYearOfEstablished = iphoneYearOfEstablished;
        this.iphoneMemory = iphoneMemory;
        this.iphonePrice = iphonePrice;
        this.iphoneUsed = iphoneUsed;
    }

    public String getIphoneModel() {
        return iphoneModel;
    }

    public String getIphoneImei() {
        return iphoneImei;
    }

    public int getIphoneYearOfEstablished() {
        return iphoneYearOfEstablished;
    }

    public int getIphoneMemory() {
        return iphoneMemory;
    }

    public double getIphonePrice() {
        return iphonePrice;
    }

    public boolean isIphoneUsed() {
        return iphoneUsed;
    }

    public void setIphonePrice(double iphonePrice) {
        if (iphonePrice >= 100.00) {
            this.iphonePrice = iphonePrice;
        }
    }

    public void setIphoneUsed(boolean iphoneUsed) {
        if (!this.iphoneUsed) {
            this.iphoneUsed = iphoneUsed;
        }
    }

    @Override
    public void call() {
        System.out.println("iPhone use a native call program or you can download call app from AppStore");
    }

    @Override
    public void sms() {
        System.out.println("iPhone use iMessage for sms or you can download sms app from AppStore");
    }

    @Override
    public void internet() {
        System.out.println("iPhone use Safari by default browser");
    }

    @Override
    public void releasedBy() {
        System.out.println("iPhones were released on iOS Operation System");
    }

    @Override
    public void iOSLanguages() {
        System.out.println("Swift, Objective-C");
    }

    @Override
    public String toString() {
        return "iPhone: " + '\n' +
                "model: " + iphoneModel + '\n' +
                "imei: " + iphoneImei + '\n' +
                "year: " + iphoneYearOfEstablished + '\n' +
                "memory: " + iphoneMemory + "GB" + '\n' +
                "price: " + iphonePrice + "$" + '\n' +
                "used: " + iphoneUsed + '\n';
    }
}
