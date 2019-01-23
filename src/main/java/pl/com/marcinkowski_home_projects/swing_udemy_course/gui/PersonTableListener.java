package pl.com.marcinkowski_home_projects.swing_udemy_course.gui;

import java.util.EventListener;

public interface PersonTableListener extends EventListener {
    void rowDeleted(int row);
}
