package pl.com.marcinkowski.java14.swing1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;
    private FormListener formListener;
    private JList ageList;

    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        nameLabel = new JLabel("Name: ");
        occupationLabel = new JLabel("Occupation: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        ageList = new JList();

        DefaultListModel ageModel = new DefaultListModel();
        ageModel.addElement(new AgeCategory(0,"Under 18"));
        ageModel.addElement(new AgeCategory(1,"18-65"));
        ageModel.addElement(new AgeCategory(2,"Over 65"));
        ageList.setModel(ageModel);

        ageList.setPreferredSize(new Dimension(110,70));
        ageList.setBorder(BorderFactory.createEtchedBorder());
        ageList.setSelectedIndex(1);

        okBtn = new JButton("OK");
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();
                AgeCategory ageCat = (AgeCategory)ageList.getSelectedValue();

                ageCat.getId();

                FormEvent ev = new FormEvent(this, name, occupation, ageCat.getId());
                if (formListener != null){
                    formListener.formEventOccurred(ev);
                }

            }
        });

        Border innerborder = BorderFactory.createTitledBorder("Add person");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerborder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 1;

        ///////////first row////////////

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;

        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);

        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;

        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField,gc);

        ///////////second row////////////

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;

        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(occupationLabel,gc);

        gc.gridx = 1;
        gc.gridy = 1;

        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField,gc);

        ///////////third row////////////

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 1;
        gc.gridy = 2;

        gc.anchor = GridBagConstraints.FIRST_LINE_START; // nie trzeba drugi raz ale dla jasności
        gc.insets = new Insets(0,0,0,0);
        add(ageList,gc);

        ///////////fourth row////////////

        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridx = 1;
        gc.gridy = 3;

        gc.anchor = GridBagConstraints.FIRST_LINE_START; // nie trzeba drugi raz ale dla jasności
        gc.insets = new Insets(0,0,0,0);
        add(okBtn,gc);


    }

    public void setFormListener(FormListener formListener){
        this.formListener = formListener;
    }
}

class AgeCategory {
    private String text;
    private int id;

    public AgeCategory (int id, String text) {
        this.text = text;
        this.id = id;

    }

    @Override
    public String toString() {
        return text;
    }

    public int getId() {
        return id;
    }
}
