import java.io.*;
import java.util.*;
public class GameOfLife {
    /*Attributes*/
    int size;
    int[][] board;
    int[][] previous;
    int temp = 0;


    /*Constructors*/
    public GameOfLife(){}

    public GameOfLife(int s){
        this.size = s;
        this.board = new int[s][s];
        this.previous = new int[s][s];
    }

    /*Constructor that takes a 2D array as an input (its size will be the size of the
     board and previous; its content is to be copied into previous)*/
    public GameOfLife(int[][] a){
      //use a nested for loop to copy contents
        this.board = new int[a.length][a[0].length];
        this.previous = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j< a.length; j++){
                this.previous[i][j] = a[i][j];
            }
        }

    }

    /*Getters*/
    public int[][] getBoard(){
        return this.previous;
    }

    /*Methods*/
    /*It consists in transforming the current board into its next shape (board at next time stamp*/
    public void oneStep() {
        int m;

        /*iterating through each cell*/
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                m = neighbors(i,j);
                if(isDead(i,j)) {/*if the cell is dead, it must have 3 neighbors to come back to life.*/
                    if(m == 3){
                        previous[i][j] = 1;
                    }
                }
                if(!(isDead(i,j))){/* if cell is alive, it needs 2/3 neighbors to stay alive, or else it dies */
                    if(!(m==2 || m == 3)){
                        previous[i][j] = 0;
                    }
                }
            }
        }

        /*updating current board with new shape*/
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous.length; j++){
                board[i][j] = previous[i][j];
            }
        }

        /*You are allowed to comment this print statement out if you do not want to see the updated board.*/
        System.out.println();
        System.out.println("New Board:");
        printBoard(board);
    }

    /*Computes the number of neighbors the corresponding cell on the board has.*/
    public int neighbors(int row, int col){
        if(row < 0 ||col < 0 || row >= previous.length || col >= previous[0].length){
            return -1;
        }

        temp = 0;
        /*row-1, col-1*/
        if(row-1>= 0 && col-1 >= 0) {
            if (previous[row - 1][col - 1] == 1) {
                temp++;
            }
        }

        /*row-1, col*/
        if(row-1 >= 0) {
            if (previous[row - 1][col] == 1) {
                temp++;
            }
        }

        /*row-1, col+1*/
        if(row-1>= 0 && col+1 < size) {
            if (previous[row - 1][col + 1] == 1) {
                temp++;
            }
        }
        /*row, col-1*/
        if(col-1>= 0) {
            if (previous[row][col - 1] == 1) {
                temp++;
            }
        }
        /*row, col+1*/
        if(col+1<size) {
            if (previous[row][col + 1] == 1) {
                temp++;
            }
        }
        /*row+1, col-1*/
        if(row+1<size && col-1 >=0) {
            if (previous[row + 1][col - 1] == 1) {
                temp++;
            }
        }
        /*row+1, col*/
        if(row+1 < size) {
            if (previous[row + 1][col] == 1) {
                temp++;
            }
        }
        /*row+1, col+1*/
        if(row+1 < size && col+1 < size) {
            if (previous[row + 1][col + 1] == 1) {
                temp++;
            }
        }
        return temp;
    }

    /*Transforms the board into the board after n steps of evolution (i.e., n
     successive calls to oneStep).*/
    public void evolution(int n){
        if(n < 0){
            System.out.println("unreachable");
        }
        while(n > 0){
            oneStep();
            n--;
        }
        System.out.println("EVOLUTION COMPLETE: RESULT");
        printBoard(board);
    }

    public void printBoard(int[][] b){
        for (int i = 0; i < b.length; i++){
            System.out.println("[" + Arrays.toString(b[i]) + "]"); //printing a physical board to the terminal
        }
    }

    public boolean isDead(int row,int col){
        if(previous[row][col] == 0){
            return true;
        }
        return false;
    }


}
