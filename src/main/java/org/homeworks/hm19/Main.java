package org.homeworks.hm19;

public class Main {
    public static void main(String[] args) {

        MusicStyles popBand1 = new PopMusic("One Rupublic", "USA", 2002, 6);
        MusicStyles popBand2 = new PopMusic("Marron 5", "USA", 1995, 7);
        MusicStyles popBand3 = new PopMusic("Coldplay", "UK", 1996, 9);
        MusicStyles rockBand1 = new RockMusic("Papa Roach", "USA", 1993, 11);
        MusicStyles rockBand2 = new RockMusic("Evanescense", "USA", 1995, 5);
        MusicStyles rockBand3 = new RockMusic("Guano Apes", "Germany", 1994, 5);
        MusicStyles classicBand1 = new ClassicMusic("Luke Howard", "USA", 2016, 2);
        MusicStyles classicBand2 = new ClassicMusic("Trevor Kowalski", "Poland", 2014, 3);
        MusicStyles classicBand3 = new ClassicMusic("Olivia Belli", "Italy", 2018, 2);

        MusicStyles allBands [] = {popBand1, popBand2, popBand3, rockBand1, rockBand2, rockBand3, classicBand1, classicBand2, classicBand3};

        for (MusicStyles i:allBands) {
            i.playMusic();
        }
    }


}
