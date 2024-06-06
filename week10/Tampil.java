package week10;

public class Tampil {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang (5,4);
        pp.getPanjang();
        pp.getLebar();
        pp.luas();
        pp.keliling();
        System.out.println();

        Persegi pe = new Persegi (5);
        pe.getSisi();
        pe.luas();
        pe.keliling();
        System.out.println();

        Lingkaran li = new Lingkaran (5);
        li.getJari();
        li.luas();
        li.keliling();
        System.out.println();

        Segitiga sss = new Segitiga (5, 4);
        sss.getAlas();
        sss.getTinggi();
        sss.luas();
        sss.keliling();
        System.out.println();
    }
}
