public class LargestNumber {
    static int largestNumber(int[] arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] a ={10,20,1,90,15,90};
        int res = largestNumber(a);
        System.out.println("Index of largest number is "+res+" and the number is "+a[res]);
    }
}
