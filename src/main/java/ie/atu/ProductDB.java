package ie.atu;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product p = null;

        if (productCode.equalsIgnoreCase("zest")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The Boy's a liar pII");
            myMusic.setPrice(57.50);
            myMusic.setArtist("PinkPanthress & Ice Spice");
            myMusic.setLabel("g");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("munch")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("munch");
            myMusic.setPrice(57.50);
            myMusic.setArtist("spice");
            myMusic.setLabel("g");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("LG")) {
            TV myTv = new TV();
            myTv.setCode(productCode);
            myTv.setDescription("glg");
            myTv.setPrice(57.50);
            myTv.setManufacture("g");
            myTv.setScreenSize("g");
            p = myTv;
        } else if (productCode.equalsIgnoreCase("Sony")) {
            TV myTv = new TV();
            myTv.setCode(productCode);
            myTv.setDescription("g");
            myTv.setPrice(57.50);
            myTv.setManufacture("g");
            myTv.setScreenSize("g");
            p = myTv;
        }
        return p;
    }

}