package ejercicio1;

import java.util.List;

public class Sistema {
    private List<Motor> motores;

    public Sistema(List<Motor> motores) {
        this.motores = motores;
    }

    public void iniciarMotores() {
        for (Motor motor : motores) {
            System.out.println(motor.arrancar());
        }
    }

    public void acelerarMotores() {
        for (Motor motor : motores) {
            System.out.println(motor.acelerar());
        }
    }

    public void apagarMotores() {
        for (Motor motor : motores) {
            System.out.println(motor.apagar());
        }
    }

}
