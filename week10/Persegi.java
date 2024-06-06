package week10;

public class Persegi extends BangunDatar {
    private int sisi;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public int hitungLuas() {
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return sisi*4;
    }

    public void luas() {
        System.out.println("Luas persegi dengan panjang sisi " + sisi + " adalah " + hitungLuas());
    }
    
    public void keliling() {
        System.out.println("Keliling persegi dengan panjang sisi " + sisi + " adalah " + hitungKeliling());
    }
}