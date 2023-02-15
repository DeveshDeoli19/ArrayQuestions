public class SecondLargestNumber {
    static int secondLargest(int arr[]){
        int largest=0,res = -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res ==-1|| arr[i]>arr[res] ){
                    res=i;
                }
            }
        }
        return res;
    }

    public static void main(String[] arg){
        int a[] = {20,10,20,8,12};
        int result = secondLargest(a);
        System.out.println(result);
    }
}
