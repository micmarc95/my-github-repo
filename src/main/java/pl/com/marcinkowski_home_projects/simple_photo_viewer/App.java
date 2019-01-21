package pl.com.marcinkowski_home_projects.simple_photo_viewer;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();

            }
        });

    }
}
