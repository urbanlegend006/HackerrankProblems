public class AtmostKOddElement {

    public static int f(int[] arr, int n, int m){
        int pick, notPick;
        if(n==0 && m==0 && arr[0]%2==0){
            return 1;
        }

        if(n==0 && m==0 && arr[0]%2==1){
            return 0;
        }

        if(n==0 && m>=1 && arr[0]%2==1){
            return 1;
        }

        if(n==0 && m>=1 && arr[0]%2==0){
            return 0;
        }

        if(n==0 && m<0){
            return 0;
        }

        if(m==0 && arr[n]%2==0){
            return  1;
        }else if(m==0 && arr[n]%2==1){
            return 0;
        }

        pick = 1 + (arr[n]%2==1 ? f(arr, n-1, m-1) : f(arr, n-1, m));
        notPick = 0 + f(arr, n-1, m);

        return pick + notPick;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,1};
        int k = 1;
        System.out.println(f(arr, arr.length-1, k));
    }
}
