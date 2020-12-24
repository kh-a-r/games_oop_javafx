package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 1 && row == cell) {
                    if (Win.mono(board, cell)) {
                   // if (Win.monoVert(board, cell) || monoHorz(board, cell)) {
                        rsl = true;
                    }
                }
            }
        }
        return rsl;
    }

   /* public static boolean monoVert(int[][] board, int cell) {
        boolean rslMonoVert = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                rslMonoVert = false;
            }
        }
        return rslMonoVert;
    }

    public static boolean monoHorz(int[][] board, int cell) {
        boolean rslMonoHorz = true;
        for (int i = 0; i < board.length; i++) {
            if (board[cell][i] != 1) {
                rslMonoHorz = false;
            }
        }
        return rslMonoHorz;
    }*/

    public static boolean mono(int[][] board, int cell) {
        boolean rslMono = true;
        for (int i = 0; i < board.length; i++) {
            if (board[cell][i] != 1 && board[i][cell] != 1) {
                rslMono = false;
            }
        }
        return rslMono;
    }


    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
        };
        System.out.println(check(board));
    }
}