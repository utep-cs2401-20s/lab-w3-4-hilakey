import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GOLTester <assertEquals>{

        @Test
        /*GameofLife*/
        /*This tests checks if the parameters for neighbors is negative, to return a -1.*/
        public void testNeighbors1(){
            int[][] testPrintBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            GameOfLife game3 = new GameOfLife(testPrintBoard);
            assertEquals(-1,game3.neighbors(-1,-3));
        }
        @Test
        /*GameofLife*/
        /*This test aims to see if it can return the correct number of neighbors with a significantly large indices.*/
        public void testNeighbors2(){
            int[][] testPrintBoard = {{0,0,0,0,0,0},{0,0,0,0,0,0}, {0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
            GameOfLife game4 = new GameOfLife(testPrintBoard);
            assertEquals(-1, game4.neighbors(10000000,1000000));
        }
        @Test
        /*GameofLife*/
        /*Checking if neighbors can return 1 neighbor for a 2D array length of 1(technically a 1D array).*/
        public void testNeighbors3(){
            int[][] testPrintBoard = {{1}, {1}};
            GameOfLife game5 = new GameOfLife(testPrintBoard);
            assertEquals(1, game5.neighbors(0,0));
        }
        @Test
        /*GameofLife*/
        /*Tests the largest int and smallest int as inputs for neighbors and checks if it returns a -1.*/
        public void testNeighbors4(){
            int[][] testPrintBoard = {{0,0,0,0,0,0},
                                     {0,1,1,0,0,0},
                                     {0,1,1,0,0,0},
                                     {0,0,0,1,1,0},
                                     {0,0,0,1,1,0},
                                     {0,0,0,0,0,0}};
            GameOfLife game6 = new GameOfLife(testPrintBoard);
            assertEquals(-1, game6.neighbors(Integer.MAX_VALUE , Integer.MIN_VALUE));
        }
        @Test
        /*GameofLife*/
         public void testNeighbors5(){
            int[][]testPrintBoard = {{0,0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,1,1,1,0,0,0,0},
                                    {0,0,0,1,0,1,0,1,0,0,0},
                                    {0,0,0,1,0,1,0,1,0,0,0},
                                    {0,0,0,0,1,1,1,0,0,0,0},
                                    {0,0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,1,1,1,0,0,0,0},
                                    {0,0,0,1,0,1,0,1,0,0,0},
                                    {0,0,0,1,0,1,0,1,0,0,0},
                                    {0,0,0,0,1,1,1,0,0,0,0},
                                    {0,0,0,0,0,1,0,0,0,0,0},};
            GameOfLife game7 = new GameOfLife(testPrintBoard);
            assertEquals(6,game7.neighbors(5,4));
         }

}
