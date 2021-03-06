package pl.com.marcinkowski_home_projects.swing_udemy_course.gui;

import pl.com.marcinkowski_home_projects.swing_udemy_course.model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class TablePanel extends JPanel {

    private JTable table;
    private PersonTableModel personTableModel;
    private JPopupMenu popup;

    private PersonTableListener personTableListener;

    public TablePanel() {

        personTableModel = new PersonTableModel();
        table = new JTable(personTableModel);
        popup = new JPopupMenu();
        JMenuItem removeItem = new JMenuItem("Delete row");
        popup.add(removeItem);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                table.getSelectionModel().setSelectionInterval(row,row);

                if(e.getButton() == MouseEvent.BUTTON3){
                    popup.show(table,e.getX(),e.getY());
                }
            }
        });

        removeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                if (personTableListener != null){
                    personTableListener.rowDeleted(row);
                    personTableModel.fireTableRowsDeleted(row,row);
                }

            }
        });



        setLayout(new BorderLayout());
        add(new JScrollPane(table),BorderLayout.CENTER);
    }

    public void setData (List<Person> db){
        personTableModel.setData(db);
    }

    public void refresh() {
        personTableModel.fireTableDataChanged();
    }

    public void setPersonTableListener(PersonTableListener listener){
        this.personTableListener = listener;
    }
}
