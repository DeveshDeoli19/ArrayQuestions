public class CheckSorted {
    static boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1])
                return false;
        }
        return true;
    }
    public static void main(String[] ar){
        int arr[]={10,20,30,4,90};
        System.out.println(isSorted(arr));
    }
}
