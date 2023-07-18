import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        int c=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int temp;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i<j){
                    temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size/2; j++){
                temp = matrix[i][j];
                matrix[i][j]=matrix[i][size-1-j];
                matrix[i][size-1-j]=temp;
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }


    }
}