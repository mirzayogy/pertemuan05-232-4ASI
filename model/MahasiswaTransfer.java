package model;

public class MahasiswaTransfer extends Mahasiswa {
    private String namaKampusSebelumnya;
    private double ipkSebelumnya;

    @Override
    public void delete() {
        System.out.println("DELETE FROM mahasiswa_transfer");
    }
}
