package week10;

public class Lingkaran extends BangunDatar {
    private int jari;
    private static final double pi = 3.14;
    
    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public double hitungLuas() {
        return pi * jari * jari;
    }

    public double hitungKeliling() {
        return (jari*2)*pi;
    }

    public void luas() {
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah " + hitungLuas());
    }
    
    public void keliling() {
        System.out.println("Keliling lingkaran dengan jari-jari " + jari + " adalah " + hitungKeliling());
    }
}