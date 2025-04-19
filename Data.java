public class Data
{
    public static final int MAX = (int)(Math.random() *Integer.MAX_VALUE);
    private int[][] grid;


    public Data(int [][] arr){  
        grid = arr;
    }
    public void repopulate()
    { 
        int num = -1;
        for(int i =0; i < grid.length; i++){
            for(int n = 0; n < grid[0].length; n++){
                while(num % 10 != 0 || num % 100 == 0){
                    num = (int)(Math.random() *Integer.MAX_VALUE) + 1; 
                }
                grid[i][n] = num;
                num = -1;
            }
        }
    }

    public int countIncreasingCols()
    { 
        int count = 0;
        boolean greater = true;
        for(int n = 0; n < grid[0].length; n++){
            for(int i = 0; i < grid.length-1; i++){
                if(grid[i][n] <= grid[i+1][n]||grid.length == 1){
                    continue; 
                }
                else greater = false; 
            }
            if(greater) count++;
            greater = true;
        }
        return count; 
    }
    public String toString(){
        String str = "";
        for(int i =0; i < grid.length; i++){
            str += "\n";
            for(int n = 0; n < grid[0].length; n++){
                str += grid[i][n] + " ";
            }
        }
        return str; 
    }
}   