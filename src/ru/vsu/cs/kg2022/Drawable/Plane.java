package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;

public class Plane extends DrawableObject{

    public Plane(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setWidth(w);
        setHeight(h);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(154, 154, 154));
        g.fillRect(getX(), getY(), getWidth(), getHeight()/3);
        g.fillOval(getX() + getWidth()/2, getY(), getWidth(), getHeight()/3);
        g.fillRect(getX(), getY() - getHeight()/6, getWidth()/6, getHeight()/4);
        g.fillOval(getX()+getWidth()/12, getY() - getHeight()/6, getWidth()/6, getHeight()/4);
        g.setColor(new Color(171, 171, 171));
        g.fillOval(getX() + getWidth()/2, getY() + getHeight()/6, getWidth()/2, getHeight()/4);
        g.setColor(new Color(43, 151, 197));
        g.fillOval(getX() + getWidth(), getY() + getHeight()/16, getWidth()/8, getHeight()/12);
        g.fillOval(getX() + getWidth() - getWidth()/5, getY() + getHeight()/16, getWidth()/8, getHeight()/12);
        g.fillOval(getX() + getWidth() - 2*getWidth()/5, getY() + getHeight()/16, getWidth()/8, getHeight()/12);
        g.fillOval(getX() + getWidth() + getWidth()/4, getY() + getHeight()/16, getWidth()/4, getHeight()/6);
    }
}
