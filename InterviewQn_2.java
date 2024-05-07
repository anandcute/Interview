import java.util.Arrays;
class ArrayReverse{
    public static void arrRev(int arr[]){    //23,4,10,5,66,2,0
        int temp[]=new int[7];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--){
                temp[j]=arr[i];
                j++;
        }
         System.out.println(Arrays.toString(temp));
    }
}
class ArraySort extends ArrayReverse{
    public static void arraySort(int arr[]){     //23,4,10,5,66,2,0
        int temp;
        System.out.println("Descending order:");
        for (int i = 0; i < arr.length; i++){
            for (int j =0; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Acessnding order");
        for (int i = 0; i < arr.length; i++){
            for (int j =0; j < arr.length; j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
           

    }
}



public class InterviewQn_2 extends ArraySort{
    public static void main(String[] args) {
        int arr1[] = { 23,4,10,5,66,2,0};
        arrRev(arr1);
        arraySort(arr1);
    }
}