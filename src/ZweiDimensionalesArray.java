public class ZweiDimensionalesArray {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;
        int[] oneDim = new int [5];  // eine Dimension
        int[][] twoDim = new int[x][y]; //ein zweidimensionales Array


        twoDim[0] [0] = 1;
        twoDim[0] [1] = 7;
        // twoDim [3] [3] = 9; geht nicht weil y = 3 eigentlich 2! - nur bis 2 möglich weil y = 3 definiert (0,1,2)
        twoDim [3] [2] = 9;

//        for (int dimX = 0; dimX < twoDim.length; dimX++) {
//            System.out.print(twoDim[dimX] [0] + " | ");
//        }
//
//        System.out.println();
//        for (int dimX = 0; dimX < twoDim.length; dimX++) {
//            System.out.print(twoDim[dimX] [1] + " | ");
//        }
//
//        System.out.println();
//        for (int dimX = 0; dimX < twoDim.length; dimX++) {
//            System.out.print(twoDim[dimX] [2] + " | ");
//        }

        //so leider in verkehrter Reihenfolge
        for (int dimX = 0; dimX < twoDim.length; dimX++) {
            for (int dimY = 0; dimY < twoDim[dimX].length; dimY++ )
            System.out.print(twoDim[dimX] [dimY] + " | ");
            System.out.println();
        }

        System.out.println();
        for (int dimY = 0; dimY < twoDim[0].length; dimY++) {
            for (int dimX = 0; dimX < twoDim.length; dimX++ )
                System.out.print(twoDim[dimX] [dimY] + " | ");
            System.out.println();
        }

        int[][] screen = new int[3840][2160];
    }
}
