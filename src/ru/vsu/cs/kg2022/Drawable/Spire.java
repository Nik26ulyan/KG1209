package ru.vsu.cs.kg2022.Drawable;

import java.awt.*;

public class Spire extends DrawableObject{

    private final SkyscraperSizeProvider sizeProvider;

    public Spire(SkyscraperSizeProvider sizeProvider) {
        this.sizeProvider = sizeProvider;
    }

    @Override
    public void draw(Graphics2D g) {
        int sX = sizeProvider.getSkyscraperX();
        int sY = sizeProvider.getSkyscraperY();
        int sW = sizeProvider.getSkyscraperWight();
        int sH = sizeProvider.getSkyscraperHeight();
        Color sC = sizeProvider.getSkyscraperColor();
        this.setHeight(sH/3);
        g.setColor(sC.darker());
        g.fillRect(sX - sW / 4, sY - sH - getHeight() / 10, sW / 2, getHeight() / 10);
        g.setColor(g.getColor().darker());
        g.fillRect(sX - sW / 32, sY - sH - getHeight(), sW / 16, getHeight() - getHeight() / 10);
    }
}
