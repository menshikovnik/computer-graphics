package edu.nik;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setTitle("Car on the Landscape");
        window.setSize(2000, 1000);
        window.setVisible(true);
    }
}
