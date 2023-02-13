package ie.atu;

public class Music extends Product
{

    private String artist;
    private String label;

    public Music() {
        super();
        artist = "";
        label ="";
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + "\n" + label;
    }

}

