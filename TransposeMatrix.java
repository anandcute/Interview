//package Interview;

import java.util.*;
public class TransposeMatrix {
    static final int m= 3;
    static final int n=3;
    static void matrixSum(int[][]matrix,int temp[][]){
        //int matrix[][]=new int[];
        int i,j;
        
        for (i=0; i<n; i++){
            for( j=0; j< m; j++ ){
                temp[i][j]=matrix[j][i];
            }
        }
       // return temp[j][i];
    }
    public static void main (String[] args){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int temp[][]=new int[m][n],i,j;
        matrixSum(matrix,temp);
        System.out.println("Transposematrix:");
        for ( i=0; i<n;i++){
             for (j=0; j<m; j++){
                
                System.out.print(temp[i][j] + " ");
             }
             System.out.println( );
        }
        System.out.println(" ");
                        
    }
}
