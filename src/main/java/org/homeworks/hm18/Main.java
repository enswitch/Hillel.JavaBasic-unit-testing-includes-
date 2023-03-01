package org.homeworks.hm18;

public class Main {

    public static void main(String[] args) {
        Androids android = new Androids("Xiaomi", "Redmi Note 12 Pro", 2022, 256, 649.99, false);
        iPhones iphone = new iPhones("14 Plus", "2146868429304", 2022, 512, 999.99, true);


        android.releasedByAssistance();
        android.androidLanguage();

        iphone.releasedBy();
        iphone.iOSLanguages();

        Smartphones smartphone [] = {android, iphone};
        for (Smartphones s: smartphone) {
            s.call();
            s.sms();
            s.internet();
        }


    }
}
