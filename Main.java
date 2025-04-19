public class Main {
    public static void main(String[] args) {

        int[][] g1 = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        Data grid1 = new Data(g1);
        grid1.repopulate(); 
        System.out.println(grid1);


        int[][] g2 = {
            {10,50,40},
            {20,40,20},
            {30,50,30}
        };
        Data grid2 = new Data(g2); 
        System.out.println(grid2.countIncreasingCols());


        int[][] g3 = {
            {10,540,440,440},
            {220,450,440,190}
        };
        Data grid3 = new Data(g3);
        System.out.println(grid3.countIncreasingCols());
    }
}
