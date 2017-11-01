package com.zuehlke.cleancodeworkshop.smellyshapes;


public class Rectangle extends Shape {

    protected Color c = new Color("Blue");
    private int x;
    private int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(Point point) {
        return this.x <= point.getX() && point.getX() <= this.x + width && this.y <= point.getY() && point.getY() <= this.y + height;
    }

    public int calculate() {
        return width * height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", x, y, width, height,
                c.getColorAsHex());
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<rectangle");
        builder.append(" x=\"" + x + "\"");
        builder.append(" y=\"" + y + "\"");
        builder.append(" width=\"" + width + "\"");
        builder.append(" height=\"" + height + "\"");
        builder.append(" />\n");
        return builder.toString();
    }
}

