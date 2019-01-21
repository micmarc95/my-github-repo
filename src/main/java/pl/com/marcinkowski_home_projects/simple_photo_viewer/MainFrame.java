package pl.com.marcinkowski_home_projects.simple_photo_viewer;

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
import java.util.Arrays;

public class MainFrame extends JFrame {

    private ButtonPanel buttonPanel;
    private TextField photoCount;
    private JLabel image;
    private String[] filenames;
    private String path;


    public MainFrame() {

        buttonPanel = new ButtonPanel();
        image = new JLabel();
        photoCount = new TextField(4);
        final int widthImg = getToolkit().getScreenSize().width;
        final int heightImg = getToolkit().getScreenSize().height - 40;

        /////////////////////////////////////////////////////////////////////////////////////////////////

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridheight = 1;
        constraints.gridwidth = 4;

        /////////////MenuBar///////////////////////////////////////

        constraints.weightx = 1;
        constraints.weighty = 0.01;
        constraints.gridy = 0;
        add(createMenuBar(),constraints);

        /////////////image//////////////////////////////////////////

        constraints.weighty = 0.97;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.VERTICAL;
        add(image, constraints);
        constraints.fill = GridBagConstraints.BOTH;
        image.setSize(widthImg,heightImg);

        /////////////photoCount////////////////////////////////////

        constraints.weighty = 0.02;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.NONE;
        add(photoCount,constraints);
        photoCount.setEnabled(true);
        photoCount.setEditable(false);
        photoCount.setForeground(Color.BLACK);
        constraints.fill = GridBagConstraints.BOTH;

        /////////////buttonPanel////////////////////////////////////

        constraints.weighty = 0.02;
        constraints.gridy = 3;
        add(buttonPanel,constraints);

        ////////////////////////////////////////////////////////////////////////////////////////////////

        setVisible(true);
        setMinimumSize(new Dimension(620,520));
        setSize(new Dimension(widthImg, heightImg));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JMenuBar createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(600,40));
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");

        final JFileChooser fileChooser = new JFileChooser("C:\\Users\\Michał\\Desktop");
        FileFilter filter = new FileNameExtensionFilter("Image file", "jpg","png","jpeg");
        fileChooser.setFileFilter(filter);

        add(file);
        file.add(open);

        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fileChooser.showOpenDialog(null);
                File selectedFile = fileChooser.getSelectedFile();

                path = selectedFile.getParent();
                File file1 = new File(path);
                filenames = file1.list((dir, name) -> {
                    if (name.endsWith("JPG") || name.endsWith("JPEG") || name.endsWith("PNG") || name.endsWith("jpg") || name.endsWith("jpeg") || name.endsWith("png"))
                        return true;
                    else
                        return false;
                });

                buttonPanel.setPosition(Arrays.asList(filenames).indexOf(selectedFile.getName()));
                photoCount.setText((Arrays.asList(filenames).indexOf(selectedFile.getName()) + 1) + "/" + filenames.length );
                /////////////////test
                System.out.println(path + "\\" + selectedFile.getName());
                System.out.println(Arrays.asList(filenames).indexOf(selectedFile.getName()) + 1);
                /////////////////

                buttonPanel.setPath(path);
                buttonPanel.setFilenames(filenames);

                try {
                    BufferedImage myPicture = ImageIO.read(selectedFile);
                    ImageIcon icon = new ImageIcon(myPicture);

                    if (myPicture.getWidth() > getToolkit().getScreenSize().width || myPicture.getHeight() > getToolkit().getScreenSize().height - 100){
                        Image img = icon.getImage().getScaledInstance(getToolkit().getScreenSize().width - 400,getToolkit().getScreenSize().height - 200,Image.SCALE_SMOOTH);
                        image.setIcon(new ImageIcon(img));
                    } else { image.setIcon(new ImageIcon(myPicture));}

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonPanel.setButtonListener(new ButtonListener() {
            @Override
            public void buttonEventOccured(ButtonPanelEvent e) {
                image.setIcon(e.getImage().getIcon());
                System.out.println(e.getPosition());
                photoCount.setText((e.getPosition() + 1) + "/" + filenames.length);
            }
        });

        menuBar.add(file);
        return menuBar;
    }




}
