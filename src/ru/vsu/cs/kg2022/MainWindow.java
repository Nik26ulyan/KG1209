package ru.vsu.cs.kg2022;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private DrawPanel dp;

    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize (sSize);
        dp = new DrawPanel(1);
        this.add(dp);
    }
}