// Variant 4
import java.util.Arrays;
public class Test {

	public static void main(String[] args) {

		Save testList = new Save();
	
		Save l = new Save();

		l.first_addition("123");
		l.first_addition("345");
		l.first_addition("678");
		l.first_addition("1234");
		l.first_addition("5678");
		l.first_addition("999999");
		l.first_addition("222222");
		l.first_addition("1");
		l.first_addition("2");
		l.first_addition("3");

		System.out.println();
;
		l = l.insert_sort();

		Save t = l.head;

		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}

		System.out.println();
		System.out.println();
	}
}