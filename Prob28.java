package gevaexs.PE;

public class Prob28 {
    static int size = 1;
    static int row = 1; // שורה
    static int col = 1; // עמודה
    static int[][] arr;
    public static void main(String[] args) {
        arr = new int[3][3];
        for(int i = 0; i <arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
        arr[row][col] = 1;
        moveRight();
        
          for(int i = 0; i <arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
              System.out.println("");
        }
        
    }
    
    public static void moveRight() {
        if((col+1) >= arr.length || row >=arr.length) {
            return;
        }
        while((col+1) < arr.length && arr[row+1][col+1] != 0) {
            col++;
            arr[row][col] = size + 1;
            size+=1;
        }
        col+=1;
            arr[row][col] = size + 1;
            size+=1;
        moveDown();
    }
    
    public static void moveDown() {
        if(col >= arr.length || row >=arr.length) {
            return;
        }

         while((row+1) < arr.length && arr[row+1][col-1] != 0) {
            row++;
            arr[row][col] = size + 1;
            size+=1;
        }
          row+=1;
            arr[row][col] = size + 1;
            size+=1;
        moveLeft();
    }
    
    public static void moveLeft() {
        if(col >= arr.length || row >=arr.length) {
            return;
        }
        System.out.println("row: " + row);
        while((col-1) >= 0 && (row+1) < arr.length && arr[row+1][col-1] != 0) {
            col--;
            arr[row][col] = size + 1;
            size+=1;
        }
         col-=1;
            arr[row][col] = size + 1;
            size+=1;
        moveUp();
    }
    public static void moveUp() {
        if(col >= arr.length || row >=arr.length) {
            return;
        }       
        while((row-1) >= 0 && arr[row-1][col+1] != 0) {
            row--;
            arr[row][col] = size + 1;
            size+=1;
        }
        row-=1;
            arr[row][col] = size + 1;
            size+=1;
        moveRight();
    }

}
