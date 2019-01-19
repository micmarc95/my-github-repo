package pl.com.marcinkowski_home_projects.photo_viewer;

import java.util.EventListener;

public interface ButtonListener extends EventListener {
    void buttonEventOccured(ButtonPanelEvent e);
}
