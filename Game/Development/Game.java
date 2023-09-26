package Game.Development;

import Game.Constants.GameStatus;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> playersList;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private Player winner;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinningStrategy winningStrategy;
}
