package valuabkekit;
import utilkit.*;

public class Item091 {
    private final String name;
    private int amount;

    public Item091(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static Item091 create(String name, int amount) {
        if ((Tool091.isUseable(name)) && amount > 0) return new Item091(name,amount);
        return null;
    }

    public int add(Item091 item1) {
        return amount += item1.amount;
    }

    public boolean isMatch(Item091 item) {
        if (name.equals(item.name)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "(" + name + "," + amount + ")";
    }
}
