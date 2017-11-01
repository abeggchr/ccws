package com.zuehlke.cleancodeworkshop.smellyshapes;

public class Circle extends Shape {

    private final Point center;
    private int radius;
    private Color color = new Color("Green");

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(Point point) {
        int deltaX = point.getX() - center.getX();
        int deltaY = point.getY() - center.getY();
        return square(deltaX) + square(deltaY) <= square(radius);
    }

    private int square(int number) {
        return number * number;
    }

    public int countContainingPoints(int[] xCords, int[] yCords) {
        int numberOfContainingPoints = 0;
        for (int i = 0; i < xCords.length; ++i) {
            if (contains(new Point(xCords[i], yCords[i]))) {
                numberOfContainingPoints++;
            }
        }
        return numberOfContainingPoints;
    }

    /**
     * This method returns the shape color.
     *
     * @return the shape color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the shape color
     *
     * @param color the new color of the shape
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return center.getX();
    }

    public int getY() {
        return center.getY();
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle: " + center + " radius= " + radius + " " + color.rgbString();
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<circle");
        builder.append(" x=\"" + center.getX() + "\"");
        builder.append(" y=\"" + center.getY() + "\"");
        builder.append(" radius=\"" + radius + "\"");
        builder.append(" />\n");
        return builder.toString();
    }

}
