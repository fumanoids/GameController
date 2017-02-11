import static org.junit.Assert.assertEquals;

import controller.GameController;
import controller.action.ActionBoard;
import controller.ui.GUI;
import controller.ui.StartInput;
import data.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class ManualUITest {

    @BeforeClass
    public static void setUp(){
        System.setProperty("CONFIG_ROOT", "resources/");
    }


    /** This test spins up all GUI classes for each league once to check if they not fail initially
     */
    @Test
    @Ignore
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

    @Test
    @Ignore("A test that should later go through different game prepdata states and check the ui")
    public void test_hl_kid_game_start() throws InterruptedException {
        Rules.league = Rules.LEAGUES[2];
        StartInput si = new StartInput(false);
        si.changeTeam(0, "AUTMan (1)");
        si.changeTeam(1, "Berlin United - FUmanoids (2)");
        si.repaint();
        while (!si.finished) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.exit(0);
            }
        }
    }

    @Test
    @Ignore("This test can be used to debug the complete application")
    public void test_main_application() throws InterruptedException {
        GameController.main(new String[]{});
    }
}
