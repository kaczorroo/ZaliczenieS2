package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaAutobusowa extends Pojazdy {
    private String jakaZajezdnia;

    public ZajezdniaAutobusowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.jakaZajezdnia = jakaZajezdnia;
    }

    @Override
    public String toString() {
        return "ZajezdniaAutobusowa{" +
                "jakaZajezdnia='" + jakaZajezdnia + '\'' +
                '}';
    }
}
