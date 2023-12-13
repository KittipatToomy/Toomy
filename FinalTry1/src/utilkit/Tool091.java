package utilkit;

public class Tool091 {
    public static boolean isUseable(String input) {
        if (input == null || input.isBlank()) return false;
        return true;
    }

    public static boolean isUseable(Object[] inputs) {
        if (inputs == null || inputs.length < 1) return false;
        return true;
    }

    public static int count091(Object[] ints) {
        if (!(isUseable(ints))) return -1;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != null) count++;
        }
        return count;
    }
}
