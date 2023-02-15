public class RemoveDups {
    static int removeDups(int[] a){

        int size=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[size-1]){
                a[size]=a[i];
                size++;
            }
        }

        return size;
    }
    public static void main(String[] arg){
        int[] arr={10,20,20,30,30,30,40};
        int s = removeDups(arr);
        for(int i=0;i<s;i++)
            System.out.print(arr[i]+" ");
    }
}
