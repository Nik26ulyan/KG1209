package ru.vsu.cs.kg2022;

import ru.vsu.cs.kg2022.Drawable.DrawableObject;
import ru.vsu.cs.kg2022.Drawable.Image;
import ru.vsu.cs.kg2022.Drawable.Plane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private final int TIMER_DELAY;
    private Timer timer;
    private Image img;
    private Plane plane;

    public DrawPanel(int timerDelay) {
        TIMER_DELAY = timerDelay;
        timer = new Timer(TIMER_DELAY, this);
        plane = new Plane(-100, 200, 200, 200);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        img = new Image(0, 0, getWidth(), getHeight(), plane);
        img.draw(gr);


//        gr.setColor(new Color(100, 100, 255));
//        gr.fillRect(0, 0, getWidth(), getHeight());
//        gr.setColor(new Color(53, 213, 16));
//        gr.fillRect(0, 2*getHeight() / 3, getWidth(), getHeight());
//        DrawUtils.drawSun(gr, getWidth() / 2, 200, 100, 100, (getHeight() + getWidth()) / 50, Color.ORANGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (img != null) {
            img.movePlane(1);
            repaint();
        }
    }
}
