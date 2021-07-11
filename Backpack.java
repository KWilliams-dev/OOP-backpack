import java.util.ArrayList;
import java.util.List;

public class Backpack {

    String brand;
    int numZippers;
    boolean fitsLaptop;
    List<Items> items = new ArrayList<>();

    public Backpack(String brand, int numZippers, boolean fitsLaptop) {
        this.brand = brand;
        this.numZippers = numZippers;
        this.fitsLaptop = fitsLaptop;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumZippers() {
        return numZippers;
    }

    public void setNumZippers(int numZippers) {
        this.numZippers = numZippers;
    }

    public boolean isFitsLaptop() {
        return fitsLaptop;
    }

    public void setFitsLaptop(boolean fitsLaptop) {
        this.fitsLaptop = fitsLaptop;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", numZippers=" + numZippers +
                ", fitsLaptop=" + fitsLaptop +
                '}';
    }
}
