package edu.csuglobal.csc400.sandbox;

import edu.princeton.cs.algs4.Bag;

import java.awt.Point;

public class BagArrays {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Bag<Wool>[] threeBagsEmpty = new Bag[3];
        Bag<Wool>[] threeBagsFilled = new Bag[]{new Bag<Wool>(), new Bag<Wool>(), new Bag<Wool>()};

        Wool wool1 = new Wool("black", "wooly");

        Point point = new Point(2, 7);

    }

    static class Wool {
        String color;
        String texture;

        public Wool(String color, String texture) {
            this.color = color;
            this.texture = texture;
        }
    }
}
