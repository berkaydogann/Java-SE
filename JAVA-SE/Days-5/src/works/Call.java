package works;

public class Call {
    int status = 0;
    double a, b = 0;

    public Call(int a, int b) {
        status = 1;
        this.a = a;
        this.b = b;
    }

    public Call(int a) {
        status = 2;
        this.a = a;
    }

    public Call(double a) {
        status = 3;
        this.a = a;
    }

    public double action() {
        double end = 0;
        switch (status) {
            case 1:
                end = a + b;
                break;
            case 2:
                end = Math.pow(a, 2);
                break;
            case 3:
                end = Math.PI * Math.pow(a, 2);
                break;

        }
        return end;
    }
}
