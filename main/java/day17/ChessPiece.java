package main.java.day17;

public enum ChessPiece {
    KING_WHITE  ( 100, "король (белый)" ), KING_BLACK  ( 100, "король (черный)" ),
    QUEEN_WHITE (   9, "ферзь (белый)"  ), QUEEN_BLACK (   9, "ферзь (черный)"  ),
    ROOK_WHITE  (   5, "ладья (белый)"  ), ROOK_BLACK  (   5, "ладья (черный)"  ),
    BISHOP_WHITE( 3.5, "слон (белый)"   ), BISHOP_BLACK( 3.5, "слон (черный)"   ),
    KNIGHT_WHITE(   3, "конь (белый)"   ), KNIGHT_BLACK(   3, "конь (черный)"   ),
    PAWN_WHITE  (   1, "пешка (белый)"  ), PAWN_BLACK  (   1, "пешка (черный)"  ),
    EMPTY(-1, "_");

    private double weight;
    private String displayName;

    ChessPiece(double weight, String displayName){
        this.weight = weight;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return String.format("%s %s", this.displayName, this);
    }

    @Override
    public String toString() {
        String icon = "";
        switch (this.name()) {
            case "KING_WHITE":   icon = "\u2654"; break;
            case "QUEEN_WHITE":  icon = "\u2655"; break;
            case "ROOK_WHITE":   icon = "\u2656"; break;
            case "BISHOP_WHITE": icon = "\u2657"; break;
            case "KNIGHT_WHITE": icon = "\u2658"; break;
            case "PAWN_WHITE":   icon = "\u2659"; break;
            case "KING_BLACK":   icon = "\u265A"; break;
            case "QUEEN_BLACK":  icon = "\u265B"; break;
            case "ROOK_BLACK":   icon = "\u265C"; break;
            case "BISHOP_BLACK": icon = "\u265D"; break;
            case "KNIGHT_BLACK": icon = "\u265E"; break;
            case "PAWN_BLACK":   icon = "\u265F"; break;
            default: icon = "_";
        }
        return icon;
    }
}