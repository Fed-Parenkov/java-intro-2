import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// применение методов интерфейса Map
public class MapExample {
    public static void main(String[] args) {
        // создаем Map
        Map<Integer, String> someMap = new HashMap<>();
        someMap.put(1, "apple");
        someMap.put(2, "orange");
        someMap.put(3, "lemon");
        System.out.println(someMap);
        System.out.println(someMap.size());

        // выводим значение элемента по ключу
        System.out.println(someMap.get(2));

        // "проверяем", что Map содержит указанное значение
        System.out.println(someMap.containsValue("apple"));

        // "проверяем", пустая ли Map
        System.out.println(someMap.isEmpty());

        // заменяем значение элемента с ключом 3
        someMap.replace(3, "mango");

        // выводим все значения элементов
        Collection<String> values = someMap.values();
        for (String element : values) {
            System.out.println(element);
        }

        // выводим все ключи
        Set<Integer> keys = someMap.keySet();
        for (Integer element : keys) {
            System.out.println(element);
        }

        // выводим ключи и значения
        Set<Map.Entry<Integer, String>> valuesAndKeys = someMap.entrySet();
        for (Map.Entry<Integer, String> element : valuesAndKeys) {
            System.out.println(element);
        }

        // удаляем элемент по ключу
        someMap.remove(2);

        // удаляем все элементы Map
        someMap.clear();

        // создаем пустую Map
        Map<Object, Object> emptyMap = Collections.emptyMap();
    }
}
