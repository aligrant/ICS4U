/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandra
 */
public class testtt3 {
public static void chessPieces(){

String[][] pieces = new String[][]{

{"bR1", "bK1", "bB1", "b_Q", "b_K", "bB2", "bK2", "bR2"},
{"bP1", "bP2", "bP3", "bP4", "bP5", "bP6", "bP7", "bP8"},
{"___", "___", "___", "___", "___", "___", "___", "___"},
{"___", "___", "___", "___", "___", "___", "___", "___"},
{"___", "___", "___", "___", "___", "___", "___", "___"},
{"___", "___", "___", "___", "___", "___", "___", "___"},
{"wP1", "wP2", "wP3", "wP4", "wP5", "wP6", "wP7", "wP8"},
{"wR1", "wK1", "wB1", "w_Q", "w_K", "wB2", "wK2", "wR2"},

};

}

public static void movePiece(String[][] pieces, String str, int row, int column){
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            if(pieces[i][j].equals(str)){
            pieces[i][j]="___";
            pieces[row][column]=str;
            }
        }
    }
    
//printBoard(pieces);
}
    public static int countSix(int[][] arr) {
        int c = 0;
        //goes through every element and if it is six it upps the count(c) int
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 6) {
                    c++;

                }

            }

        }

        return c;
    }

    public static boolean trueTwoD(int[][] arr) {
        boolean valid = true;
        int test = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr[0].length) {
                test++;
            }
            if (arr[i][i] == 0) {
                test++;
            }
            if (i != 0) {
                if (arr[i - 1][i] == 0) {
                    test++;
                }
            }
            if (arr[i].length != arr.length) {
                test++;
            }
        }
        if (test != 0) {
            valid = false;
        }
        return valid;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{
            {3, 4, 7, 2, 6},
            {0, 4, 3, 6, 9},
            {0, 0, 9, 6, 3},
            {0, 0, 0, 8, 1},
            {0, 0, 0, 0, 2},};
        int[][] b = new int[][]{
            {3, 4, 7},
            {0, 4, 3},
            {0, 0, 9},};
        int[][] c = new int[][]{
            {3, 0, 7, 2},
            {9, 6, 6, 7},
            {1, 2, 5, 6},};

        System.out.println(trueTwoD(a));
        System.out.println(trueTwoD(b));
        System.out.println(trueTwoD(c));
        System.out.println(countSix(a));
                System.out.println(countSix(b));
                        System.out.println(countSix(c));
    }
}
