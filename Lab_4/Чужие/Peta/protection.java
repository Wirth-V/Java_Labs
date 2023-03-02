public class protection {
    public static void main(String[] args){
        Integer[] a={10,7,15,13,20,9,17,4,8,1,6,5};
        int i;
        BinaryTree<Integer> b=new BinaryTree<Integer>();
        for(i=0;i<7;i++){
            b.addElement(a[i]);
        }
        System.out.println(b.toString());
        for(i=0;i<7;i++){
            System.out.println("Element "+a[i]+": "+b.elementStatus(a[i]));
        }
    }
}
