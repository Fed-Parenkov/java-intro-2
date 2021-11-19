package objectsArraySorting;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // создаем 4 объекта класса People
        People a1 = new People("Stepan", 25);
        People a2 = new People("Andrey", 34);
        People a3 = new People("Irina", 29);
        People a4 = new People("Elena", 18);

        // создаем массив объектов с типом данных People
        People[] allPeople = {a1, a2, a3, a4};
        System.out.println(Arrays.toString(allPeople));

        // используем объект класса ComparatorByName для сортировки объектов массива по name
        Arrays.sort(allPeople, new ComparatorByName());
        for (People tmp : allPeople) {
            System.out.println(tmp);
        }
        System.out.println();

        // используем объект класса ComparatorByAge для сортировки объектов массива по age
        Arrays.sort(allPeople, new ComparatorByAge());
        for (People tmp : allPeople) {
            System.out.println(tmp);
        }
        System.out.println();

        // другой способ сортировки
        // сортируем объекты массива по name
        Arrays.sort(allPeople, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (People tmp : allPeople) {
            System.out.println(tmp);
        }
        System.out.println();

        // сортируем объекты массива по age
        Arrays.sort(allPeople, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.age - o2.age;
            }
        });
        for (People tmp : allPeople) {
            System.out.println(tmp);
        }
        System.out.println();
    }
}
