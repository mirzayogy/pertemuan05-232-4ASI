public class SegiEmpat {
    double panjang;
    double lebar;

    SegiEmpat(){
        panjang = 0;
        lebar = 0;
    }

    SegiEmpat(double p, double l){
        panjang = p;
        lebar = l;
    }

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
