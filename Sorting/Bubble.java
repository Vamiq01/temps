public class Bubble {
    public static void main(String[] args) {
        // int arr[] = { 2, 21, 4, 324, 1, 24, 5, 6, 8, 9 };
        // for (int i = 0; i < arr.length - 1; i++) {
        //     boolean falg = true;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] > arr[j]) {
        //             int tmp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = tmp;
        //             falg=false;
        //         }
        //     }
        //    if(falg){
        //     break;
        //    }
        // }
        // for (int i = 0; i < arr.length; i++)
        //     System.out.println(arr[i]);
        int arr[]={1,1,2,2,3,4,4,5,5};
        int st=0;int end=arr.length-1;
        int ans=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid+1]==arr[mid+2]){
               ans=arr[mid];
            }
            else if(st){
                
            }
        }

    }
}