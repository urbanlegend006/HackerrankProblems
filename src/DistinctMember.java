import java.util.*;
import java.util.stream.Collectors;

public class DistinctMember {

    public static int findLeastNumOfUniqueInts(int[] arr, int m) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
                if(max < map.get(i)){
                    max = map.get(i);
                }
            }else{
                map.put(i,1);
            }
        }

        if(m==0) return map.size();

        List<Integer> list = map.values().stream().sorted().collect(Collectors.toList());;
        List<Integer> delList = new ArrayList<>();
        for(Integer i : list){
            if(i <= m && m>=0){
                delList.add(i);
                m = m - i;
            }
        }

        return list.size() - delList.size();

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int m = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, m));
    }
}
