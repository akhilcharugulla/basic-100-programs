public class SortingWithoutFunction {
    public static void main(String[] args) {
        int [] st = {7,2,5,8,4,1,3,9,6};
        int temp =0;
        for(int i=0; i< st.length; i++){
            for(int j =i+1 ; j<st.length;j++){
                if(st[i]<st[j]){
                    temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        for (int k : st) {
            System.out.print(k + " ");
        }
    }
}
