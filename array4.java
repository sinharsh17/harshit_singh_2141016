public class array4 {
     public static void main(String[] args) {
          int n=4;
          int count=0;
          int a[][]=new int[n][n];
          for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++) {
                         if (i == j && count<n) {
                              a[i][j] = 1;
                              count++;
                         } else if (i==(j-1) && count>=n && count<(n+n-1)) {
                              a[i][j] = 2;
                              count++;
                         } else if (i==(j-2) && count>=(n+n-1) && count<(n+n+n-3)) {
                              a[i][j] = 3;
                              count++;
                         } else if (i==(j-1) && count>=4 && count<7) {
                              a[i][j] = 2;
                              count++;
                         }
                    }

               }

          }
     }
}
