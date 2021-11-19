import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

// применение методов интерфейса List
public class ListExample {
    public static void main(String[] args) {
        // создаем лист Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(22);
        intList.add(15);
        intList.add(73);
        intList.add(1, 9);
        System.out.println(intList);

        // удаляем элемент по индексу
        intList.remove(1);

        // итерируемся по листу и удаляем элемент со значением 22
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(22))
                iterator.remove();
        }

        // удаляем элемент по значению объекта
        intList.remove(Integer.valueOf(22));

        // получаем значение элемента по индексу
        System.out.println(intList.get(1));

        // "проверяем", содержит ли лист элемент с указанным значением
        System.out.println(intList.contains(15));

        // выводим количество элементов листа
        System.out.println(intList.size());

        // изменяем значение элемента с индексом 0
        intList.set(0, 55);

        // копируем элементы из коллекции
        Collection<Integer> intCollection = new ArrayList<>();
        intCollection.add(11);
        intCollection.add(43);
        intCollection.add(4);
        intCollection.add(72);

        intList.addAll(intCollection);
        System.out.println(intList);

        // сортируем элементы листа
        Collections.sort(intList);
        System.out.println(intList);

        // выводим индекс указанного объекта
        System.out.println(intList.indexOf(86));

        // сравниваем содержимое листа и коллекции
        System.out.println(intList.equals(intCollection));

        // "проверяем", пустой ли лист
        System.out.println(intList.isEmpty());

        // создаем массив из листа
        Integer[] intArray = intList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));

        // создаем стринговый лист
        List<String> stringList = new ArrayList<>();
        stringList.add("orange");
        stringList.add("lemon");
        stringList.add("apple");
        stringList.add("mango");

        // сортируем по алфавиту
        Collections.sort(stringList);
        System.out.println(stringList);

        // получаем заданный диапазон из листа
        System.out.println(stringList.subList(1, 3));

        // удаляем элемент по значению
        stringList.remove("mango");

        // удаляем все элементы
        stringList.removeAll(stringList);

        // создаем пустой лист
        List<Object> emptyList = Collections.emptyList();

        // создаем singletonList с одним стринговым значением
        List<String> singletonList = Collections.singletonList("test");
        System.out.println("singletonList: " + singletonList);

        // создаем лист из массива
        Integer[] intArray2 = new Integer[3];
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;

        List<Integer> intList2 = Arrays.asList(intArray2);
        System.out.println(intList2);

        // изменения в списке отражаются на массиве
        intList2.set(0, 10);
        System.out.println(Arrays.toString(intArray2));

        // изменения в массиве отражаются на списке
        intArray2[0] = 11;
        System.out.println(intList2);

        // создаем немодифицируемый лист
        List<String> immutableList = List.of("one", "two", "three");
        System.out.println(immutableList);

        // делаем копию листа
        List<String> copiedList = List.copyOf(immutableList);
        System.out.println("copiedList: " + copiedList);
    }
}
