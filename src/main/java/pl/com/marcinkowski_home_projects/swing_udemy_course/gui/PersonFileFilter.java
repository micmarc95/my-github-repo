package pl.com.marcinkowski_home_projects.swing_udemy_course.gui;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class PersonFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {

        if (f.isDirectory()){
            return true;
        }

        String name = f.getName();
        String extension = Utils.getFileExtension(name);

        if (extension == null){ return false; }
        if (extension.equals("per")){ return true; }

        return false;
    }

    @Override
    public String getDescription() {
        return "Person database files (*.per)";
    }
}
