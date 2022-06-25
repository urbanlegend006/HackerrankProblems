import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class CountingSorts {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] store = new Integer[100];
        List<Integer> ans = new ArrayList<>(Arrays.asList(store));
        ans.replaceAll(r->r=0);
        System.out.println(ans.get(0));
        for(Integer i : arr){
            ans.set(i, ans.get(i).intValue() + 1); ;
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<1000; i++){
            arr.add(new Random().nextInt(100));
        }

        List<Integer> result = countingSort(arr);

        for(Integer i : result){
            System.out.print(result.get(i) + "\t");
        }
    }

}
