package be.ucll.crafsmanship.state.musicPlayer;

import be.ucll.crafsmanship.state.musicPlayer.ui.Player;
import be.ucll.crafsmanship.state.musicPlayer.ui.UI;

/**
 * Demo class to showcase the State pattern with a Music Player example.
 *
 **/

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
