package Inheritance;

public class Draw {
    public Draw(){}
    public Draw(int a) {
        System.out.println(a);
    }

    public void ciz() {
    }

    public void pixel(String name, int x, int y) {
        System.out.println(name + " : " + "x: " + x + " y: " + y);
    }

    public void pixel(String name, int x, int y, int z) {
        System.out.println(name + " : " + "x: " + x + " y: " + y + " z: " + z);
    }
}
