package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaTramwajowa extends Zajezdnia {
    private int iloscWagonow;

    public ZajezdniaTramwajowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia, int iloscWagonow) {
        super(numerPojazdu, predkoscMax, zajezdnia, jakaZajezdnia);
        this.iloscWagonow = iloscWagonow;
    }

    public int SumaWagonow() {
        return iloscWagonow;
    }

    @Override
    public String toString() {
        return "ZajezdniaTramwajowa{" +
                "jakaZajezdnia='" + getZajezdnia() + '\'' +
                ", iloscWagonow=" + iloscWagonow +
                '}';
    }
}
