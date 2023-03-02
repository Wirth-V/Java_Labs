import java.util.Arrays;

public class myVector<E> {

    E[] arr;
    int size;
    int max_size;
    int last_el;

    myVector() {
        arr = (E[]) new Object[3];
        size = 0;
        last_el = 0;
        max_size = 3;
    }

    myVector(int count) {
        arr = (E[]) new Object[3];
        incr_size(count);
        size = 0;
        last_el = 0;
        max_size = count + 10;
    }

    myVector(myVector<E> copy) {
        arr = Arrays.copyOf(copy.arr, copy.arr.length);
        size = copy.size;
        last_el = copy.last_el;
        max_size = copy.max_size;
    }

    public void incr_size(int count) {
        int len = arr.length;
        arr = Arrays.copyOf(arr, len + count + 3);
        max_size = len + count + 3;
    }

    public void add(E value) {
        if (size >= max_size - 2)
            incr_size(0);

        arr[size] = value;
        size++;
        last_el++;
    }

    public void add(E value, int index) {
        if (index > max_size) {
            System.out.println("Ne tak mnogo!");
            return;
        }

        int new_size = size + 1;
        size = index;
        add(value);
        size = new_size;
        last_el = index;
    }

    public void del() {
        arr[size - 1] = null;
        size--;
    }

    public void del(int index) {
        if (index > max_size) {
            System.out.println("Ne tak mnogo!");
            return;
        }
        arr[index] = null;

        for (int i = index; i < max_size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    public void clear() {
        arr = Arrays.copyOf(arr, 3);
        for (int i = 0; i < 3; i++) {
            arr[i] = null;
        }
    }
}
