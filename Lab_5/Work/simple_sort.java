public class simple_sort {

    //sorting by selecting an array of integers of a given size 
    // and
    //sorting by selecting any subsequence of an array
    public void selection_sort_int(int[] num, int low, int high){

        for (int i = low; i <= high; i++){
            int min = i;

            for (int j = i + 1; j <= high; j++)
                if (num[j] < num[min]) 
                    min = j;

            int swap = num[i];
            num[i] = num[min];
            num[min] = swap;
        }
    }

    //sorting by selecting arrays with any data types
    public void selection_sort(Comparable[] num, int low, int high){

        for (int i = low; i <= high; i++){
            int min = i;

            for (int j = i + 1; j <= high; j++)
                if (num[j].compareTo(num[min]) < 0)
                    min = j;

            Comparable swap = num[i];
            num[i] = num[min];
            num[min] = swap;
        }
    }

    //sorting by insertion an array of integers of a given size 
    // and
    //sorting by insertion any subsequence of an array
    public void insertion_sort_int(int []array, int low, int high) {

        for (int j = low; j < high+1; j++) {
            int current = array[j];
            int i = j-1;

            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }

            array[i+1] = current;
        }
    }

    //sorting by insertion arrays with any data types
    public void insertion_sort(Comparable []array, int low, int high) {

        for (int j = low; j < high+1; j++) {
            Comparable current = array[j];
            int i = j-1;

            while ((i > -1) && (array[i].compareTo(current)) > 0) {
                array[i+1] = array[i];
                i--;
            }

            array[i+1] = current;
        }
    }


    //sorting by bubble an array of integers of a given size 
    // and
    //sorting by bubble any subsequence of an array
    public void bubble_sort_int(int[] array, int low, int high){

        for (int i = low; i < high+1; i++) {

            for (int j = low; j < high; j++) {

                if (array[j] > (array[j+1])) {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
    }

    //sorting by bubble arrays with any data types
    public void bubble_sort(Comparable[] array, int low, int high){
        for (int i = low; i < high+1; i++) {

            for (int j = low; j < high; j++) {

                if (array[j].compareTo(array[j+1]) > 0) {
                    Comparable swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
    }
}

