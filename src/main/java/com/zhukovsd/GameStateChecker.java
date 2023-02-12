package com.zhukovsd;

import com.zhukovsd.board.Board;

public abstract class GameStateChecker {
    public abstract GameState check(Board board, Color color);
}
