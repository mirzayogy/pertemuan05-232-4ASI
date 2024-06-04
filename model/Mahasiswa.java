package model;

public class Mahasiswa {
    private String npm;
    private String nama;
    private int jumlahSks;
    private double ipk;

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
