package ejercicio1;

public class MotorComun implements Motor {

    @Override
    public String arrancar() {
        return "El motor común ha arrancado.";
    }

    @Override
    public String acelerar() {
        return "El motor común está acelerando.";
    }

    @Override
    public String apagar() {
        return "El motor común se ha apagado.";
    }
}
