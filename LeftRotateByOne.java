public class LeftRotateByOne {
    static void lRotateOne(int [] a){
        int temp = a[0],n = a.length;

        for(int i=1;i<n;i++){
            a[i-1] = a[i];
        }
        a[n-1] = temp;
    }
    public static void main(String[] ar){
        int [] a = {2,3,4,5,6,7,8,9};
        // 3 4 5 6 7 8 9 2: Output
        lRotateOne(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
