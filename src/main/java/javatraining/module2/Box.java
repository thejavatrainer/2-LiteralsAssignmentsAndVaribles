/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

import java.util.Objects;

@SuppressWarnings("all")
public class Box {
    double width;
    double height;
    double depth;

    public Box() {
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public void resize(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 && Double.compare(box.height, height) == 0 && Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + "width=" + width + ", " + "height=" + height + ", " + "depth=" + depth + "]";
    }

    public static void main(String[] args) {
        Box box;                    // declare reference to object of type Box
        box = new Box();            // allocate (or instantiate) a Box object
        Box box1 = new Box(1, 2, 3);

        System.out.println(box);    // Box[width=0.0, height=0.0, depth=0.0]
        System.out.println(box1);   // Box[width=1.0, height=2.0, depth=3.0]

        System.out.println("box volume " + box.volume());   // box volume 0.0
        System.out.println("box1 volume " + box1.volume()); // box1 volume 6.0

        Box box2 = box;                                   // points to the same box object
        box2.resize(4, 5, 6);
        System.out.println("box volume " + box.volume()); // box volume 120.0
        box2 = null;
        System.out.println("box volume " + box.volume()); // box volume 120.0
    }
}
