public class array3 {
    public static void main(String[] args) {
        int a[][]=new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==j){
                    a[i][j]=1;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==(j-1)){
                    a[i][j]=2;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==(j-2)){
                    a[i][j]=3;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==(j-3)){
                    a[i][j]=4;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==j){
                    a[i][j]=1;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

}
