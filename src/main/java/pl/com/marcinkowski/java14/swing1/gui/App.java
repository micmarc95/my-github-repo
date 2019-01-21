package pl.com.marcinkowski.java14.swing1.gui;

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
