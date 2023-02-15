public class LeftRotateByD {
    static void lRotateByDPlaces(int[] a,int d,int n){
        reverse(a, 0, d-1); //reverse till d places
        reverse(a, d,n-1); //reverse after d places
        reverse(a, 0,n-1); //reverse whole array
    }
    static void reverse(int[] a,int low,int high){
        while(low<high){
            int temp = a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String [] ar){
        int[] a = {1,2,3,4,5};
        int places = 3,n = a.length;

        lRotateByDPlaces(a,places,n);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

}
