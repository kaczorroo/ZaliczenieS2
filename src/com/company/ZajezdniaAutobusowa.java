package com.company;

/**
 * Created by ced on 2016-06-11.
 */
public class ZajezdniaAutobusowa extends Pojazdy {
    private String jakaZajezdnia;
    private int ilePaliwa;

    public ZajezdniaAutobusowa(int numerPojazdu, int predkoscMax, String zajezdnia, String jakaZajezdnia, int ilePaliwa) {
        super(numerPojazdu, predkoscMax, zajezdnia);
        this.jakaZajezdnia = jakaZajezdnia;
        this.ilePaliwa = ilePaliwa;
    }

    public int SumaSpalania() {
        return ilePaliwa;
    }

    @Override
    public String toString() {
        return "ZajezdniaAutobusowa{" +
                "jakaZajezdnia='" + jakaZajezdnia + '\'' +
                ", ilePaliwa=" + ilePaliwa +
                '}';
    }
}
