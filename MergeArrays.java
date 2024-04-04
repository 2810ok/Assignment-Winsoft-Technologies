import java.util.Arrays;

public class MergeArrays {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
       
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
      
        int i = k + 1; 
        int j = 0;     
        int idx = 0;   
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx++] = X[i++];
            } else {
                X[idx++] = Y[j++];
            }
        }
   
        while (j < n) {
            X[idx++] = Y[j++];
        }
        
      
        System.out.print("Output: X[] = { ");
        for (int p = 0; p < X.length; p++) {
            System.out.print(X[p]);
            if (p != X.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
    }
}
