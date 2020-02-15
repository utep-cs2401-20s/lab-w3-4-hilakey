import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TORUS_GOL {

        @Test

        public void testTORNeighbors1(){
            int[][] testBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            TorusGameOfLife game3 = new TorusGameOfLife(testBoard);
            assertEquals(-1,game3.neighbors(-1,-3));
        }
        @Test
        /*Torus*/

        public void testTORNeighbors2(){
            int[][] testBoard = {{0,0,0,0,0,0},{0,0,0,0,0,0}, {0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
            TorusGameOfLife game4 = new TorusGameOfLife(testBoard);
            assertEquals(-1, game4.neighbors(10000000,1000000));
        }
        @Test
        /*Torus*/

        public void testTORNeighbors3(){
            int[][] testBoard = {{1}, {1}};
            TorusGameOfLife game5 = new TorusGameOfLife(testBoard);
            assertEquals(1, game5.neighbors(0,0));
        }
        @Test
        /*Torus*/

        public void testTORNeighbors4(){
            int[][] testBoard =     {{0,0,0,0,0,0},
                                     {0,1,1,0,0,0},
                                     {0,1,1,0,0,0},
                                     {0,0,0,1,1,0},
                                     {0,0,0,1,1,0},
                                     {0,0,0,0,0,0}};
            TorusGameOfLife game6 = new TorusGameOfLife(testBoard);
            assertEquals(-1, game6.neighbors(Integer.MAX_VALUE , Integer.MIN_VALUE));
        }
        @Test
        /*Torus*/

         public void testTORNeighbors5(){
            int[][]testBoard =      {{0,0,0,0,0,0,0,0,0,0,0},
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
            TorusGameOfLife game7 = new TorusGameOfLife(testBoard);
            assertEquals(6,game7.neighbors(5,4));
         }
         @Test
        public void testGOLOneStep1(){
             int[][] testPrintBoard =  {{0,0,0,0,0,0},
                                        {0,1,1,0,0,0},
                                        {0,1,1,0,0,0},
                                        {0,0,0,1,1,0},
                                        {0,0,0,1,1,0},
                                        {0,0,0,0,0,0}};
             TorusGameOfLife game2 = new TorusGameOfLife(testPrintBoard);
             game2.oneStep();
             game2.printBoard(game2.getBoard());

         }

        @Test
        public void testGOLOneStep2(){
            int[][] testBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            TorusGameOfLife game3 = new TorusGameOfLife(testBoard);
            game3.oneStep();
            game3.printBoard(game3.getBoard());
        }

        @Test
        public void testGOLOneStep3(){
            int[][] testBoard = {{0,0,0,0,0,0},{0,0,0,0,0,0}, {0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
            TorusGameOfLife game4 = new TorusGameOfLife(testBoard);
            game4.oneStep();
            game4.printBoard(game4.getBoard());

        }

        @Test
        public void testGOLOneStep4(){
            int[][]testBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            TorusGameOfLife game5 = new TorusGameOfLife(testBoard);
            game5.oneStep();
            game5.printBoard(game5.getBoard());

        }

        @Test
        public void testGOLOneStep5(){
            int[][] testBoard = {{1,0,1,1},{1,1,0,0},{1,1,1,0,},{1,1,1,1}};
            TorusGameOfLife game6 = new TorusGameOfLife(testBoard);
            game6.oneStep();
            game6.printBoard(game6.getBoard());

        }

        @Test
        /*Torus*/

        public void testGOLEvolution1(){
            /*initial board*/
            int[][] testBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            TorusGameOfLife game2 = new TorusGameOfLife(testBoard);
            System.out.println("Board");
            /*expected board*/
            int[][] b = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};

            assertArrayEquals(b, game2.getBoard(), "unreachable");

        }


        @Test
        /*Torus*/

        public void testGOLEvolution2(){
            /*initial board*/
            int[][] testBoard = {{1,1,1}, {1,1,1},{1,1,1}};
            TorusGameOfLife game3 = new TorusGameOfLife(testBoard);
            /*expected board*/
            assertEquals(8,game3.neighbors(0,0) );
            game3.printBoard(testBoard);
            int[][] b = {{0,0,0},{0,0,0},{0,0,0}};
            game3.evolution(1);
            assertArrayEquals(b, testBoard);


        }

        @Test

        public void testGOLEvolution3(){
            /*initial board*/
            int[][] testBoard=  {{0,0,0,0,0,0,0,0,0,0,0},
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
            TorusGameOfLife game4 = new TorusGameOfLife(testBoard);
            System.out.println("Board");
            /*expected board*/
            int[][] b = {{0,0,0,0,0,0,0,0,0,0,0},
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
            game4.evolution(0);
            assertArrayEquals(b, testBoard);
        }

        @Test
        public void testGOLEvolution4(){
            int[][] testBoard = {{0,0,0,0,0,0},
                                {0,1,1,0,0,0},
                                {0,1,1,0,0,0},
                                {0,0,0,1,1,0},
                                {0,0,0,1,1,0},
                                {0,0,0,0,0,0}};
            TorusGameOfLife game5 = new TorusGameOfLife(testBoard);
            System.out.println("Board");
            game5.evolution(5);
            int[][] b = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,0,0,0,0},{0,0,0,1,1,0},{0,0,0,0,1,0},{0,0,0,0,0,0,}};
            assertArrayEquals(b, testBoard);
        }

        @Test
        public void testGOLEvolution5(){
            int[][] testBoard = {{1,0,1,1},{1,1,0,0},{1,1,1,0,},{1,1,1,1}};
            TorusGameOfLife game6 = new TorusGameOfLife(testBoard);
            System.out.println("Board");
            game6.printBoard(testBoard);
            game6.evolution(1);
            int[][] b = {{1,0,1,0}, {0,0,0,1}, {0,0,0,0,1},{1,0,0,1}};
            assertArrayEquals(b,testBoard);
        }

}
