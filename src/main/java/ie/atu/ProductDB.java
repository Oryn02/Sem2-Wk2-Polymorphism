package ie.atu;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }


        if (productCode.equalsIgnoreCase("zest")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The Boy's a liar pII");
            myMusic.setPrice(57.50);
            myMusic.setArtist("PinkPanthress & Ice Spice");
            myMusic.setLabel("best song of all time");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("spice")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("munch");
            myMusic.setPrice(57.50);
            myMusic.setArtist("Ice spice");
            myMusic.setLabel("better than pac'");
            p = myMusic;
        }


        if (productCode.equalsIgnoreCase("LG")) {
            TV myTv = new TV();
            myTv.setCode(productCode);
            myTv.setDescription("LG OLED C2 4k Smart tv");
            myTv.setPrice(57.50);
            myTv.setManufacture("LG");
            myTv.setScreenSize("Screen size is 42\"");
            p = myTv;
        } else if (productCode.equalsIgnoreCase("Sony")) {
            TV myTv = new TV();
            myTv.setCode(productCode);
            myTv.setDescription("Sony Bravia Smart Tv");
            myTv.setPrice(57.50);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("Screen size is 55\"");
            p = myTv;
        }
        return p;
    }

}