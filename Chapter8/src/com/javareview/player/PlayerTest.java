package com.javareview.player;

public class PlayerTest {

    public static void run() {
        Player player1 = new Player();
        player1.play(1);

        IntermediateLevel intermediateLevel = new IntermediateLevel();
        player1.levelUp(intermediateLevel);
        player1.play(2);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player1.levelUp(advancedLevel);
        player1.play(3);

    }
}

/*
 * player
 * - playerLevel
 *
 * playerLevel
 * - run
 * - jump
 * - turn
 * - showLevel
 * - go : 할 수 없는 것은 할 수 없다고 메시지를 띄움
 *   - run
 *   - jump
 *   - turn
 *
 * beginner
 * - run
 *
 * intermediate
 * - run
 * - jump
 *
 * advanced
 * - run
 * - jump
 * - turn
 *
 * */
