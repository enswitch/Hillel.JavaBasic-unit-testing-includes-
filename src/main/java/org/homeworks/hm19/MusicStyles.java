package org.homeworks.hm19;

public abstract class MusicStyles {

    private String bandName;
    private String bandCountry;
    private int bandYearFounded;
    private int bandCountAlbums;

    public MusicStyles(String bandName, String bandCountry, int bandYearFounded, int bandCountAlbums) {
        this.bandName = bandName;
        this.bandCountry = bandCountry;
        this.bandYearFounded = bandYearFounded;
        this.bandCountAlbums = bandCountAlbums;
    }

    public String getBandName() {
        return bandName;
    }

    public String getBandCountry() {
        return bandCountry;
    }

    public int getBandYearFounded() {
        return bandYearFounded;
    }

    public int getBandCountAlbums() {
        return bandCountAlbums;
    }

    public void setBandCountAlbums(int bandCountAlbums) {
        if (bandCountAlbums > this.bandCountAlbums) {
        this.bandCountAlbums = bandCountAlbums;
        }
    }


    public abstract void playMusic();


}
