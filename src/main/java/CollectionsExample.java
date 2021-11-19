import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// применение методов интерфейса Collections
public class CollectionsExample {
    public static void main(String[] args) {
        // создаем коллекцию, принимающую объекты типа Integer
        Collection<Integer> intList = new ArrayList<>();
        intList.add(32);
        intList.add(11);
        intList.add(104);
        intList.add(75);
        intList.add(5);
        intList.add(97);

        // выводим состав и размер (количество элементов) коллекции
        System.out.println(intList);
        System.out.println(intList.size());

        // "проверяем", что коллекция содержит указанный объекты
        System.out.println(intList.contains(104));

        // удаляем объект из коллекции (указываем сам объект, а не его индекс)
        intList.remove(5);
        System.out.println(intList);

        // создаем массив из коллекции
        Object[] intArray = intList.toArray();

        // выводим состав массива
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // выводим состав массива с помощью foreach
        for (Object element : intArray) {
            System.out.println(element);
        }

        // сортируем элементы массива по возрастанию
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // создаем пустую коллекцию, принимающую элементы типа Integer
        Collection<Integer> intList2 = new ArrayList<>();

        // копируем содержимое коллекции intlIst в коллекцию intlIst2
        intList2.addAll(intList);

        // сравниваем коллекции
        boolean compare = intList2.equals(intList);
        System.out.println(compare);

        // "проверяем", содержит ли коллекция intlIst2 все элементы коллекции intList
        System.out.println(intList2.containsAll(intList));

        // удаляем объекты из коллекции
        intList2.remove(11);
        intList2.remove(75);
        intList2.remove(97);

        // удаляем из коллекции intList те элементы, которые содержатся в коллекции intlIst2
        intList.removeAll(intList2);

        // очищаем данные коллекции
        intList2.clear();

        // "проверяем", что коллекция пустая
        System.out.println(intList2.isEmpty());
    }
}
