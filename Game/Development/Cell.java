package Game.Development;

import Game.Constants.CellState;

public class Cell {
    private int row;
    private int col;
    private CellState cellState; // filled. or empty
    private Player player; // which player has which symbol, also we can track
    // which cell was updated recent

}
