package pl.com.marcinkowski_home_projects.simple_photo_viewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ButtonPanel extends JPanel{

    private JButton previous;
    private JButton next;
    private JLabel image;
    private String[] filenames;
    private int position;
    private String path;
    private ButtonListener buttonListener;


    public ButtonPanel(){

        previous = new JButton("<----");
        next = new JButton("----->");
        image = new JLabel();


        add(previous);
        add(next);



        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                position--;
                buttonDisEnable();
                buttonAction();

                ButtonPanelEvent buttonPanelEvent = new ButtonPanelEvent(this, position, image);

                if (buttonListener != null) {
                    buttonListener.buttonEventOccured(buttonPanelEvent);

                    buttonPanelEvent.setImage(image);
                    buttonPanelEvent.setPosition(position);
                }
            }
        });

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                position++;
                buttonDisEnable();
                buttonAction();

                ButtonPanelEvent buttonPanelEvent = new ButtonPanelEvent(this, position, image);

                if (buttonListener != null) {
                    buttonListener.buttonEventOccured(buttonPanelEvent);

                    buttonPanelEvent.setImage(image);
                    buttonPanelEvent.setPosition(position);
                }
            }
        });

    }


        public void buttonAction () {
            try {
                File file = new File(path + "\\" + filenames[position]);
                System.out.println(file.getPath());

                BufferedImage myPicture = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(myPicture);

                if (myPicture.getWidth() > getToolkit().getScreenSize().width || myPicture.getHeight() > getToolkit().getScreenSize().height - 40) {
                    Image img = icon.getImage().getScaledInstance(getToolkit().getScreenSize().width - 400, getToolkit().getScreenSize().height - 200, Image.SCALE_SMOOTH);
                    image.setIcon(new ImageIcon(img));

                } else {
                    image.setIcon(new ImageIcon(myPicture));
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void buttonDisEnable(){
            if (position == 0) {
                previous.setEnabled(false);
            } else {
                previous.setEnabled(true);
            }

            if (position == filenames.length - 1) {
                next.setEnabled(false);
            } else {
                next.setEnabled(true);
            }
        }

            public void setFilenames (String[]filenames){
                this.filenames = filenames;
            }

            public void setPosition ( int position){
                this.position = position;
            }

            public void setPath (String path){
                this.path = path;
            }

            public void setButtonListener (ButtonListener buttonlistener){
                this.buttonListener = buttonlistener;
            }
        }