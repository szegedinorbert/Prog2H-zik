/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class idoAtalakito extends JFrame implements ActionListener {

    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;

    private JButton b1;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;

    public idoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Számol");

        tf1 = new JTextField(3);
        tf2 = new JTextField(3);
        tf3 = new JTextField(3);
        tf4 = new JTextField(3);
        tf5 = new JTextField(3);
        tf6 = new JTextField(3);
        tf7 = new JTextField(3);
        tf8 = new JTextField(3);
        tf9 = new JTextField(3);
        tf10 = new JTextField(3);
        tf11 = new JTextField(3);
        tf12 = new JTextField(3);

        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        GridLayout gr = new GridLayout(4, 1);
        FlowLayout fl = new FlowLayout();
        p5.setLayout(gr);

//        GridLayout gr1=new GridLayout(2,4);
//        FlowLayout fl1=new FlowLayout();
//        p1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 1);
        FlowLayout fl2 = new FlowLayout();
        p3.setLayout(gr2);

        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);

        p2.add(tf5);
        p2.add(lb5);
        p2.add(tf6);
        p2.add(lb6);
        p2.add(tf7);
        p2.add(lb7);
        p2.add(tf8);
        p2.add(lb8);

        p3.add(b1);

        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);

        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);

//        this.add(p1);
//        this.add(p2);
//        this.add(p5);
//        this.add(p3);
//        this.add(p4);
        this.add(p5);
        b1.addActionListener(this);
        pack();

    }

    public static void main(String[] args) {
        idoAtalakito i = new idoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int mp1 = Integer.parseInt(tf4.getText());
            int p1 = Integer.parseInt(tf3.getText());
            int o1 = Integer.parseInt(tf2.getText());
            int nap = Integer.parseInt(tf1.getText());

            int mp2 = Integer.parseInt(tf8.getText());
            int p2 = Integer.parseInt(tf7.getText());
            int o2 = Integer.parseInt(tf6.getText());
            int nap2 = Integer.parseInt(tf5.getText());

            int ömp = 0;
            int öp = 0;
            int öo = 0;
            int önap = 0;

            if ((mp1 + mp2) >= 60) {
                öp += (mp1 + mp2) / 60;
                ömp = (mp1 + mp2) % 60;

            } else {
                ömp = mp1 + mp2;
            }
            if ((öp + p1 + p2) >= 60) {
                öo += (öp + p1 + p2) / 60;
                öp = (öp + p1 + p2) % 60;

            } else {
                öp = öp + p1 + p2;

            }
            if ((öo + o1 + o2) >= 24) {
                önap = (öo + o1 + o2) / 24;
                öo = (öo + o1 + o2) % 24;
            } else {
                öo = (öo + o1 + o2);
            }
            önap = nap + nap2 + önap;

            tf12.setText("" + ömp);
            tf11.setText("" + öp);
            tf10.setText("" + öo);
            tf9.setText("" + önap);
        }
    }
}
