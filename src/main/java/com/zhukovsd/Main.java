package com.zhukovsd;

import com.zhukovsd.board.Board;
import com.zhukovsd.board.BoardFactory;

public class Main {
    public static void main(String[] args) {
        Board board = (new BoardFactory()).fromFEN(
                // "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
                // "3k4/8/5n2/2N5/3B4/8/8/3K4 w - - 0 1"
                // "3k4/8/p7/8/R7/8/P7/3K4 w - - 0 1"
                // "3k4/8/p5n1/5B2/R7/3P4/P7/3K4 w - - 0 1"

                "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
        );

        Game game = new Game(board);
        game.gameLoop();
    }
}