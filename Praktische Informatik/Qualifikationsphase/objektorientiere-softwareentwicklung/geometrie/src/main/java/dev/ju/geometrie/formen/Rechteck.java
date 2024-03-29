package dev.ju.geometrie.formen;

/**
 *
 * Diese Klasse dient zur Darstellung eines Rechteckes
 * @version 1.0 from 08.09.2023
 * @author Jahid Uddin
 */

public class Rechteck {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double berechneFlaeche() {
        return a * b;
    }

    public double berechneFlaeche(double a, double b) {
        this.a = a;
        this.b = b;

        return this.a * this.b;
    }

    public double berechneUmfang() {
        return 2 * a + 2 * b;
    }

    public double berechneUmfang(double a, double b) {
        this.a = a;
        this.b = b;

        return 2 * this.a + 2 * this.b;
    }
}