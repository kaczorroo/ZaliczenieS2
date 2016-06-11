package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class Zajezdnia extends Pojazdy {
    private String jakaZajezdnia;

    public Zajezdnia(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.jakaZajezdnia = jakaZajezdnia;
    }
}
