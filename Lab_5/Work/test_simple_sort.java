public class test_simple_sort {

    public static void main(String[] args) {
        
        simple_sort example = new simple_sort();



        //sorting by selecting
        int[] mas1 = {-495, 493, 0, 13, -5, -999, 67, 32, 1000, -15, 78, 6};
        Comparable[] mas2 = {"During", "my", "work", "I", "want", "sleep"};

        //sorting any subsequence of an array
        // sorting an array of integers of a given size
        example.selection_sort_int(mas1, 2, 7);
        System.out.println();

        System.out.println("Will by short elevent from 2 to 7");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i]+" ");
        }
        
        //sorting an array of integers of a given size
        //sorting arrays with any data types
        example.selection_sort(mas2, 0, mas2.length-1);
        System.out.println();

        for (int i = 0; i < mas2.length; i++)
            System.out.println(mas2[i]);

        System.out.println();




        //sorting by bubble
        int[] mas3 = {125, 666, 100 , 53, 40, 15, 4, 3, 0, 1};
        Comparable[] mas4 = {"I",  "really",  "want",  "to",  "sleep"};

        // sorting an array of integers of a given size
        example.bubble_sort_int(mas3, 0, mas3.length-1);

        System.out.println("Will by all elements");
        for (int i = 0; i < mas3.length; i++){
            System.out.print(mas3[i]+" ");
        }

        //sorting arrays with any data types
        example.bubble_sort(mas4, 0, mas4.length-1);
        System.out.println();

        for (int i = 0; i < mas4.length; i++){
            System.out.println(mas4[i]);
        }




        //sorting by insertion
        int[] mas5 = {-100, -10, -1, 0, 1, 10, 100};
        Comparable[] mas6 = {"W", "D", "A", "b", "z"};
        Comparable[] mas7 = {"73.03", "-23,99", "-1", "0", "100.1", "-1000"};

        // sorting an array of integers of a given size
        example.insertion_sort_int(mas5, 0, mas5.length-1);
        System.out.println();

        System.out.println("Will by all elements");
        for (int i = 0; i < mas5.length; i++) {
            System.out.print(mas5[i]+" ");
        }

        //sorting any subsequence of an array
        example.insertion_sort(mas6, 0, mas6.length-1);
        System.out.println();

        for (int i = 0; i < mas6.length; i++)
            System.out.println(mas6[i]);

        System.out.println();

        //sorting any subsequence of an array
        example.insertion_sort(mas7, 0, mas7.length-1);
        System.out.println();

        System.out.println("Will by all elements");
        for (int i = 0; i < mas7.length; i++)
            System.out.println(mas7[i]);

        System.out.println();
    }
}
