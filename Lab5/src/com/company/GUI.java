package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;

public class GUI extends JFrame {
    protected JPanel panel;
    Line[] linesCross = new Line[]{};
    Line[] linesSim = new Line[]{};
    LinePooling linePooling = new LinePooling();


    public GUI() {
        LinePooling linePooling = new LinePooling();
        linePooling.Full();
        linesCross = linePooling.LinesForDrawing(linePooling.l);
        linesSim = linePooling.LinesSim(linePooling.l);
        this.setTitle("5");
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
            }

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
            }

            public void windowIconified(WindowEvent e) {
            }

            public void windowDeiconified(WindowEvent e) {
            }

            public void windowActivated(WindowEvent e) {
            }

            public void windowDeactivated(WindowEvent e) {
            }
        });
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.ipadx = 300;
        constraints.ipady = 300;

        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
            for (int i = 0; i < linesCross.length; i++) {
                g.drawLine(linesCross[i].getX1(), linesCross[i].getY1(), linesCross[i].getX2(), linesCross[i].getY2());
            }
            }
        };
        for (int i = 0; i < Arrays.stream(linesSim).count() / 2; i++) {
            System.out.print("Прямая " + i + "\n");
            System.out.print("x1:  " + linesSim[i].getX1() + " y1:  " + linesSim[i].getY1() + "\n");
            System.out.print("x2:  " + linesSim[i].getX2() + " y2:  " + linesSim[i].getY2() + "\n");
        }

        // panel.setBackground(Color.BLACK);

        add(panel, constraints);
        this.setSize(800, 600);
        this.setVisible(true);
        repaint();
    }

}