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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Számológép extends JFrame implements ActionListener {

    private JTextField tf1;

    private JButton njb1;
    private JButton njb2;
    private JButton njb3;
    private JButton njb4;

    private JButton kjb1;
    private JButton kjb2;
    private JButton kjb3;
    private JButton kjb4;
    private JButton kjb5;
    private JButton kjb6;
    private JButton kjb7;
    private JButton kjb8;
    private JButton kjb9;
    private JButton kjb10;
    private JButton kjb11;
    private JButton kjb12;
    private JButton kjb13;
    private JButton kjb14;
    private JButton kjb15;
    private JButton kjb16;
    private JButton kjb17;
    private JButton kjb18;
    private JButton kjb19;
    private JButton kjb20;
    private JButton kjb21;
    private JButton kjb22;
    private JButton kjb23;
    private JButton kjb24;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;

    public Számológép() throws HeadlessException {
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField(30);
        njb1 = new JButton("");
        njb2 = new JButton("Backspace");
        njb3 = new JButton("CE");
        njb4 = new JButton("C");

        kjb1 = new JButton("MC");
        kjb2 = new JButton("7");
        kjb3 = new JButton("8");
        kjb4 = new JButton("9");
        kjb5 = new JButton("/");
        kjb6 = new JButton("sqrt");

        kjb7 = new JButton("MR");
        kjb8 = new JButton("4");
        kjb9 = new JButton("5");
        kjb10 = new JButton("6");
        kjb11 = new JButton("*");
        kjb12 = new JButton("%");

        kjb13 = new JButton("MS");
        kjb14 = new JButton("1");
        kjb15 = new JButton("2");
        kjb16 = new JButton("3");
        kjb17 = new JButton("-");
        kjb18 = new JButton("1/x");

        kjb19 = new JButton("M+");
        kjb20 = new JButton("0");
        kjb21 = new JButton("+/-");
        kjb22 = new JButton(".");
        kjb23 = new JButton("+");
        kjb24 = new JButton("=");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();

        GridLayout gr = new GridLayout(1, 1);
        p1.setLayout(gr);

        GridLayout gr5 = new GridLayout(1, 4);
        p2.setLayout(gr5);

        GridLayout gr1 = new GridLayout(1, 6);//24 gomb
        FlowLayout fl2 = new FlowLayout();
        p3.setLayout(gr1);

        GridLayout gr2 = new GridLayout(1, 6);
        p4.setLayout(gr2);

        GridLayout gr3 = new GridLayout(1, 6);
        p5.setLayout(gr3);

        GridLayout gr4 = new GridLayout(1, 6);
        p6.setLayout(gr4);
        GridLayout gr6 = new GridLayout(6, 1);
        p7.setLayout(gr6);

        p1.add(tf1);

        p2.add(njb1);
        p2.add(njb2);
        p2.add(njb3);
        p2.add(njb4);

        p3.add(kjb1);
        p3.add(kjb2);
        p3.add(kjb3);
        p3.add(kjb4);
        p3.add(kjb5);
        p3.add(kjb6);
        p4.add(kjb7);
        p4.add(kjb8);
        p4.add(kjb9);
        p4.add(kjb10);
        p4.add(kjb11);
        p4.add(kjb12);
        p5.add(kjb13);
        p5.add(kjb14);
        p5.add(kjb15);
        p5.add(kjb16);
        p5.add(kjb17);
        p5.add(kjb18);
        p6.add(kjb19);
        p6.add(kjb20);
        p6.add(kjb21);
        p6.add(kjb22);
        p6.add(kjb23);
        p6.add(kjb24);

        p7.add(p1);
        p7.add(p2);
        p7.add(p3);
        p7.add(p4);
        p7.add(p5);
        p7.add(p6);

        this.add(p7);

        kjb2.addActionListener(this);
        kjb3.addActionListener(this);
        kjb4.addActionListener(this);
        kjb8.addActionListener(this);
        kjb9.addActionListener(this);
        kjb10.addActionListener(this);
        kjb14.addActionListener(this);
        kjb15.addActionListener(this);
        kjb16.addActionListener(this);
        kjb23.addActionListener(this);
        kjb20.addActionListener(this);
        kjb24.addActionListener(this);

        pack();
    }

    public static void main(String[] args) {
        Számológép sz = new Számológép();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == kjb2) {
            tf1.setText(tf1.getText() + Integer.toString(7));
        }
        if (e.getSource() == kjb3) {
            tf1.setText(tf1.getText() + Integer.toString(8));
        }
        if (e.getSource() == kjb4) {
            tf1.setText(tf1.getText() + Integer.toString(9));
        }
        if (e.getSource() == kjb8) {
            tf1.setText(tf1.getText() + Integer.toString(4));
        }
        if (e.getSource() == kjb9) {
            tf1.setText(tf1.getText() + Integer.toString(5));
        }
        if (e.getSource() == kjb10) {
            tf1.setText(tf1.getText() + Integer.toString(6));
        }
        if (e.getSource() == kjb14) {
            tf1.setText(tf1.getText() + Integer.toString(1));
        }
        if (e.getSource() == kjb15) {
            tf1.setText(tf1.getText() + Integer.toString(2));
        }
        if (e.getSource() == kjb16) {
            tf1.setText(tf1.getText() + Integer.toString(3));
        }
        if (e.getSource() == kjb23) {
            tf1.setText(tf1.getText() + "+");
        }
        if (e.getSource() == kjb20) {
            tf1.setText(tf1.getText() + Integer.toString(0));
        }

        if (e.getSource() == kjb24) {
            
           String s=tf1.getText();
           
           tf1.setText(szamol(s));
            

        }

    }
    public String szamol(String s){
        String[] st=s.split("\\+");
        int a=0;
        for(int i=0;i<st.length;i++){
            a+=Integer.parseInt(st[i]);
        }
        return Integer.toString(a);
    }

}
