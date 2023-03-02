import java.util.Arrays;

public class TestEffectiveSort {
    public static void main(String[] args) {
        Integer[] a1={3,2,4,8,7,6,1,5};
        Integer[] a2={9,1,3,4,7,6,5,-1};
        Integer[] a3={6,5,8,1,4,3,0,-7};
        EffectiveSort<Integer> eSort=new EffectiveSort<Integer>();
        
        System.out.println(Arrays.toString(eSort.quickSort(a1)));
        System.out.println(Arrays.toString(eSort.heapSort(a2)));
        System.out.println(Arrays.toString(eSort.mergeSort(a3)));
}
}