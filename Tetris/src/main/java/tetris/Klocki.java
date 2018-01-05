package tetris;

import java.awt.*;

public class Klocki {
    final static short SIZE = 25;
    final static Color[] KOLOR = {Color.BLACK, Color.YELLOW, Color.BLUE, Color.GREEN, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.RED, Color.ORANGE, Color.WHITE};
    final static boolean[][][] KLOCKI =
            {
                    {
                            {false, false, false, false},
                            {true, true, true, false},
                            {false, false, true, false},
                            {false, false, false, false}
                    },
                    {
                            {false, false, false, false},
                            {true, true, true, false},
                            {false, true, false, false},
                            {false, false, false, false}
                    },
                    {
                            {false, false, false, false},
                            {false, true, true, false},
                            {false, true, true, false},
                            {false, false, false, false}
                    },
                    {
                            {false, false, false, false},
                            {false, false, false, false},
                            {true, true, true, true},
                            {false, false, false, false}
                    },
                    {
                            {false, false, false, false},
                            {false, false, true, true},
                            {false, true, true, false},
                            {false, false, false, false}
                    },
                    {
                            {false, true, true, false},
                            {false, false, true, false},
                            {false, false, true, false},
                            {false, false, false, false}
                    },
                    {
                            {false, false, false, false},
                            {true, true, false, false},
                            {false, true, true, false},
                            {false, false, false, false}

                    }

            };
}
