//V_28
import java.util.Arrays;  //В этот класс были добавлены методы для решения самых 
//распространенных задач, с которыми сталкиваются Java-программисты в работе.

/*java.util.Arrays - это класс приложения для работы с массивами, в основном для сортировки, заполнения и под-поиска. 
Примечание: сортировка использует быструю сортировку, а временная сложность составляет o (n * log (2 ^ n)). 
Если вы хотите отсортировать массив, Arrays определенно является первым выбором.*/


public class save<E> {
    E[] arr; //может быть переменная произвольного типа
    int size;
    int max_size;
    int last_el;

   save() {
        arr = (E[]) new Object[3];
        //В Java определен специальный класс Object, который по умолчанию считается
        //суперклассом всех остальных классов. Иными словами, все классы являются
        //подклассами, производными от класса Object. Это означает, что ссылочная
        //переменная типа Object может ссылаться на объект любого класса.

        /*1. Массивы - это объекты, унаследованные от Object, 
        потому что new Object [0] .getClass (). GetSuperClass () - это Object.class, 
        единственный из которых имеет длину переменной-члена и должен быть открытым.*/
        size = 0;
        last_el = 0;
        max_size = 3;
    }

    public void incr_size(int count) {
        int len = arr.length;
        arr = Arrays.copyOf(arr, len + count + 3);
        /*Этот метод не меняет существующий массив, вместо этого он создает новый массив и копирует в него элементы старого массива.
        Если элементы не поместились (длина меньше длины существующего массива), то лишние значения игнорируются.
        Если длина нового массива больше длины старого, ячейки заполняются нулями.*/
        max_size = len + count + 3;
    }

    public void add(E value) {
        if (size >= max_size - 2)
            incr_size(0);

        arr[size] = value;
        size++;
        last_el++;
    }

    public String search(E value) {
        for (int i = 0; i < size; i++) {
            if (value == arr[i])
                return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
       save first = new save();

        first.add(1);
        first.add(2);
        first.add(3);
        first.add("Hello");
        first.add("World");
        first.add(0);

        System.out.println(first.search(3));
        System.out.println(first.search("Kill"));
    }
}
