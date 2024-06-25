import model.Mahasiswa;
import model.MahasiswaTransfer;
public class MahasiswaAksi {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNpm("00001");
        System.out.println(m.getNpm());
        m.delete();

        MahasiswaTransfer n = new MahasiswaTransfer();
        n.setNpm("00002");
        n.read();
        n.delete();

       
    }
}
