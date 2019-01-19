package pl.com.marcinkowski_home_projects.photo_viewer;

import javax.swing.*;
import java.util.EventObject;

public class ButtonPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */

    private int position;
    private JLabel image;

    public ButtonPanelEvent(Object source) {
        super(source);
    }

    public ButtonPanelEvent(Object source, int position, JLabel image) {
        super(source);
        this.position = position;
        this.image = image;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public JLabel getImage() {
        return image;
    }

    public void setImage(JLabel image) {
        this.image = image;
    }
}
