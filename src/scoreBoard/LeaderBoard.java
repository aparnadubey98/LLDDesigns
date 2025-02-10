package scoreBoard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LeaderBoard {
    TreeMap<Integer, Integer> scoreBoard;
    Map<Integer, Integer> leaderBoard;

    LeaderBoard() {
        scoreBoard = new TreeMap<>(Collections.reverseOrder());
        leaderBoard = new HashMap<>();
    }

    public void addScore(int playerId, int score) {
        int newScore = leaderBoard.getOrDefault(playerId, 0) + score;
        leaderBoard.put(playerId, newScore);

        scoreBoard.put(newScore, scoreBoard.getOrDefault(newScore, 0) + 1);
        if(newScore != score) {
            scoreBoard.put(newScore - score, scoreBoard.getOrDefault(newScore - score, 0) + 1);
        }
    }

    public int top(int k) {
        int remaining = k;
        int sum = 0;

        for(Map.Entry<Integer, Integer> entry: scoreBoard.entrySet()) {
            int score = entry.getKey();
            int numberOfPlayers = entry.getValue();

            if(remaining >= numberOfPlayers) {
                sum += score * numberOfPlayers;
            } else
                sum += score * remaining;

            remaining -= numberOfPlayers;
            if(remaining <= 0) break;
        }

        return sum;
    }

    public void reset(int playerId) {
        int score = leaderBoard.get(playerId);
        leaderBoard.remove(playerId);

        if(scoreBoard.get(score) == 1)
            scoreBoard.remove(score);
        else
            scoreBoard.put(score, scoreBoard.get(score) - 1);
    }
}
