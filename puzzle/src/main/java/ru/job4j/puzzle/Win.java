package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        int[] diagonal = Win.extractDiagonal(board);
        for (int i = 0; i < board.length; i++) {
            if (diagonal[i] == 1) {
                if (Win.monoHorz(board, i) || Win.monoVert(board, i)) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }

   public static boolean monoVert(int[][] board, int cell) {
        boolean rslMonoVert = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                rslMonoVert = false;
                break;
            }
        }
        return rslMonoVert;
    }

    public static boolean monoHorz(int[][] board, int cell) {
        boolean rslMonoHorz = true;
        for (int i = 0; i < board[cell].length; i++) {
            if (board[cell][i] != 1) {
                rslMonoHorz = false;
                break;
            }
        }
        return rslMonoHorz;
    }

    public static int[] extractDiagonal(int[][] board) {
        int[] result = new int[board.length];
        for (int row = 0; row < board.length; row++) {
            result[row] = board[row][row];
        }
        return result;
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