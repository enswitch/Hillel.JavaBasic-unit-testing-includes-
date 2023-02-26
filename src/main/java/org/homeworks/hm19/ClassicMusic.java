package org.homeworks.hm19;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String bandName, String bandCountry, int bandYearFounded, int bandCountAlbums) {
        super(bandName, bandCountry, bandYearFounded, bandCountAlbums);
    }

    @Override
    public void playMusic() {
        String info = super.getBandName() + " from " + super.getBandCountry();
        info += " has started in " + super.getBandYearFounded() + ".";
        info += " Being focused on Classic music there were already dropped " + super.getBandCountAlbums() + " albums.";
        System.out.println(info);
    }
}
