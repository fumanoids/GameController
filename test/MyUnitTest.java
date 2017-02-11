import static org.junit.Assert.assertEquals;

import controller.GameController;
import controller.action.ActionBoard;
import controller.action.ui.Robot;
import controller.ui.GUI;
import data.*;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyUnitTest {

    @BeforeClass
    public static void setUp(){
        System.setProperty("CONFIG_ROOT", "resources/");
    }


    /** This test spins up all GUI classes for each league once to check if they not fail initially
     */
    @Test
    public void test_simple_gui_league_quick_start_up() throws InterruptedException {
        GameController c = new GameController();

        for (int league_idx=0; league_idx < Rules.LEAGUES.length; league_idx++){
            Rules.league = Rules.LEAGUES[league_idx];
            ActionBoard.init();
            GameControlData game_control_data = new GameControlData();
            new GUI(false, game_control_data);
            // To let the UI close again
            Thread.sleep(300);
        }
    }
}
