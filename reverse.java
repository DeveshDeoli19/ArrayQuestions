public class reverse {
    static void reverseArray(int a[]){
        int low=0,high= a.length-1;
        while(low<high){
            int temp = a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] ar){
        int arr[]={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        reverseArray(arr);

        System.out.print("\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

