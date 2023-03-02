// Variant 4
public class Save<T> {

	T data;
	Save next;
	Save head;
	Save tail;
	int n;

	void first_addition(T data) {
		Save x = new Save();

		x.data = data;

		if (head == null) {
			head = x;
			tail = x;
		} else {
			x.next = head;
			head = x;
		}

		n++;
	}

	public <T extends Comparable <T> >
		
	Save insert_sort() {

		int k = this.n;

		Save[] mas = new Save[99999];
		Save list_1= this.head;

		for(int i = 0; i < k; i++) {
		mas[i] = list_1;
		list_1 = list_1.next;
		}

		Save list_2 = new Save();

		T tmp1 = (T)mas[1].data;
		T tmp2 = (T)mas[0].data;

		int result = tmp1.compareTo(tmp2);

		for (int i = 0 ; i < k; i++) {
			
			for(int j = i; j > 0; j--) {
				tmp1 = (T)mas[j].data;
				tmp2 = (T)mas[j-1].data;
				result = tmp1.compareTo(tmp2);

				if(result<0) {
					Save tmp = mas[j-1];
					mas[j-1] = mas[j];
					mas[j] = tmp;
				}
			}
		}

		for(int i = k-1; i > -1; i--) {
			list_2.first_addition(mas[i].data);
		}

		return list_2;
	}

}