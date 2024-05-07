public class SegiEmpatAksi {
    public static void main(String[] args) {
        SegiEmpat s1 = new SegiEmpat();
        s1.tampilkanInfo();
        s1.menghitungLuas();

        SegiEmpat s2 = new SegiEmpat(3,2);
        s2.tampilkanInfo();
        s2.menghitungLuas();

        // s1.panjang = 10;
        // s1.lebar = 5;
        // s1.tampilkanInfo();

        // s1.menghitungLuas();

        // System.out.println(s1.hitLuas());

        // s1.tentukanPanjang(100);
        // s1.tampilkanInfo();

        // s1.hitungLuas(3, 2);
    }
}
