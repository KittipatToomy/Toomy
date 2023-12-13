import valuabkekit.*;
import utilkit.*;

public class Main {
    public static void main(String[] args) {
        Item091 a = Item091.create("apple", 20);
        Item091 b = Item091.create("banana", 40);
        a.add(a);
        System.out.println(a.add(b));
//        System.out.println(a.toString());
        array2test();

    }
    public static void array2test(){
        Item091 c = Item091.create("papaya", 20);
        Item091 d = Item091.create("pineapple", 40);
        Item091 q = Item091.create("pineapple1", 40);
        Item091 v = Item091.create("pineapple2", 40);
        Container091 x = new  Container091();

        System.out.println(x.add(c));
        System.out.println(x.add(d));
        System.out.println(x.add(q));
        System.out.println(x.remove(c));
        System.out.println(x.add(v));
        System.out.println(x.toString());

    }
}