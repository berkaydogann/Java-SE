package works;

public class Action {
    protected int age = 30; //Sadece kendi paketindeki classlar tarafından görünür.
    int year = 2030; //Sadece kendi paketindeki classlar tarafından görünür.
    public String name = "Ali Bilmem"; //Tüm paketlerden erişilir.
    private String tcNo = "365252352"; // Sadece kendi class'ın içinde görülebilir.

    public int count() {
        call();
        return tcNo.length();
    }

    private void call(){
        System.out.println("This Line Call");
    }
}
