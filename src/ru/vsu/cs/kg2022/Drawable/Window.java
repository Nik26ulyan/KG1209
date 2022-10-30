package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;

public class Window extends DrawableObject{

    public Window(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setWidth(w);
        setHeight(h);
    }

    @Override
    public void draw(Graphics2D g) {
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}
