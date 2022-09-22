package Sept14.MethodsAndInput;

public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr1 = {1,2,3,4,5};
        ReverseArray(arr1);
    }

    private static void ReverseArray(int[] arr1) {
        // TODO Auto-generated method stub
        int revArr[] = new int[5];
        int j = 5;
        for (int i=0; i<arr1.length; i++){
            revArr[j-1] = arr1[i];
            j = j-1;
        }
        for (int i=0; i<revArr.length; i++) {
            System.out.println(revArr[i]);
        }
    }

}