package objectsArraySorting;

import java.util.Comparator;

public class People {
    String name;
    int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // переопределенный метод toString (чтобы объекты массива выводились в читабельном виде)
    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

// Comparator для сортировки по name
class ComparatorByName implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((People) o1).name.compareTo(((People) o2).name);
    }
}

// Comparator для сортировки по age
class ComparatorByAge implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((People) o1).age - ((People) o2).age;
    }
}