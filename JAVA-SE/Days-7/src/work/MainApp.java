package work;

public class MainApp {
    public static void main(String[] args) {

        //Miras - Inheritance
        Base a = new A();  //Burada A class'ı çalışır.
        B b = new B();   //Yada Base b = new B() olabilir.
        B c = new C();

        //a.read() -> //Diyemeyiz. Sebebi Base classında tanımlı değil.
        a.action(4, 6);
        b.action(1, 3,9);
        c.action(4, 2);

    }

    public static void call(Base base) {
        base.action(10, 30);
    }
}
