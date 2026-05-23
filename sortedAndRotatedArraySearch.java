public class sortedAndRotatedArraySearch {

    public static int search(int arr[], int si, int ei, int targ)
        {
            if(si>ei)
            {
                return-1;
            }

            int mid=si+(ei-si)/2;

            if(targ==arr[mid])
            {
                return mid;
            }

            //mid on frist line
            if(arr[si]<arr[mid])
            {
                if(arr[si]<=targ&&arr[mid]>=targ)
                {
                    return search(arr, si, mid-1, targ);
                }else{
                    return search(arr, mid+1, ei,  targ);
                }}

            if(arr[mid]<arr[ei])
            {
                if(arr[mid]<=targ&&arr[ei]>=targ)
                {
                    return search(arr, mid+1, ei,  targ);
                }else{
                    return search(arr, si, mid-1, targ);
                }
            }
            return-1;
            }
        

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int targindx=search(arr, 0, arr.length-1, target);
        System.out.println(targindx);

        
    }
}