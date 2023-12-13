import java.util.Arrays;
import java.util.StringJoiner;


public class Student implements Comparable<Student>{
    private final int id;
    private String name;
    private double allowance;
    private static Student[] all;
    private static int count = 0;


    public Student(int id, String name, double allowance) {
        if(name == null &&name.isBlank() && allowance <= 0 && id < 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < count; i++) {
            if(all[i].id == id){
                throw new IllegalArgumentException();
            }
        }

        this.id = id;
        this.name = name;
        this.allowance = allowance;
        if(all == null){
            all = new Student[2];
        }



        if(all.length == count){
            all = Arrays.copyOf(all, all.length *2);
        }

        all[count++] = this;
    }
    public static Student remove(int id){
        for (int i = 0; i < count; i++) {
            if(all[i].id == id){
                var s = all[i];
                all[i] = all[--count];
                all[count] = null;
                return s;
            }

        }
        return null;
    }

    public static double averagaAllowance(){
        double sum = 0.0;
        if (all == null) {
            return -1.0;
        }
        for (int i = 0; i < count; i++) {
            all[i].allowance += sum;

        }
        return sum/count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAllowance() {
        return allowance;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return  String.format("Student(%d,'%s',%f)",id,name,allowance);
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public static void sort() {
        Arrays.sort(all, 0, count);
    }

    public static String listAll() {
        StringJoiner s = new StringJoiner(";");
        for (int i = 0; i < count; i++) {
            s.add(all[i].toString());
        }
        return s.toString();
    }

}