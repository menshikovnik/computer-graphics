package edu.nik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
DrawPanel extends JPanel implements ActionListener {

    private final Timer timer;
    private int ticksFromStart = 2;
    private final Car car;
    private final Sun sun;
    private final Landscape landscape;
    private final CarF1 carF1;

    public DrawPanel(final int timerDelay) {
        timer = new Timer(timerDelay, this);
        timer.start();
        this.landscape = new Landscape();
        this.carF1 = new CarF1(500);
        this.sun = new Sun(850);
        this.car = new Car(270);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        landscape.draw(g);
        sun.draw(g);
        carF1.setX(ticksFromStart);
        carF1.draw(g);
//        car.draw(g);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
           ++ticksFromStart;
        }
    }
}
