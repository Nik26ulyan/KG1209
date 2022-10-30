package ru.vsu.cs.kg2022.Drawable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Image extends DrawableObject {
    private Plane plane;

    public Image(int x, int y, int w, int h, Plane plane) {
        setX(x);
        setY(y);
        setWidth(w);
        setHeight(h);
        this.plane = plane;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(65, 65, 155));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(175, 110, 12));
        g.fillRect(0, 2*getHeight() / 3, getWidth(), getHeight());
        List<Cloud> clouds = new ArrayList<>();
        clouds.add(new Cloud(100, getHeight()/7, 400, 200));
        clouds.add(new Cloud(450, getHeight()/8, 300, 150));
        clouds.add(new Cloud(720, getHeight()/10, 450, 250));
        clouds.add(new Cloud(620, getHeight()/9, 500, 300));
        clouds.add(new Cloud(1500, 70, 500, 300));
        clouds.add(new Cloud(1100, 100, 300, 150));
        for (int i = 0; i < clouds.size(); i++) {
            clouds.get(i).draw(g);
        }
        plane.draw(g);
        List<Skyscraper> buildings = new ArrayList<>();
        buildings.add(new Skyscraper(this.getWidth()/3 - 300, 4*this.getHeight()/5, new Color(89, 89, 89), 150, 500));
        buildings.add(new Skyscraper(this.getWidth()/3 - 100, 4*this.getHeight()/5 + 50, Color.GRAY, 150, 300));
        for (int i = 0; i < buildings.size(); i++) {
            buildings.get(i).draw(g);
        }

        List<Tree> trees = new ArrayList<>();
        trees.add(new Tree(800, 4*getHeight()/5 + 10, 50, 150));
        trees.add(new Tree(900, 4*getHeight()/5, 50, 150));
        trees.add(new Tree(100, 4*getHeight()/5 - 30, 50, 150));
        trees.add(new Tree(840, 4*getHeight()/5 + 15, 50, 150));
        trees.add(new Tree(760, 4*getHeight()/5 + 40, 50, 150));

        trees.add(new Tree(1200, 5*getHeight()/6 + 10, 50, 150));
        trees.add(new Tree(1500, 5*getHeight()/6, 50, 150));
        trees.add(new Tree(170, 5*getHeight()/6 - 30, 50, 150));
        trees.add(new Tree(1690, 5*getHeight()/6 + 15, 50, 150));
        trees.add(new Tree(1870, 5*getHeight()/6 + 40, 50, 150));

        trees.add(new Tree(1000, 4*getHeight()/5 + 60, 50, 150));
        trees.add(new Tree(1150, 4*getHeight()/5, 50, 150));
        trees.add(new Tree(1230, 4*getHeight()/5 + 30, 50, 150));
        trees.add(new Tree(1390, 4*getHeight()/5 + 15, 50, 150));
        trees.add(new Tree(1300, 4*getHeight()/5 + 40, 50, 150));

        trees.add(new Tree(750, 4*getHeight()/5 + 100, 50, 150));
        trees.add(new Tree(640, 4*getHeight()/5, 50, 150));
        trees.add(new Tree(50, 4*getHeight()/5 + 80, 50, 150));
        trees.add(new Tree(970, 4*getHeight()/5 + 90, 50, 150));
        trees.add(new Tree(870, 4*getHeight()/5 + 120, 50, 150));

        trees.add(new Tree(1150, 5*getHeight()/6 + 150, 50, 150));
        trees.add(new Tree(1440, 5*getHeight()/6, 50, 150));
        trees.add(new Tree(200, 5*getHeight()/6 + 200, 50, 150));
        trees.add(new Tree(1690, 5*getHeight()/6 + 190, 50, 150));
        trees.add(new Tree(1800, 5*getHeight()/6 + 140, 50, 150));

        trees.add(new Tree(930, 4*getHeight()/5 + 90, 50, 150));
        trees.add(new Tree(1520, 4*getHeight()/5, 50, 150));
        trees.add(new Tree(1320, 4*getHeight()/5 + 140, 50, 150));
        trees.add(new Tree(1460, 4*getHeight()/5 + 190, 50, 150));
        trees.add(new Tree(1350, 4*getHeight()/5 + 130, 50, 150));

        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).draw(g);
        }
    }

    public void movePlane(int X) {
        plane.setX(plane.getX() + X);
    }
}
