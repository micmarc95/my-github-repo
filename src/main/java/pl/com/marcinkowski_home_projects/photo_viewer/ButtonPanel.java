package pl.com.marcinkowski_home_projects.photo_viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    private JButton previous;
    private JButton next;

    public ButtonPanel(){

        previous = new JButton("<----");
        next = new JButton("----->");

        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //empty
            }
        });

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //empty
            }
        });

        add(previous);
        add(next);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.gridx = 1;
//        constraints.gridy = 1;
        add(previous);
        add(next);

    }
}
