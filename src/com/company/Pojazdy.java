package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class Pojazdy {
    private String numerPojazdu;
    private String predkoscMax;
    private String zajezdnia;

    public Pojazdy(String numerPojazdu, String predkoscMax, String zajezdnia) {
        this.numerPojazdu = numerPojazdu;
        this.predkoscMax = predkoscMax;
        this.zajezdnia = zajezdnia;
    }

    public String getNumerPojazdu() {
        return numerPojazdu;
    }

    public String getPredkoscMax() {
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
