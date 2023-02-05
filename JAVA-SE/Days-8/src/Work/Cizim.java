package Work;

public class Cizim {
    int border = 0;

    public Cizim() {
        System.out.println("Cizim tetiklendi.");
    }

    public Cizim(int border) {
        System.out.println("Cizim i: " + border);
        this.border = border;
    }

    public void ciz() {
        cizimYap("");
    }

    public void cizimYap(String status) {
        System.out.println(status + " Çizim yapıldı. Border: " + border);
    }

}
