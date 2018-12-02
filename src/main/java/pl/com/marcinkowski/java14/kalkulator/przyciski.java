package pl.com.marcinkowski.java14.kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class przyciski extends JPanel implements ActionListener {

    private JButton C;
    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton equal;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton dot;
    private JTextField window;

    public przyciski() {

        setBackground(Color.BLACK);

        C = new JButton("C");
        C.setPreferredSize(new Dimension(179, 40));
        C.setBackground(Color.LIGHT_GRAY);
        C.setFont(new Font("Arial",Font.PLAIN,25));
        plus = new JButton("+");
        plus.setPreferredSize(new Dimension(65, 40));
        plus.setBackground(Color.orange);
        plus.setForeground(Color.WHITE);
        plus.setFont(new Font("Arial",Font.PLAIN,30));
        minus = new JButton("-");
        minus.setPreferredSize(new Dimension(65, 40));
        minus.setBackground(Color.orange);
        minus.setForeground(Color.WHITE);
        minus.setFont(new Font("Arial",Font.PLAIN,30));
        multiply = new JButton("x");
        multiply.setPreferredSize(new Dimension(65, 40));
        multiply.setBackground(Color.orange);
        multiply.setForeground(Color.WHITE);
        multiply.setFont(new Font("Arial",Font.PLAIN,30));
        divide = new JButton("÷");
        divide.setPreferredSize(new Dimension(65, 40));
        divide.setBackground(Color.orange);
        divide.setForeground(Color.WHITE);
        divide.setFont(new Font("Arial",Font.PLAIN,30));
        equal = new JButton("=");
        equal.setPreferredSize(new Dimension(65, 40));
        equal.setBackground(Color.orange);
        equal.setForeground(Color.WHITE);
        equal.setFont(new Font("Arial",Font.PLAIN,30));
        zero = new JButton("0");
        zero.setPreferredSize(new Dimension(117, 40));
        zero.setBackground(Color.darkGray);
        zero.setForeground(Color.WHITE);
        zero.setFont(new Font("Arial",Font.PLAIN,20));
        one = new JButton("1");
        one.setPreferredSize(new Dimension(56, 40));
        one.setBackground(Color.darkGray);
        one.setForeground(Color.WHITE);
        one.setFont(new Font("Arial",Font.PLAIN,20));
        two = new JButton("2");
        two.setPreferredSize(new Dimension(56, 40));
        two.setBackground(Color.darkGray);
        two.setForeground(Color.WHITE);
        two.setFont(new Font("Arial",Font.PLAIN,20));
        three = new JButton("3");
        three.setPreferredSize(new Dimension(56, 40));
        three.setBackground(Color.darkGray);
        three.setForeground(Color.WHITE);
        three.setFont(new Font("Arial",Font.PLAIN,20));
        four = new JButton("4");
        four.setPreferredSize(new Dimension(56, 40));
        four.setBackground(Color.darkGray);
        four.setForeground(Color.WHITE);
        four.setFont(new Font("Arial",Font.PLAIN,20));
        five = new JButton("5");
        five.setPreferredSize(new Dimension(56, 40));
        five.setBackground(Color.darkGray);
        five.setForeground(Color.WHITE);
        five.setFont(new Font("Arial",Font.PLAIN,20));
        six = new JButton("6");
        six.setPreferredSize(new Dimension(56, 40));
        six.setBackground(Color.darkGray);
        six.setForeground(Color.WHITE);
        six.setFont(new Font("Arial",Font.PLAIN,20));
        seven = new JButton("7");
        seven.setPreferredSize(new Dimension(56, 40));
        seven.setBackground(Color.darkGray);
        seven.setForeground(Color.WHITE);
        seven.setFont(new Font("Arial",Font.PLAIN,20));
        eight = new JButton("8");
        eight.setPreferredSize(new Dimension(56, 40));
        eight.setBackground(Color.darkGray);
        eight.setForeground(Color.WHITE);
        eight.setFont(new Font("Arial",Font.PLAIN,20));
        nine = new JButton("9");
        nine.setPreferredSize(new Dimension(56, 40));
        nine.setBackground(Color.darkGray);
        nine.setForeground(Color.WHITE);
        nine.setFont(new Font("Arial",Font.PLAIN,20));
        dot = new JButton(".");
        dot.setPreferredSize(new Dimension(56, 40));
        dot.setBackground(Color.darkGray);
        dot.setForeground(Color.WHITE);
        dot.setFont(new Font("Arial",Font.PLAIN,20));
        window = new JTextField("",12);
        window.setBackground(Color.BLACK);
        window.setForeground(Color.WHITE);
        window.setEditable(false);
        Font font1 = new Font( "Calibri", Font.PLAIN,25);
        window.setAlignmentX(RIGHT_ALIGNMENT);
        window.setFont(font1);
        window.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        C.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        dot.addActionListener(this);

        setLayout(new FlowLayout(1));

        add(window);
        add(C);
        add(divide);
        add(seven);
        add(eight);
        add(nine);
        add(multiply);
        add(four);
        add(five);
        add(six);
        add(minus);
        add(one);
        add(two);
        add(three);
        add(plus);
        add(zero);
        add(dot);
        add(equal);




    }

///////////////////////////////////////////////////////////////////////////////////

    double liczba = 0;
    double wynik = 0;
    int b;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == C) {
            window.setText("");
            liczba = 0.0;
            wynik = 0;
        }
        else if (source == dot){
            if(window.getText().contains("."))
                window.setText(window.getText());
            else window.setText(window.getText() + ".");
        }
        else if(source == plus) {
            if (wynik == 0) wynik = liczba;
            window.setText("");
            b = 1;
            return;
        }
        else if(source == minus){
            if (wynik == 0) wynik = liczba;
            window.setText("");
            b = 2;
            return;
        }
        else if(source == multiply){
            if (wynik == 0) wynik = liczba;
            window.setText("");
            b = 3;
            return;
        }
        else if(source == divide){
            if (wynik == 0) wynik = liczba;
            window.setText("");
            b = 4;
            return;
        }
        else if(source == equal){
            if (wynik == 0) wynik = liczba;
            if (b == 1){
                wynik += liczba;
            } else if (b == 2){
                wynik -= liczba;
            } else if (b == 3){
                wynik *= liczba;
            } else if (b == 4){
                wynik /= liczba;
            }
            String x = Double.toString(wynik);
            window.setText(x);
            liczba = 0.0;

    }
        else if(e.getSource() == zero || e.getSource() == one || e.getSource() == two || e.getSource() == three || e.getSource() == four || e.getSource() == five || e.getSource() == six || e.getSource() == seven || e.getSource() == eight || e.getSource() == nine ) {
            JButton a = (JButton)source;
            window.setText(window.getText() + a.getText());
            liczba = Double.parseDouble(window.getText());
        }

    }


}
