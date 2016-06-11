package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class Pojazdy {
    private int numerPojazdu;
    private int predkoscMax;
    private String zajezdnia;

    public Pojazdy(int numerPojazdu, int predkoscMax, String zajezdnia) {
        this.numerPojazdu = numerPojazdu;
        this.predkoscMax = predkoscMax;
        this.zajezdnia = zajezdnia;
    }

    public int getNumerPojazdu() {
        return numerPojazdu;
    }

    public int getPredkoscMax() {
        return predkoscMax;
    }

    public String getZajezdnia() {
        return zajezdnia;
    }

    @Override
    public String toString() {
        return "Pojazdy{" +
                "numerPojazdu='" + numerPojazdu + '\'' +
                ", predkoscMax='" + predkoscMax + '\'' +
                ", zajezdnia='" + zajezdnia + '\'' +
                '}';
    }
}
