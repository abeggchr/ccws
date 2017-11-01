package com.zuehlke.cleancodeworkshop.smellyshapes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShapeGroup extends Shape {

    private boolean readOnly = false;
    private Set<Shape> shapes = new HashSet<>();

    public ShapeGroup() {
    }

    public ShapeGroup(Shape[] shapes, boolean readOnly) {
        this.shapes.addAll(Arrays.asList(shapes));
        this.readOnly = readOnly;
    }

    public void add(Shape shape) {
        if (readOnly) {
            return;
        }
        if (contains(shape)) {
            return;
        }
        addToArray(shape);
    }

    private void addToArray(Shape shape) {
         this.shapes.add(shape);
    }


    public boolean contains(Shape shape) {
        return this.shapes.contains(shape);
    }

    public boolean contains(Point point) {
        for (Shape shape : shapes) {
                 if (shape.contains(new Point(point.getX(), point.getY()))) {
                    return true;
                }
        }
        return false;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<shapegroup>\n");
        for (Shape shape : shapes) {
            builder.append(shape.toXml());
        }
        builder.append("</shapegroup>\n");
        return builder.toString();
    }

    public int getSize() {
        return shapes.size();
    }
}
