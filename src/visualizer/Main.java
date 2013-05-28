package visualizer;

import data.Rules;

/**
 * @author: Michel Bartsch
 * 
 * The game-state-visualizer-programm starts in this class.
 * The main components are initialised here.
 */
public class Main
{    
    /** Relative directory of where logs are stored */
    private final static String LOG_DIRECTORY = "logs";
    
    private final static String COMMAND_LEAGUE = "--league";
    private final static String COMMAND_LEAGUE_SHORT = "-l";
    
    
    /**
     * The programm starts here.
     * 
     * @param args  This is ignored.
     */
    public static void main(String[] args)
    {
        if( (args.length >= 2) && ((args[0].equals(COMMAND_LEAGUE_SHORT)) || (args[0].equals(COMMAND_LEAGUE))) ) {
            for(int i=0; i < Rules.LEAGUES.length; i++) {
                if(Rules.LEAGUES[i].leagueDirectory.equals(args[1])) {
                    Rules.league = Rules.LEAGUES[i];
                    break;
                }
            }     
        }
        GUI gui = new GUI();
    }
}