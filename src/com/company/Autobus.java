package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class Autobus extends Pojazdy {
    private int ilePaliwaZuzyl;

    public Autobus(final int numerPojazdu, final int predkoscMax, final String zajezdnia, final int ilePaliwaZuzyl) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.ilePaliwaZuzyl = ilePaliwaZuzyl;
    }

    public int getIlePaliwaZuzyl() {
        return ilePaliwaZuzyl;
    }

    public Autobus(int numerPojazdu, int predkoscMax, String zajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia);
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "ilePaliwaZuzyl=" + ilePaliwaZuzyl +
                '}';
    }
}
