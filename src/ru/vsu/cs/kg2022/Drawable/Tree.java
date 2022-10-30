package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;

public class Tree extends DrawableObject {

    public Tree(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setWidth(w);
        setHeight(h);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(114, 20, 0));
        g.fillRect(getX()-getWidth()/10, getY() - getHeight(), getWidth()/5, getHeight());
        g.setColor(new Color(238, 160, 16));
        g.fillOval(getX() - getWidth()/4, getY() - getHeight() - getHeight()/5, getWidth()/2, getHeight()/2);
        g.fillOval(getX() - getWidth()/3, getY() - getHeight() + getHeight()/5, getWidth()/2, getHeight()/2);
        g.fillOval(getX() - getWidth()/4 + getWidth()/12, getY() - getHeight() + getHeight()/5, getWidth()/2, getHeight()/2);
    }
}
