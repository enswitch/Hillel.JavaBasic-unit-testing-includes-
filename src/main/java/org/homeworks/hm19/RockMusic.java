package org.homeworks.hm19;

public class RockMusic extends MusicStyles {
    public RockMusic(String bandName, String bandCountry, int bandYearFounded, int bandCountAlbums) {
        super(bandName, bandCountry, bandYearFounded, bandCountAlbums);
    }

    @Override
    public void playMusic() {
        String info = super.getBandName() + " from " + super.getBandCountry();
        info += " were founded in " + super.getBandYearFounded() + ".";
        info += " They play Rock music and already dropped " + super.getBandCountAlbums() + " albums.";
        System.out.println(info);
    }
}
