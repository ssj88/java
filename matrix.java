import java.util.Scanner;
class matrix{
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter row and column");
        
        int r,c;
        r=sn.nextInt();
        c=sn.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("Enter the elements of matrix 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.println("Element:["+i+"]["+j+"]:");
            m1[i][j]=sn.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.println("Element:["+i+"]["+j+"]:");
            m2[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("matrix 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(" "+m1[i][j]);
            }
            System.out.println();
        }
        System.out.println("matrix 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(" "+m2[i][j]);
            }
            System.out.println();
        }
       System.out.println("Summed matrix is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }
        sn.close(); 
    }               
} 