package pl.com.marcinkowski_home_projects.photo_viewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private ButtonPanel buttonPanel;
    private ImagePanel imagePanel;
    private JLabel image;

    public MainFrame() {

        //textPanel = new TextPanel();
        buttonPanel = new ButtonPanel();
        imagePanel = new ImagePanel();

        //textPanel.setPreferredSize(new Dimension(400,400));
        buttonPanel.setPreferredSize(new Dimension(600,40));
        imagePanel.setPreferredSize(new Dimension(600,400));

        //add(textPanel,BorderLayout.CENTER);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        //constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(createMenuBar(),constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
       // constraints.anchor = GridBagConstraints.CENTER;
        add(imagePanel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        //constraints.anchor = GridBagConstraints.PAGE_END;
        add(buttonPanel,constraints);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620,520);

        setVisible(true);
        setResizable(false);
    }

    private JMenuBar createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(600,40));
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");

        final JFileChooser fileChooser = new JFileChooser("C:\\Users\\marc9346\\Desktop");
        FileFilter filter = new FileNameExtensionFilter("PNG file", "png");
        fileChooser.setFileFilter(filter);

        add(file);
        file.add(open);

        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fileChooser.showOpenDialog(null);
                String selectedFile = fileChooser.getSelectedFile().getPath();

                try {
                    BufferedImage myPicture = ImageIO.read(new File(selectedFile));
                    JLabel pic = new JLabel(new ImageIcon(myPicture));
                    pic.setSize(new Dimension(400,400));
                    imagePanel.add(pic);


                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        menuBar.add(file);
        return menuBar;
    }
}
