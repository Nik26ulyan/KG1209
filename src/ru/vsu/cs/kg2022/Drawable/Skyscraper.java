package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;
import java.util.List;

public class Skyscraper extends DrawableObject implements SkyscraperSizeProvider{

    public Skyscraper(int x, int y, Color color, int w, int h) {
        setX(x);
        setY(y);
        setColor(color);
        setWidth(w);
        setHeight(h);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(getColor());
        g.fillRect(this.getX() - this.getWidth()/2, this.getY() - this.getHeight(), this.getWidth(), this.getHeight());
        Spire spire = new Spire(this);
        spire.draw(g);
        g.setColor(Color.CYAN);
        int windowCount = getHeight()/60;
        int windowWight = getWidth()/10;
        int windowHeight = getHeight()/2/windowCount;
        int space = ((getWidth() - 2*windowWight) - 5*windowWight)/4 + windowWight;
        int curX = this.getX() - this.getWidth()/2 + getWidth()/10;
        int curY = this.getY() - this.getHeight() + getHeight()/10;
        for (int i = 0; i < windowCount; i++) {
            for (int j = 0; j < 5; j++) {
                Window window = new Window(curX, curY, windowWight, windowHeight);
                window.draw(g);
                curX += space;
            }
            curX = this.getX() - this.getWidth()/2 + getWidth()/10;
            curY += 1.5*windowHeight;
        }
        g.setColor(getColor().brighter());
        g.fillRect(getX() - getWidth()/2, getY() - 50, getWidth(), 50);
        g.setColor(getColor().darker());
        g.fillRect(getX() - getWidth()/10, getY() - 30, getWidth()/5, 30);
    }

    @Override
    public int getSkyscraperWight() {
        return getWidth();
    }

    @Override
    public int getSkyscraperHeight() {
        return getHeight();
    }

    @Override
    public int getSkyscraperX() {
        return getX();
    }

    @Override
    public int getSkyscraperY() {
        return getY();
    }

    @Override
    public Color getSkyscraperColor() {
        return getColor();
    }
}
