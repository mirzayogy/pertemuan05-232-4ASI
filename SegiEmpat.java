public class SegiEmpat {
    double panjang;
    double lebar;

    void tentukanPanjang(double p){
        panjang = p;
    }

    void hitungLuas(double panjang, double lebar){
        System.out.println(panjang * lebar);
    }

    
    void tampilkanInfo(){
        System.out.println(panjang + " X " + lebar);
    }

    void menghitungLuas(){
        double hasil;
        hasil = panjang * lebar;
        System.out.println("Hasil hitung Luas: " + hasil);
    }

    double hitLuas(){
        return panjang*lebar;
    }
}
