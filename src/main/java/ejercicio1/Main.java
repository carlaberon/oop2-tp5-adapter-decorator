package ejercicio1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var motorComun = new MotorComun();
        var motorEconomico = new MotorEconomico();
        var adaptador = new MotorAdapter(new MotorElectrico());
        Sistema sistema = new Sistema(List.of(motorComun, motorEconomico, adaptador));
        sistema.iniciarMotores();
        sistema.acelerarMotores();
        sistema.acelerarMotores();
    }
}
