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
}