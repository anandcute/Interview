import java.util.Arrays;

public class ZeroAndOnes {
    public int[] zeroAndOnes(int arrays[]){
        int[] tem = new int[arrays.length];
        int j = 0;
        for(int i= 0 ; i < arrays.length ; i++){
            if(arrays[i] == 0){
                tem[j] = arrays[i];
                j++;
            }
        }
        for(int i= 0 ; i < arrays.length ; i++){
            if(arrays[i] == 1){
                tem[j] = arrays[i];
                j++; 
            }
        }
        return tem;
    }
    public static void main(String[] args){
        int arrays[] = {1,0,1,0,1,0};
        ZeroAndOnes z = new ZeroAndOnes();
        int[] a = z.zeroAndOnes(arrays);
        System.out.println(Arrays.toString(a));
    }
}
