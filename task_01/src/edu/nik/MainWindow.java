package edu.nik;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException {
        DrawPanel panel = new DrawPanel(35);
        this.add(panel);
    }
}
