package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_BOARD_WIDTH = 0;
    public static int MIN_BOARD_HEIGHT = 0;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(!isLegalBoardPosition(xCoordinate, yCoordinate) || pieces[xCoordinate][yCoordinate] != null) {
        	pawn.setXCoordinate(-1);
        	pawn.setYCoordinate(-1);
        } else {
        	pawn.setXCoordinate(xCoordinate);
        	pawn.setYCoordinate(yCoordinate);
        	pieces[xCoordinate][yCoordinate] = pawn;
        }
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
    	return xCoordinate < MAX_BOARD_WIDTH && xCoordinate >= MIN_BOARD_WIDTH  && yCoordinate < MAX_BOARD_HEIGHT &&  yCoordinate >= MIN_BOARD_HEIGHT; 
    }
}
