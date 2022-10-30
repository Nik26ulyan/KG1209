package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;

public class Cloud extends DrawableObject {

    public Cloud(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setWidth(w);
        setHeight(h);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(255, 255, 255, 200));
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
