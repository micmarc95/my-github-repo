package pl.com.marcinkowski.java14.swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textlistener;

    public Toolbar (){
        setBorder(BorderFactory.createEtchedBorder());

        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

    }

    public void setStringListener (StringListener listener) {
        this.textlistener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton)e.getSource();

        if (clicked == helloButton){
            if (textlistener != null){
                textlistener.textEmitted("Hello\n");
            }
        }
        else if (clicked == goodbyeButton){
            if (textlistener != null){
                textlistener.textEmitted("Goodbye\n");
            }
        }
    }
}
