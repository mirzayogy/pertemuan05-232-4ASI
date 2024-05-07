public class Creep{
    int healthPoint;
    int physAtk;
    int physDef;
    int magDef;
    String jalur;

    void menyerang(){
        System.out.println("Creep menyerang");
    }

    void jalan(){
        System.out.println("Creep berjalan");
    }

    void menerimaSerangan(){
        System.out.println("HP Creep berkurang");
    }

    void read(){
        System.out.println("SELECT * FROM creep");
    }

    void deleteAll(){
        System.out.println("DELETE FROM creep");
    }

    void delete(int id){
        System.out.println("DELETE FROM creep WHERE id=" + id);
    }
}