package ejercicio1;

public class MotorEconomico implements Motor {

    @Override
    public String arrancar() {
        return "Motor económico arrancado.";
    }

    @Override
    public String acelerar() {
        return "Motor económico acelerando.";
    }

    @Override
    public String apagar() {
        return "Motor económico apagado.";
    }
}
