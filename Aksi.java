public class Aksi{
    public static void main(String[] args){
        Mobil mobil = new Mobil();

        mobil.warna = "Merah";
        mobil.tahunProduksi = 2024;
        System.out.println(mobil.warna);
        System.out.println(mobil.tahunProduksi);
        mobil.menyala();

        Mobil mobilPutih = new Mobil();
        mobilPutih.warna = "Putih";
        mobilPutih.tahunProduksi = 2023;
        System.out.println(mobilPutih.warna);
        System.out.println(mobilPutih.tahunProduksi);


        Creep c1 = new Creep();
        Creep c2 = new Creep();
        Creep c3 = new Creep();
        Creep c4 = new Creep();
        Creep c5 = new Creep();
        Creep c6 = new Creep();
        Creep c7 = new Creep();
        Creep c8 = new Creep();
        Creep c9 = new Creep();

        c1.jalan();
        c1.menyerang();
    }
}