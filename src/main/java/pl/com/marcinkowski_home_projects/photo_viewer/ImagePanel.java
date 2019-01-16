package pl.com.marcinkowski_home_projects.photo_viewer;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    public ImagePanel() {

        setVisible(true);
        setBackground(Color.cyan);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;

    }


}
