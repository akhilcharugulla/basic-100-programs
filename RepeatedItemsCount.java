import java.util.HashMap;
public class RepeatedItemsCount {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        String name = "shirish";
        String arr[] = name.split("");
        for(int i=0; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i<arr.length;i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
            }
        }
    }
}