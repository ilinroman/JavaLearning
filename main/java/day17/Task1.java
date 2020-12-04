package main.java.day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chp = {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
            ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK};

        for (int i = 0; i < chp.length; i++) {
            System.out.print(chp[i]);
        }
    }
}
