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

    public Tramwaj(int numerPojazdu, int predkoscMax, String zajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia);
    }

    @Override
    public int getNumerPojazdu() {
        return super.getNumerPojazdu();
    }

    @Override
    public int getPredkoscMax() {
        return super.getPredkoscMax();
    }

    @Override
    public String getZajezdnia() {
        return super.getZajezdnia();
    }

    public int getIleWagonow() {
        return ileWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "ileWagonow=" + ileWagonow +
                " zajezdnia="+ getZajezdnia() +
                " ileWagonow="+ getIleWagonow() +
                " numerPojazdu="+ getNumerPojazdu() +
                " predkoscMax="+ getPredkoscMax() +
                '}';
    }
}





