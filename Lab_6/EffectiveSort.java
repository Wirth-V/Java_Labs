import java.util.Arrays;
class EffectiveSort <Data extends Comparable<Data>> {
	public EffectiveSort(){}
	
	public int[] quickSort(int[] myVector) {
		int low=0;
		int high=myVector.length-1;

         int middle=low + (high-low)/2;
         int opora=myVector[middle];

         int i=low,j=high;
         while (i<=j) {
             while (myVector[i]<opora) {
                 i++;
             }

             while (myVector[j]>opora) {
                 j--;
             }

             if (i<=j) {
                 int temp=myVector[i];
                 myVector[i]=myVector[j];
                 myVector[j]=temp;
                 i++;
                 j--;
             }
         }
             if (low<j)
                 quickSort2(myVector,low,j);

             if (high>i)
                 quickSort2(myVector,i,high);
             

	 
         return myVector;
}
	public int[] quickSort2(int[] myVector,int low,int high) {
		if (low>=high)
            return myVector;


         int middle=low+(high-low)/2;
         int opora=myVector[middle];

         int i=low,j=high;
         while (i<=j) {
             while (myVector[i]<opora) {
                 i++;
             }

             while (myVector[j]>opora) {
                 j--;
             }

             if (i<=j) {
                 int temp=myVector[i];
                 myVector[i]=myVector[j];
                 myVector[j]=temp;
                 i++;
                 j--;
             }
         }
             if (low<j)
            	 quickSort2(myVector,low,j);

             if (high>i)
            	 quickSort2(myVector,i,high);
             return myVector;
}
	public Data[] quickSort(Data[] myVector) {
		int low=0;
		int high=myVector.length-1;


         int middle=low+(high-low)/2;
         Data opora=myVector[middle];

         int i=low,j=high;
         while (i<=j) {
             while (0>(myVector[i].compareTo(opora))) {
                 i++;
             }

             while (0<(myVector[j].compareTo(opora))) {
                 j--;
             }

             if (i<=j) {
                 Data temp=myVector[i];
                 myVector[i]=myVector[j];
                 myVector[j]=temp;
                 i++;
                 j--;
             }
         }
             if (low<j)
                 quickSort2(myVector,low,j);

             if (high>i)
                 quickSort2(myVector,i,high);
             

	 
         return myVector;
}
	public Data[] quickSort2(Data[] myVector,int low,int high) {


         int middle=low+(high-low)/2;
         Data opora=myVector[middle];

         int i=low,j=high;
         while (i<=j) {
             while (0>(myVector[i].compareTo(opora))) {
                 i++;
             }

             while (0<(myVector[j].compareTo(opora))) {
                 j--;
             }

             if (i<=j) {
                 Data temp=myVector[i];
                 myVector[i]=myVector[j];
                 myVector[j]=temp;
                 i++;
                 j--;
             }
         }
             if (low<j)
            	 quickSort2(myVector,low,j);

             if (high>i)
            	 quickSort2(myVector,i,high);
             return myVector;
}
	public int[] heapSort(int[] myVector) 
		 {
		        int n=myVector.length;


		        for (int i=n/2-1; i>=0; i--)
		            heapSort2(myVector,n,i);
  
		        for (int i=n-1; i>=0; i--)
		        {
		            int temp=myVector[0];
		            myVector[0]=myVector[i];
		            myVector[i]=temp;

		            heapSort2(myVector,i,0);
		        }
		        return myVector;
		    }

		     public int[] heapSort2(int[] myVector,int n,int i)
		    {
		        int largest=i; 
		        int l=2*i+1; 
		        int r=2*i+2; 

		        if (l<n && myVector[l]>myVector[largest])
		            largest=l;

		        if (r<n && myVector[r]>myVector[largest])
		            largest=r;
		        if (largest != i)
		        {
		            int swap=myVector[i];
		            myVector[i]=myVector[largest];
		            myVector[largest]=swap;

		            heapSort2(myVector,n,largest);
		        }
		        return myVector;
		    }
		     public Data[] heapSort(Data[] myVector) 
			 {
			        int n=myVector.length;


			        for (int i=n/2-1; i>=0; i--)
			            heapSort2(myVector,n,i);
	  
			        for (int i=n-1; i>=0; i--)
			        {
			            Data temp=myVector[0];
			            myVector[0]=myVector[i];
			            myVector[i]=temp;

			            heapSort2(myVector,i,0);
			        }
			        return myVector;
			    }

			     public Data[] heapSort2(Data[] myVector,int n,int i)
			    {
			        int largest=i; 
			        int left=i+1; 
			        int right=i+2; 

			        if (left<n && myVector[left].compareTo(myVector[largest])>0)
			            largest=left;

			        if (right<n && myVector[right].compareTo(myVector[largest])>0)
			            largest=right;
			        if (largest != i)
			        {
			            Data swap=myVector[i];
			            myVector[i]=myVector[largest];
			            myVector[largest]=swap;

			            heapSort2(myVector,n,largest);
			        }
			        return myVector;
			    }
			     public Data[] heapSort(Data[] myVector,int first,int last) 
				 {
				        int n=last;


				        for (int i=n/2 ; i>=first; i--)
				            heapSort2(myVector,n,i);
		  
				        for (int i=n; i>=first; i--)
				        {
				            Data temp=myVector[first];
				            myVector[first]=myVector[i];
				            myVector[i]=temp;
				            heapSort2(myVector,i,first);
				        }
				        return myVector;
				 }
				    

			     public int[] mergeSortRecursion(int[] myVector,int first,int last) {
			         if (last<=first)
			             return null;

			         int middle=first+(last-first)/2;

			         mergeSortRecursion(myVector,first,middle);
			         mergeSortRecursion(myVector,middle+1,last);

			         int[] temp=Arrays.copyOf(myVector,myVector.length);

			         for (int k=first; k<=last; k++)
			             temp[k]=myVector[k];

			         int i=first,j=middle+1;
			         for (int k=first; k<=last; k++) {

			             if (i>middle) {
			                 myVector[k]=temp[j];
			                 j++;
			             } else if (j>last) {
			                 myVector[k]=temp[i];
			                 i++;
			             } else if (temp[j]<temp[i]) {
			                 myVector[k]=temp[j];
			                 j++;
			             } else {
			                 myVector[k]=temp[i];
			                 i++;
			             }
			         }
			         return myVector;
			     }

			     public int[] mergeSort(int[] myVector) {
			         return mergeSortRecursion(myVector,0,myVector.length-1);
			     }

			     public Data[] mergeSortRecursion(Data[] myVector,int first,int last) {
			         if (last<=first)
			             return null;
			         int middle=first+(last-first)/2;
			         mergeSortRecursion(myVector,first,middle);
			         mergeSortRecursion(myVector,middle+1,last);

			         Data[] temp=Arrays.copyOf(myVector,myVector.length);

			         for (int k=first; k<=last; k++)
			             temp[k]=myVector[k];

			         int i=first,j=middle+1;
			         for (int k=first; k<=last; k++) {

			             if (i>middle) {
			                 myVector[k]=temp[j];
			                 j++;
			             } else if (j>last) {
			                 myVector[k]=temp[i];
			                 i++;
			             } else if (temp[j].compareTo(temp[i])<0) {
			                 myVector[k]=temp[j];
			                 j++;
			             } else {
			                 myVector[k]=temp[i];
			                 i++;
			             }
			         }
			         return myVector;
			     }

			     public Data[] mergeSort(Data[] myVector) {
			         return mergeSortRecursion(myVector,0,myVector.length-1);
			     }

			     public Data[] mergeSort(Data[] myVector,int first,int last) {
			         return mergeSortRecursion(myVector,first,last-1);
			     }
}
			   

