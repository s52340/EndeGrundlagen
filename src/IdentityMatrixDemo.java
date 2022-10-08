public class IdentityMatrixDemo {
    public static void main(String[] args) {

        int[][] matrix = generateMatrix(5);
        for (int x = 0; x < matrix.length; x++){     //matrix.length liefert erste Dimension (= Breite)
            for (int y = 0; y < matrix[x].length; y++) {    //matrix[0].length liefert 2. Dimension (=Tiefe) - [0]auch oke bei Quadrat - besser [x]
                System.out.print(matrix[x][y] + " | ");
            }
            System.out.println();
        }

    }

    //soll 2DimensionArray retour geben
    public static int [][] generateMatrix(int size){
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }

        return matrix;
    }
}
