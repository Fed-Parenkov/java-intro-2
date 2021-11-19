import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

// применение методов интерфейса Set
// Set предназначен для хранения уникальных (неповторяющихся) объектов (например, id)
public class SetExample {
    public static void main(String[] args) {
        // HashSet - неупорядоченное хранение данных
        Set<String> stringSet = new HashSet<>();
        stringSet.add("p");
        stringSet.add("r");
        stringSet.add("i");
        stringSet.add("v");
        stringSet.add("e");
        stringSet.add("t");
        System.out.println(stringSet);

        // LinkedHashSet - данные хранятся в порядке их добавления в коллекцию
        Set<String> linkedStringSet = new LinkedHashSet<>();
        linkedStringSet.add("p");
        linkedStringSet.add("r");
        linkedStringSet.add("i");
        linkedStringSet.add("v");
        linkedStringSet.add("e");
        linkedStringSet.add("t");
        System.out.println(linkedStringSet);

        // TreeSet - данные в коллекции отсортированы натуральным образом (стринги - по алфавиту, инты - по возрастанию)
        Set<String> treeStringSet = new TreeSet<>();

        // копируем элементы из linkedStringSet
        treeStringSet.addAll(linkedStringSet);
        System.out.println(treeStringSet);

        // выводим количество элементов Set
        System.out.println(treeStringSet.size());

        // сравниваем две коллекции Set
        System.out.println(treeStringSet.equals(linkedStringSet));

        // "проверяем" наличие элемента
        System.out.println(treeStringSet.contains("a"));

        // "проверяем" пустой ли Set
        System.out.println(treeStringSet.isEmpty());

        // удаляем элемент
        treeStringSet.remove("r");

        // создаем массив из элементов Set
        Object[] arrayStringSet = treeStringSet.toArray();

        // удаляем все элементы Set
        treeStringSet.clear();
        System.out.println(treeStringSet);

        // создаем пустой Set
        Set<Object> emptySet = Collections.emptySet();

        // создаем немодифицируемый Set
        Set<String> unmodifiableSet = Collections.unmodifiableSet(stringSet);
    }
}
