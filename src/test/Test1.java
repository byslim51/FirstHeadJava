package test;

import java.util.Objects;

public class Test1 {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return Objects.equals(name, test1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public static void main(String[] args) {
        Test1 a = new Test1();
        Test1 b = new Test1();
        a.name = "Alex";
        b.name = "Alex";

        System.out.println(a.equals(b));



    }

}
