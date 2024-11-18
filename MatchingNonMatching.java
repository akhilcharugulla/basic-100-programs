public class MatchingNonMatching {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defghia";
        String[] arr = s1.split("");
        String[] arr1 = s2.split("");
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(arr[i].equals(arr1[j])){
                    count++;
                    System.out.print(arr[i] + ",");
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}