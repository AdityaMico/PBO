package week10;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return alas * tinggi * 0.5;
    }

    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }

    public void luas() {
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + hitungLuas());
    }
    
    public void keliling() {
        System.out.println("Keliling segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + hitungKeliling());
    }
}