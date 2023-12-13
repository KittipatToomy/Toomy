package valuabkekit;

import java.util.Arrays;
import utilkit.*;

public class Container091 {
    private final Item091[] items = new Item091[91];

    public boolean add(Item091 item) {
        for (int i = 0; i < items.length; i++) {
            if( items[i] == null && item != null) {
                items[i] = item;

                return true;
            }
            if (item != null && items[i].isMatch(item)) {
                items[i] = item;

                return true;
            }
        }


        return false;
    }

    public boolean remove(Item091 item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].isMatch(item))

                items[i] = items[Tool091.count091(items)-1];
                items[Tool091.count091(items)-1] = null;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Tool091.count091(items));
            for (int i = 0; i < Tool091.count091(items); i++) {
                sb.append(items[i].toString());
        }
        return sb.toString();
    }
}
