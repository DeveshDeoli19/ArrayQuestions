public class MoveZeroesToEnd {
    static void ZeroesToEnd(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp = a[count];
                a[count]=a[i];
                a[i]=temp;
                count++;
            }
        }
    }
    public static void main(String[] ar){
        int[] arr={0,0,8,5,0,10,0,20};
        ZeroesToEnd(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
