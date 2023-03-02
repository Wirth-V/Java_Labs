//V_28
import java.util.Arrays;  //� ���� ����� ���� ��������� ������ ��� ������� ����� 
//���������������� �����, � �������� ������������ Java-������������ � ������.

/*java.util.Arrays - ��� ����� ���������� ��� ������ � ���������, � �������� ��� ����������, ���������� � ���-������. 
����������: ���������� ���������� ������� ����������, � ��������� ��������� ���������� o (n * log (2 ^ n)). 
���� �� ������ ������������� ������, Arrays ����������� �������� ������ �������.*/


public class save<E> {
    E[] arr; //����� ���� ���������� ������������� ����
    int size;
    int max_size;
    int last_el;

   save() {
        arr = (E[]) new Object[3];
        //� Java ��������� ����������� ����� Object, ������� �� ��������� ���������
        //������������ ���� ��������� �������. ����� �������, ��� ������ ��������
        //�����������, ������������ �� ������ Object. ��� ��������, ��� ���������
        //���������� ���� Object ����� ��������� �� ������ ������ ������.

        /*1. ������� - ��� �������, �������������� �� Object, 
        ������ ��� new Object [0] .getClass (). GetSuperClass () - ��� Object.class, 
        ������������ �� ������� ����� ����� ����������-����� � ������ ���� ��������.*/
        size = 0;
        last_el = 0;
        max_size = 3;
    }

    public void incr_size(int count) {
        int len = arr.length;
        arr = Arrays.copyOf(arr, len + count + 3);
        /*���� ����� �� ������ ������������ ������, ������ ����� �� ������� ����� ������ � �������� � ���� �������� ������� �������.
        ���� �������� �� ����������� (����� ������ ����� ������������� �������), �� ������ �������� ������������.
        ���� ����� ������ ������� ������ ����� �������, ������ ����������� ������.*/
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
