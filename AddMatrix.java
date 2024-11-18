public class AddMatrix {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr3[][] = new int [3][3];
        int sum =0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                sum = arr[i][j] + arr1[i][j];
                arr3[i][j] = sum;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr1.length; j++){
                System.out.println(arr3[i][j]);
            }
        }
    }
}
