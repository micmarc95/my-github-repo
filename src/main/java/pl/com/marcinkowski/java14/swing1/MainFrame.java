package pl.com.marcinkowski.java14.swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame() {

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();
        formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener(){
           public void formEventOccurred(FormEvent e){
               String name = e.getName();
               String occupation = e.getOccupation();
               int ageCat = e.getAgeCategory();

               textPanel.appendText(name + ": " + occupation + ": " + ageCat + "\n");
           }

        });

        add(formPanel,BorderLayout.WEST);
        add(toolbar,BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
    }
}
