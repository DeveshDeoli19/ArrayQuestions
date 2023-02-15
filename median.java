import java.util.*;
public class median {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length,n=nums2.length,newSize = m+n,temp=0;
            int [] arr = new int[newSize];

            for(int i=0;i<m;i++){
                arr[i] = nums1[i];
                temp++;
            }

            for(int j=0;j<n;j++) {
                arr[temp] = nums2[j];
                temp++;
            }
            Arrays.sort(arr);

            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);

            if(newSize%2==0){
                int r = newSize/2;
                double med = arr[r-1]+arr[r];
                return med/2;}
            else
            {

                return arr[arr.length/2];
            }
        }

    public static void main(String[] args) {
            int[] a = {1,2};
            int[] b = {3,4};
        double res = findMedianSortedArrays(a,b);
        System.out.println(res);
    }
    }

