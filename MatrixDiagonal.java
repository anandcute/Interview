public class MatrixDiagonal {
    int diagonalValue(int[][]matrix){
        int sum =0;
        int n = matrix.length;
        int i=0;
        int j=0;
        while(i<n){
            sum+=matrix[i][j];
            i++;
            j++;
            //System.out.println(sum);
        }
        i=0;
        j=n-1;
        while (j>=0) {
            if(i!=j)
                sum+=matrix[i][j];
            i++;
            j--;   
            
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        MatrixDiagonal m =new MatrixDiagonal();
        int x = m.diagonalValue(matrix);
        System.out.println("Sum of digonal " + x);
        
    }
    
}
