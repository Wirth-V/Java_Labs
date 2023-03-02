public class protection{
    public static void main(String[] args){
        int[] a1={3, 2, 4, 8, 7, 6, 1, 5};
        int i;

        for(i = 0; i < 8; i++){
            System.out.println(a1[i]);
        }

        myList.shellSort(a1, a1.length);
        System.out.println(" ");

        for(i = 0; i < 8; i++){
            System.out.println(a1[i]);
        }
    }
}

class myList{
    public static int[] shellSort(int[] data,int l){
        System.out.println("Start "+ l);
        Integer i,j,b,h=1;
        boolean t;

        while( h < (l/3) ){
            h = h*3 + 1;
            System.out.println("H "+h);
        }

        if(h==1){
            System.out.println("one");

            for(i = 1; i < l ; i++){
                t = false;
                b = data[i];

                for(j = i; j > 0; j--){

                    if(b >= data[j-1]){
                        data[j] = b;
                        t = true;
                        break;
                    }
                    else{
                        data[j] = data[j-1];
                    }
                }

                if( !t ){

                    data[0] = b;
                }
            }
            return data;
        }
        int[][] a = new int[h][l/h+1];
        int[] ls = new int[h];

        for(i = 0; i < h; i++){
            ls[i] = 0;
        }
        for(i = 0; i < data.length; i++){
            a[i%h][ls[i%h]] = data[i];
            ls[i%h]++;
        }
        for(i =0; i < h; i++){
            a[i] = shellSort(a[i],ls[i]);
        }
        for(i = 0; i < h; i++){
            ls[i]=0;
        }
        for(i = 0; i < data.length; i++){
            data[i] = a[i%h][ls[i%h]];
            ls[i%h]++;
        }
        for(i = 1; i < l; i++){
            t = false;
            b = data[i];

            for(j = i; j > 0; j--){
                if(b >= data[j-1]){
                    data[j] = b;
                    t = true;
                    break;
                }
                else{
                    data[j] = data[j-1];
                }
            }
            if(!t){
                data[0] = b;
            }
        }
        return data;
    }
}