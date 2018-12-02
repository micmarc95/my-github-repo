package pl.com.marcinkowski.java14.kalkulator;


import javax.swing.*;




public class Okno extends JFrame {

    public Okno(){

        super("Mój Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(270,300);
        setLocation(600,300);
        setResizable(false);

        JPanel Dzialania = new przyciski();
        add(Dzialania);

    }

}


