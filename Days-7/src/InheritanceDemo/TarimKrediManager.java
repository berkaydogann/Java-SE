package InheritanceDemo;

public class TarimKrediManager extends BaseKrediManager {
    @Override
    public void hesapla() {
        System.out.println("Tarım kredisi hesaplandi.");
    }
}
