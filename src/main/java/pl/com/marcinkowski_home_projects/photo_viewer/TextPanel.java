package pl.com.marcinkowski_home_projects.photo_viewer;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel(){

        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea),BorderLayout.CENTER);
    }

    public void appendText (String text){
        textArea.append(text);
    }
}
