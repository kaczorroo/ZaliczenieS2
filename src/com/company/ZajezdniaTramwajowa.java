package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaTramwajowa extends Pojazdy {
    private String jakaZajezdnia;
    private int iloscWagonow;

    public ZajezdniaTramwajowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia, int iloscWagonow) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.jakaZajezdnia = jakaZajezdnia;
        this.iloscWagonow = iloscWagonow;
    }

    public int SumaWagonow() {
        return iloscWagonow;
    }

    @Override
    public String toString() {
        return "ZajezdniaTramwajowa{" +
                "jakaZajezdnia='" + jakaZajezdnia + '\'' +
                ", iloscWagonow=" + iloscWagonow +
                '}';
    }
}
