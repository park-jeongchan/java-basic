package access.ex;

public class Item {
    private String name;
    private int price;
    private int value;

    public Item(String name, int price, int value) {
        this.name = name;
        this.price = price;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getValue() {
        return value;
    }
}
