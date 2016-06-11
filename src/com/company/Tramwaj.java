package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class Tramwaj extends Pojazdy {
    private int ileWagonow;

    public Tramwaj(final int numerPojazdu, final int predkoscMax, final String zajezdnia, final int ileWagonow) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.ileWagonow = ileWagonow;
    }

    public int getIleWagonow() {
        return ileWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "ileWagonow=" + ileWagonow +
                '}';
    }
}





