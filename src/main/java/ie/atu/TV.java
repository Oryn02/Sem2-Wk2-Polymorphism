package ie.atu;

public class TV extends Product
{

    private String ScreenSize;
    private String Manufacture;

    public TV() {
        super();
        Manufacture = "";
        ScreenSize ="";
        count++;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Manufacture + "\n" + ScreenSize;
    }

}
