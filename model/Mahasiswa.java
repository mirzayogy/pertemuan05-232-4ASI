package model;

public class Mahasiswa {
    private String npm;
    private String nama;
    private int jumlahSks;
    private double ipk;

    public void create(){

    }

    public void read() {
        System.out.println("SELECT * FROM mahasiswa");
    }

    public void read(double ipk){
        System.out.println("SELECT * FROM mahasiswa WHERE ipk>" + ipk);
    }

    public void delete(){
        System.out.println("DELETE FROM mahasiswa");
    }

    public void delete(String npm){
        System.out.println("DELETE FROM mahasiswa WHERE npm=" + npm);
    }

    public void delete(String nama, int i) {
        System.out.println("DELETE FROM mahasiswa WHERE nama=" + nama);
    }

    public void delete(int jumlahSks) {
        System.out.println("DELETE FROM mahasiswa WHERE jumlah_sks=" + jumlahSks);
    }

    public void delete(String nama, double ipk){
        System.out.println("DELETE FROM mahasiswa "+
            "WHERE nama='" + nama +"' AND ipk<"+ipk );
    }

    public void delete(double ips, String npm) {
        System.out.println("DELETE FROM mahasiswa " +
                "WHERE nama='" + nama + "' AND ipk<" + ipk);
    }

    public String getNpm(){
        
        return npm;
    }

    public void setNpm(String npm){
        if(npm.length()<8){

        }
        this.npm = npm;
    }

    public double getIpk(){
        return ipk;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }
}
